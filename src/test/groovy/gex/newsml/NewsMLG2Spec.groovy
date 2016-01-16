package gex.newsml

import gex.newsml.g2.*
import spock.lang.*

class NewsMLG2Spec extends Specification {

	def 'We should be able to parse newsml g2 content'() {
		when:
			NewsMessage newsMessage = NewsMLTool.parseG2Message(getClass().getResourceAsStream('/201601026085EY-MIDEAST-CRISISSYRIA_FIGHTERS.xml'))

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
			def remoteContent = video.contentSet.inlineXMLOrInlineDataOrRemoteContent.grep { it instanceof RemoteContentPropType }.collect { it.reutersAltId }.flatten().first()


		then:
			remoteContent.present
			remoteContent.value == '201601026085WD-MIDEAST-CRISISSYRIA_FIGHTERS.mpg'
	}
}
