
package gex.newsml.nitf;

import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}rights.owner"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}rights.startdate"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}rights.enddate"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}rights.agent"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}rights.geography"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}rights.type"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}rights.limitations"/>
 *       &lt;/choice>
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
@XmlType(name = "", propOrder = { "content" })
@XmlRootElement(name = "rights")
@ToString
public class Rights {

	@XmlElementRefs({
			@XmlElementRef(name = "rights.enddate", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = RightsEnddate.class, required = false),
			@XmlElementRef(name = "rights.startdate", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = RightsStartdate.class, required = false),
			@XmlElementRef(name = "rights.agent", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = RightsAgent.class, required = false),
			@XmlElementRef(name = "rights.owner", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = RightsOwner.class, required = false),
			@XmlElementRef(name = "rights.type", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = RightsType.class, required = false),
			@XmlElementRef(name = "rights.limitations", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = RightsLimitations.class, required = false),
			@XmlElementRef(name = "rights.geography", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = RightsGeography.class, required = false) })
	@XmlMixed
	protected List<Object> content;
	@XmlAttribute(name = "id")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	@XmlSchemaType(name = "ID")
	protected String id;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the content property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the content property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getContent().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link RightsEnddate } {@link RightsStartdate } {@link RightsAgent }
	 * {@link RightsOwner } {@link RightsType } {@link RightsLimitations }
	 * {@link String } {@link RightsGeography }
	 * 
	 * 
	 */
	public List<Object> getContent() {
		if (content == null) {
			content = new ArrayList<Object>();
		}
		return this.content;
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
