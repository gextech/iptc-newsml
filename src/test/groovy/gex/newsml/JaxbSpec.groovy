package gex.newsml

import javax.xml.transform.dom.DOMSource
import javax.xml.transform.*
import gex.newsml.v12.NewsML
import gex.newsml.nitf.Nitf
import spock.lang.*
import javax.xml.bind.*
import javax.xml.transform.stream.*

class JaxbSpec extends Specification {

  @Unroll
  def 'We can parse #file'() {
    expect:
      JAXBContext jc = JAXBContext.newInstance('gex.newsml.v12')
      Unmarshaller unmarshaller = jc.createUnmarshaller()
      StreamSource streamSource = new StreamSource(getClass().getResourceAsStream(file))
      NewsML newsItem = unmarshaller.unmarshal(streamSource, NewsML).value
      newsItem != null

    where:
      file << ['/AFP_751HA.xml', '/BAS-Y-MUNDO-MXC_20160116_1402.XML', 'DV2209430.xml']
	}

  def 'Test afp file'() {
    setup:
      JAXBContext nitfJc = JAXBContext.newInstance('gex.newsml.nitf')
      Unmarshaller nitfUnmarshaller = nitfJc.createUnmarshaller()

      JAXBContext jc = JAXBContext.newInstance('gex.newsml.v12')
      Unmarshaller unmarshaller = jc.createUnmarshaller()
      StreamSource streamSource = new StreamSource(getClass().getResourceAsStream('/AFP_751HA.xml'))

    when:
      JAXBElement<NewsML> element = unmarshaller.unmarshal(streamSource, NewsML)
      NewsML item = element.value

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
      def document = nitfItem.ownerDocument
      String string = documentToString(document)
      streamSource = new StreamSource(new StringReader(string))

      Nitf nitf = nitfUnmarshaller.unmarshal(streamSource, Nitf).value

    then:
      nitf
      nitf.body

  }

  def 'Test invalid file'() {
    setup:
      JAXBContext jc = JAXBContext.newInstance('gex.newsml.v12')
      Unmarshaller unmarshaller = jc.createUnmarshaller()

    when:
      unmarshaller.unmarshal(getClass().getResourceAsStream('/invalid.file'))

    then:
      thrown(UnmarshalException)
  }

  private String documentToString(def doc) {
    DOMSource domSource = new DOMSource(doc)
    StringWriter writer = new StringWriter()
    StreamResult result = new StreamResult(writer)
    TransformerFactory tf = TransformerFactory.newInstance()
    Transformer transformer = tf.newTransformer()
    transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8")
    transformer.setOutputProperty(OutputKeys.INDENT, "yes")
    transformer.transform(domSource, result)
    writer.flush()
    writer.toString()
  }

}
