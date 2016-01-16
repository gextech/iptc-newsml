
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
 *       &lt;attribute name="series.name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="series.part" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="0" />
 *       &lt;attribute name="series.totalpart" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="0" />
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
@XmlRootElement(name = "series")
@ToString
public class Series {

	@XmlAttribute(name = "series.name")
	protected String seriesName;
	@XmlAttribute(name = "series.part")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NMTOKEN")
	protected String seriesPart;
	@XmlAttribute(name = "series.totalpart")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NMTOKEN")
	protected String seriesTotalpart;
	@XmlAttribute(name = "id")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	@XmlSchemaType(name = "ID")
	protected String id;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the seriesName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSeriesName() {
		return seriesName;
	}

	/**
	 * Sets the value of the seriesName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSeriesName(String value) {
		this.seriesName = value;
	}

	/**
	 * Gets the value of the seriesPart property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSeriesPart() {
		if (seriesPart == null) {
			return "0";
		} else {
			return seriesPart;
		}
	}

	/**
	 * Sets the value of the seriesPart property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSeriesPart(String value) {
		this.seriesPart = value;
	}

	/**
	 * Gets the value of the seriesTotalpart property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSeriesTotalpart() {
		if (seriesTotalpart == null) {
			return "0";
		} else {
			return seriesTotalpart;
		}
	}

	/**
	 * Sets the value of the seriesTotalpart property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSeriesTotalpart(String value) {
		this.seriesTotalpart = value;
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
