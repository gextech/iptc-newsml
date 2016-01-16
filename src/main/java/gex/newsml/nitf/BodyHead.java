
package gex.newsml.nitf;

import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

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
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}hedline" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}rights" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}byline" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}distributor" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}dateline" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}abstract" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}series" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "hedline", "note", "rights", "byline", "distributor", "dateline", "_abstract",
		"series", "any" })
@XmlRootElement(name = "body.head")
@ToString
public class BodyHead {

	protected List<Hedline> hedline;
	protected List<Note> note;
	protected Rights rights;
	protected List<Byline> byline;
	protected Distributor distributor;
	protected List<Dateline> dateline;
	@XmlElement(name = "abstract")
	protected List<Abstract> _abstract;
	protected Series series;
	@XmlAnyElement(lax = true)
	protected List<Object> any;
	@XmlAttribute(name = "id")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	@XmlSchemaType(name = "ID")
	protected String id;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the hedline property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the hedline property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getHedline().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Hedline }
	 * 
	 * 
	 */
	public List<Hedline> getHedline() {
		if (hedline == null) {
			hedline = new ArrayList<Hedline>();
		}
		return this.hedline;
	}

	/**
	 * Gets the value of the note property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the note property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getNote().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Note }
	 * 
	 * 
	 */
	public List<Note> getNote() {
		if (note == null) {
			note = new ArrayList<Note>();
		}
		return this.note;
	}

	/**
	 * Gets the value of the rights property.
	 * 
	 * @return possible object is {@link Rights }
	 * 
	 */
	public Rights getRights() {
		return rights;
	}

	/**
	 * Sets the value of the rights property.
	 * 
	 * @param value
	 *            allowed object is {@link Rights }
	 * 
	 */
	public void setRights(Rights value) {
		this.rights = value;
	}

	/**
	 * Gets the value of the byline property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the byline property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getByline().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Byline }
	 * 
	 * 
	 */
	public List<Byline> getByline() {
		if (byline == null) {
			byline = new ArrayList<Byline>();
		}
		return this.byline;
	}

	/**
	 * Gets the value of the distributor property.
	 * 
	 * @return possible object is {@link Distributor }
	 * 
	 */
	public Distributor getDistributor() {
		return distributor;
	}

	/**
	 * Sets the value of the distributor property.
	 * 
	 * @param value
	 *            allowed object is {@link Distributor }
	 * 
	 */
	public void setDistributor(Distributor value) {
		this.distributor = value;
	}

	/**
	 * Gets the value of the dateline property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the dateline property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDateline().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Dateline
	 * }
	 * 
	 * 
	 */
	public List<Dateline> getDateline() {
		if (dateline == null) {
			dateline = new ArrayList<Dateline>();
		}
		return this.dateline;
	}

	/**
	 * Gets the value of the abstract property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the abstract property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAbstract().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Abstract
	 * }
	 * 
	 * 
	 */
	public List<Abstract> getAbstract() {
		if (_abstract == null) {
			_abstract = new ArrayList<Abstract>();
		}
		return this._abstract;
	}

	/**
	 * Gets the value of the series property.
	 * 
	 * @return possible object is {@link Series }
	 * 
	 */
	public Series getSeries() {
		return series;
	}

	/**
	 * Sets the value of the series property.
	 * 
	 * @param value
	 *            allowed object is {@link Series }
	 * 
	 */
	public void setSeries(Series value) {
		this.series = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Object }
	 * {@link Element }
	 * 
	 * 
	 */
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<Object>();
		}
		return this.any;
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
