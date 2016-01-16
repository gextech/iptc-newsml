package gex.newsml

import javax.xml.transform.dom.DOMSource
import javax.xml.transform.*
import gex.newsml.g2.*
import spock.lang.*
import javax.xml.bind.*
import javax.xml.transform.stream.*

import spock.lang.*

class NewsMLG2Spec extends Specification {

  def 'We should be able to parse newsml g2 content'() {
    setup:
      JAXBContext jc = JAXBContext.newInstance('gex.newsml.g2')
      Unmarshaller unmarshaller = jc.createUnmarshaller()
      StreamSource streamSource = new StreamSource(getClass().getResourceAsStream('/201601026085EY-MIDEAST-CRISISSYRIA_FIGHTERS.xml'))

    when:
      NewsMessage newsMessage = unmarshaller.unmarshal(streamSource, NewsMessage).value


    then:
			newsMessage
			newsMessage.itemSet.any.size() == 3

		when:
			List videos = newsMessage.itemSet.any.grep {
				it.itemMeta.itemClass.qcode == 'icls:video'
			}

		then:
			videos.size() == 1

		when:
			def video = videos.first()
			def remoteContent = video.contentSet.inlineXMLOrInlineDataOrRemoteContent.grep {
				it instanceof RemoteContentPropType
			}.collect {
				it.reutersAltId
			}.flatten().first()


		then:
			remoteContent.present
			remoteContent.value == '201601026085WD-MIDEAST-CRISISSYRIA_FIGHTERS.mpg'

  }

}
