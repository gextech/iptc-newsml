
package gex.newsml.nitf;

import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attGroup ref="{http://iptc.org/std/NITF/2006-10-18/}globalNITFAttributes"/>
 *       &lt;attribute name="iso-cc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="state-prov" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="county-dist" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "evloc")
@ToString
public class Evloc {

	@XmlAttribute(name = "iso-cc")
	protected String isoCc;
	@XmlAttribute(name = "state-prov")
	protected String stateProv;
	@XmlAttribute(name = "county-dist")
	protected String countyDist;
	@XmlAttribute(name = "city")
	protected String city;
	@XmlAttribute(name = "id")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	@XmlSchemaType(name = "ID")
	protected String id;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the isoCc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIsoCc() {
		return isoCc;
	}

	/**
	 * Sets the value of the isoCc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIsoCc(String value) {
		this.isoCc = value;
	}

	/**
	 * Gets the value of the stateProv property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStateProv() {
		return stateProv;
	}

	/**
	 * Sets the value of the stateProv property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStateProv(String value) {
		this.stateProv = value;
	}

	/**
	 * Gets the value of the countyDist property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCountyDist() {
		return countyDist;
	}

	/**
	 * Sets the value of the countyDist property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCountyDist(String value) {
		this.countyDist = value;
	}

	/**
	 * Gets the value of the city property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the value of the city property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCity(String value) {
		this.city = value;
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
