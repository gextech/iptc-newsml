package gex.newsml;

import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import gex.newsml.g2.NewsMessage;
import gex.newsml.nitf.Nitf;
import gex.newsml.v12.NewsML;

public class NewsMLTool {

	public static NewsMessage parseG2Message(InputStream inputStream) throws NewsMLException {
		try {
			JAXBContext jc = JAXBContext.newInstance("gex.newsml.g2");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			StreamSource source = new StreamSource(inputStream);
			return unmarshaller.unmarshal(source, NewsMessage.class).getValue();
		} catch(JAXBException ex) {
			throw new NewsMLException("Cannot parse input as NewsML G2", ex);
		}
	}

	public static NewsML parseV12Message(InputStream inputStream) throws NewsMLException {
		try {
			JAXBContext jc = JAXBContext.newInstance("gex.newsml.v12");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			StreamSource source = new StreamSource(inputStream);

			return unmarshaller.unmarshal(source, NewsML.class).getValue();
		} catch(JAXBException ex) {
			throw new NewsMLException("Cannot parse input as NewsML 1.2", ex);
		}
	}

	public static Nitf elementToNitf(Element element) throws NewsMLException {
		try {
			JAXBContext jc = JAXBContext.newInstance("gex.newsml.nitf");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			Marshaller marshaller = jc.createMarshaller();

			Document doc = element.getOwnerDocument();
			DOMSource domSource = new DOMSource(doc);
			StringWriter writer = new StringWriter();
			StreamResult result = new StreamResult(writer);

			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();

			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");

			transformer.transform(domSource, result);
			writer.flush();
			String sourceNitf = writer.toString();

			StreamSource source = new StreamSource(new StringReader(sourceNitf));
			return unmarshaller.unmarshal(source, Nitf.class).getValue();
		} catch(JAXBException ex) {
			throw new NewsMLException("Cannot parse input as NITF", ex);
		} catch(TransformerException ex) {
			throw new NewsMLException("Cannot convert input to XML", ex);
		}
	}
}
