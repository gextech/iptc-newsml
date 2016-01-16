
package gex.newsml.nitf;

import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}person"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}function" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}care.of" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/NITF/2006-10-18/}globalNITFAttributes"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "person", "function", "careOf" })
@XmlRootElement(name = "addressee")
@ToString
public class Addressee {

	@XmlElement(required = true)
	protected Person person;
	protected Function function;
	@XmlElement(name = "care.of")
	protected CareOf careOf;
	@XmlAttribute(name = "id")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	@XmlSchemaType(name = "ID")
	protected String id;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the person property.
	 * 
	 * @return possible object is {@link Person }
	 * 
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * Sets the value of the person property.
	 * 
	 * @param value
	 *            allowed object is {@link Person }
	 * 
	 */
	public void setPerson(Person value) {
		this.person = value;
	}

	/**
	 * Gets the value of the function property.
	 * 
	 * @return possible object is {@link Function }
	 * 
	 */
	public Function getFunction() {
		return function;
	}

	/**
	 * Sets the value of the function property.
	 * 
	 * @param value
	 *            allowed object is {@link Function }
	 * 
	 */
	public void setFunction(Function value) {
		this.function = value;
	}

	/**
	 * Gets the value of the careOf property.
	 * 
	 * @return possible object is {@link CareOf }
	 * 
	 */
	public CareOf getCareOf() {
		return careOf;
	}

	/**
	 * Sets the value of the careOf property.
	 * 
	 * @param value
	 *            allowed object is {@link CareOf }
	 * 
	 */
	public void setCareOf(CareOf value) {
		this.careOf = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed
	 * property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string
	 * value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by
	 * updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}
