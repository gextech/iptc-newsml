
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
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="print"/>
 *             &lt;enumeration value="audio"/>
 *             &lt;enumeration value="video"/>
 *             &lt;enumeration value="web"/>
 *             &lt;enumeration value="appliance"/>
 *             &lt;enumeration value="other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="item-length" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit-of-measure" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="date.publication" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="issn" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="volume" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="issue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="edition.name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="edition.area" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="position.section" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="position.sequence" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ex-ref" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "pubdata")
@ToString
public class Pubdata {

	@XmlAttribute(name = "type")
	protected String type;
	@XmlAttribute(name = "item-length")
	protected String itemLength;
	@XmlAttribute(name = "unit-of-measure")
	protected String unitOfMeasure;
	@XmlAttribute(name = "date.publication")
	protected String datePublication;
	@XmlAttribute(name = "name")
	protected String name;
	@XmlAttribute(name = "issn")
	protected String issn;
	@XmlAttribute(name = "volume")
	protected String volume;
	@XmlAttribute(name = "number")
	protected String number;
	@XmlAttribute(name = "issue")
	protected String issue;
	@XmlAttribute(name = "edition.name")
	protected String editionName;
	@XmlAttribute(name = "edition.area")
	protected String editionArea;
	@XmlAttribute(name = "position.section")
	protected String positionSection;
	@XmlAttribute(name = "position.sequence")
	protected String positionSequence;
	@XmlAttribute(name = "ex-ref")
	protected String exRef;
	@XmlAttribute(name = "id")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	@XmlSchemaType(name = "ID")
	protected String id;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value) {
		this.type = value;
	}

	/**
	 * Gets the value of the itemLength property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getItemLength() {
		return itemLength;
	}

	/**
	 * Sets the value of the itemLength property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setItemLength(String value) {
		this.itemLength = value;
	}

	/**
	 * Gets the value of the unitOfMeasure property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	/**
	 * Sets the value of the unitOfMeasure property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUnitOfMeasure(String value) {
		this.unitOfMeasure = value;
	}

	/**
	 * Gets the value of the datePublication property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDatePublication() {
		return datePublication;
	}

	/**
	 * Sets the value of the datePublication property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDatePublication(String value) {
		this.datePublication = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the issn property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIssn() {
		return issn;
	}

	/**
	 * Sets the value of the issn property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIssn(String value) {
		this.issn = value;
	}

	/**
	 * Gets the value of the volume property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVolume() {
		return volume;
	}

	/**
	 * Sets the value of the volume property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVolume(String value) {
		this.volume = value;
	}

	/**
	 * Gets the value of the number property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Sets the value of the number property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNumber(String value) {
		this.number = value;
	}

	/**
	 * Gets the value of the issue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIssue() {
		return issue;
	}

	/**
	 * Sets the value of the issue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIssue(String value) {
		this.issue = value;
	}

	/**
	 * Gets the value of the editionName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEditionName() {
		return editionName;
	}

	/**
	 * Sets the value of the editionName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEditionName(String value) {
		this.editionName = value;
	}

	/**
	 * Gets the value of the editionArea property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEditionArea() {
		return editionArea;
	}

	/**
	 * Sets the value of the editionArea property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEditionArea(String value) {
		this.editionArea = value;
	}

	/**
	 * Gets the value of the positionSection property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPositionSection() {
		return positionSection;
	}

	/**
	 * Sets the value of the positionSection property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPositionSection(String value) {
		this.positionSection = value;
	}

	/**
	 * Gets the value of the positionSequence property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPositionSequence() {
		return positionSequence;
	}

	/**
	 * Sets the value of the positionSequence property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPositionSequence(String value) {
		this.positionSequence = value;
	}

	/**
	 * Gets the value of the exRef property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExRef() {
		return exRef;
	}

	/**
	 * Sets the value of the exRef property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExRef(String value) {
		this.exRef = value;
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
