
package gex.newsml.g2;

import lombok.ToString;

import java.math.BigInteger;
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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * An abstract class. All G2 items are inherited from this class.
 * 
 * <p>
 * Java class for AnyItemType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AnyItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax' namespace='http://www.w3.org/2000/09/xmldsig#' minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}catalogRef"/>
 *           &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}catalog"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}hopHistory" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}rightsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}itemMeta"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}i18nAttributes"/>
 *       &lt;attribute name="standard" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="standardversion" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9]+\.[0-9]+"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="conformance" type="{http://www.w3.org/2001/XMLSchema}string" default="core" />
 *       &lt;attribute name="guid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnyItemType", propOrder = { "any", "catalogRefOrCatalog", "hopHistory", "rightsInfo", "itemMeta" })
@XmlSeeAlso({ KnowledgeItem.class, ConceptItem.class, NewsItem.class, PackageItem.class, CatalogItem.class,
		PlanningItem.class })
@ToString
public abstract class AnyItemType {

	@XmlAnyElement(lax = true)
	protected Object any;
	@XmlElements({ @XmlElement(name = "catalogRef", type = CatalogRef.class),
			@XmlElement(name = "catalog", type = Catalog.class) })
	protected List<Object> catalogRefOrCatalog;
	protected HopHistory hopHistory;
	protected List<RightsInfoType> rightsInfo;
	@XmlElement(required = true)
	protected ItemMetadataType itemMeta;
	@XmlAttribute(name = "standard", required = true)
	protected String standard;
	@XmlAttribute(name = "standardversion", required = true)
	protected String standardversion;
	@XmlAttribute(name = "conformance")
	protected String conformance;
	@XmlAttribute(name = "guid", required = true)
	protected String guid;
	@XmlAttribute(name = "version")
	@XmlSchemaType(name = "positiveInteger")
	protected BigInteger version;
	@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
	protected String lang;
	@XmlAttribute(name = "dir")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String dir;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the any property.
	 * 
	 * @return possible object is {@link Object } {@link Element }
	 * 
	 */
	public Object getAny() {
		return any;
	}

	/**
	 * Sets the value of the any property.
	 * 
	 * @param value
	 *            allowed object is {@link Object } {@link Element }
	 * 
	 */
	public void setAny(Object value) {
		this.any = value;
	}

	/**
	 * Gets the value of the catalogRefOrCatalog property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the catalogRefOrCatalog property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getCatalogRefOrCatalog().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CatalogRef } {@link Catalog }
	 * 
	 * 
	 */
	public List<Object> getCatalogRefOrCatalog() {
		if (catalogRefOrCatalog == null) {
			catalogRefOrCatalog = new ArrayList<Object>();
		}
		return this.catalogRefOrCatalog;
	}

	/**
	 * Gets the value of the hopHistory property.
	 * 
	 * @return possible object is {@link HopHistory }
	 * 
	 */
	public HopHistory getHopHistory() {
		return hopHistory;
	}

	/**
	 * Sets the value of the hopHistory property.
	 * 
	 * @param value
	 *            allowed object is {@link HopHistory }
	 * 
	 */
	public void setHopHistory(HopHistory value) {
		this.hopHistory = value;
	}

	/**
	 * Gets the value of the rightsInfo property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the rightsInfo property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRightsInfo().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link RightsInfoType }
	 * 
	 * 
	 */
	public List<RightsInfoType> getRightsInfo() {
		if (rightsInfo == null) {
			rightsInfo = new ArrayList<RightsInfoType>();
		}
		return this.rightsInfo;
	}

	/**
	 * Gets the value of the itemMeta property.
	 * 
	 * @return possible object is {@link ItemMetadataType }
	 * 
	 */
	public ItemMetadataType getItemMeta() {
		return itemMeta;
	}

	/**
	 * Sets the value of the itemMeta property.
	 * 
	 * @param value
	 *            allowed object is {@link ItemMetadataType }
	 * 
	 */
	public void setItemMeta(ItemMetadataType value) {
		this.itemMeta = value;
	}

	/**
	 * Gets the value of the standard property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStandard() {
		return standard;
	}

	/**
	 * Sets the value of the standard property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStandard(String value) {
		this.standard = value;
	}

	/**
	 * Gets the value of the standardversion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStandardversion() {
		return standardversion;
	}

	/**
	 * Sets the value of the standardversion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStandardversion(String value) {
		this.standardversion = value;
	}

	/**
	 * Gets the value of the conformance property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConformance() {
		if (conformance == null) {
			return "core";
		} else {
			return conformance;
		}
	}

	/**
	 * Sets the value of the conformance property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConformance(String value) {
		this.conformance = value;
	}

	/**
	 * Gets the value of the guid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGuid() {
		return guid;
	}

	/**
	 * Sets the value of the guid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGuid(String value) {
		this.guid = value;
	}

	/**
	 * Gets the value of the version property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getVersion() {
		if (version == null) {
			return new BigInteger("1");
		} else {
			return version;
		}
	}

	/**
	 * Sets the value of the version property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setVersion(BigInteger value) {
		this.version = value;
	}

	/**
	 * Specifies the language of this property and potentially all descendant
	 * properties. xml:lang values of descendant properties override this value.
	 * Values are determined by Internet BCP 47.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * Sets the value of the lang property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLang(String value) {
		this.lang = value;
	}

	/**
	 * Gets the value of the dir property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDir() {
		return dir;
	}

	/**
	 * Sets the value of the dir property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDir(String value) {
		this.dir = value;
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
