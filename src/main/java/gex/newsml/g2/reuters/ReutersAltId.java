package gex.newsml.g2.reuters;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import gex.newsml.g2.AltId;

import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "altId", namespace = "http://www.reuters.com/ns/2003/08/content")
@ToString
public class ReutersAltId extends AltId {

	@XmlAttribute(name = "isPresent")
	protected boolean present;

	/**
	 * @return the present
	 */
	public boolean isPresent() {
		return present;
	}

	/**
	 * @param present
	 *            the present to set
	 */
	public void setPresent(boolean present) {
		this.present = present;
	}

}
