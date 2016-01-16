package gex.newsml

import gex.newsml.NewsMLTool
import gex.newsml.v12.NewsML
import gex.newsml.nitf.Nitf
import spock.lang.*

class NewsMLv12Spec extends Specification {

  @Unroll
  def 'We can parse #file'() {
    expect:
		  NewsML newsItem = NewsMLTool.parseV12Message(getClass().getResourceAsStream(file))
      newsItem != null

    where:
      file << ['/AFP_751HA.xml', '/BAS-Y-MUNDO-MXC_20160116_1402.XML', '/DV2209430.xml']
	}

  def 'Test afp file'() {
    when:
      NewsML item = NewsMLTool.parseV12Message(getClass().getResourceAsStream('/AFP_751HA.xml'))

    then:
      item.newsItem.size() == 1
      item.newsItem.first().newsComponent
      item.newsItem.first().newsComponent.newsComponent.any {
        it.contentItem.mediaType.formalName.contains('Text')
      }
      item.newsItem.first().newsComponent.newsComponent.any {
        it.contentItem.mediaType.formalName.contains('Photo')
      }

    when:
      List allItems = item.newsItem.first().newsComponent.newsComponent.collect {
        it.contentItem
      }.flatten()

      List textItems = allItems.grep {
        it.mediaType.formalName == 'Text'
      }

      List photoItems = allItems.grep {
        it.mediaType.formalName == 'Photo'
      }

      def nitfItem = textItems.first().dataContent.content.first()


    then:
      nitfItem.localName == 'nitf'
      photoItems.href.every {
        getClass().getResourceAsStream('/' + it) != null
      }

    when:
      Nitf nitf = NewsMLTool.elementToNitf(nitfItem)

    then:
      nitf
      nitf.body

  }

  def 'Test invalid file'() {
    when:
      NewsMLTool.parseV12Message(getClass().getResourceAsStream('/invalid.file'))

    then:
			thrown(NewsMLException)
  }

}
