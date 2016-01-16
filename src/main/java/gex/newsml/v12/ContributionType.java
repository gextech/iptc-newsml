
package gex.newsml.v12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import lombok.ToString;

/**
 * The contribution of a Party in the scope of the creation or the modification
 * of a news object.
 * 
 * <p>
 * Java class for ContributionType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ContributionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContributionType")
@ToString
public class ContributionType {

	@XmlAttribute(name = "Duid")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	@XmlSchemaType(name = "ID")
	protected String duid;
	@XmlAttribute(name = "Euid")
	protected String euid;
	@XmlAttribute(name = "FormalName", required = true)
	protected String formalName;
	@XmlAttribute(name = "Vocabulary")
	protected String vocabulary;
	@XmlAttribute(name = "Scheme")
	protected String scheme;

	/**
	 * Gets the value of the duid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDuid() {
		return duid;
	}

	/**
	 * Sets the value of the duid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDuid(String value) {
		this.duid = value;
	}

	/**
	 * Gets the value of the euid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEuid() {
		return euid;
	}

	/**
	 * Sets the value of the euid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEuid(String value) {
		this.euid = value;
	}

	/**
	 * Gets the value of the formalName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFormalName() {
		return formalName;
	}

	/**
	 * Sets the value of the formalName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFormalName(String value) {
		this.formalName = value;
	}

	/**
	 * Gets the value of the vocabulary property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVocabulary() {
		return vocabulary;
	}

	/**
	 * Sets the value of the vocabulary property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVocabulary(String value) {
		this.vocabulary = value;
	}

	/**
	 * Gets the value of the scheme property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getScheme() {
		return scheme;
	}

	/**
	 * Sets the value of the scheme property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setScheme(String value) {
		this.scheme = value;
	}

}
