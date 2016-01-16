
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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * The PCL-type of a link from the current Item to a target Item or Web resource
 * 
 * <p>
 * Java class for Link1Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Link1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}i18nAttributes"/>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}deprecatedLinkAttributes"/>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}targetResourceAttributes"/>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}timeValidityAttributes"/>
 *       &lt;attribute name="rel" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *       &lt;attribute name="reluri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *       &lt;attribute name="rank" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Link1Type", propOrder = { "any" })
@ToString
public class Link1Type {

	@XmlAnyElement(lax = true)
	protected List<Object> any;
	@XmlAttribute(name = "rel")
	protected String rel;
	@XmlAttribute(name = "reluri")
	protected String reluri;
	@XmlAttribute(name = "rank")
	@XmlSchemaType(name = "nonNegativeInteger")
	protected BigInteger rank;
	@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
	protected String lang;
	@XmlAttribute(name = "dir")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String dir;
	@XmlAttribute(name = "id")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	@XmlSchemaType(name = "ID")
	protected String id;
	@XmlAttribute(name = "creator")
	protected String creator;
	@XmlAttribute(name = "creatoruri")
	protected String creatoruri;
	@XmlAttribute(name = "modified")
	protected String modified;
	@XmlAttribute(name = "custom")
	protected Boolean custom;
	@XmlAttribute(name = "how")
	protected String how;
	@XmlAttribute(name = "howuri")
	protected String howuri;
	@XmlAttribute(name = "why")
	protected String why;
	@XmlAttribute(name = "whyuri")
	protected String whyuri;
	@XmlAttribute(name = "pubconstraint")
	protected List<String> pubconstraint;
	@XmlAttribute(name = "pubconstrainturi")
	protected List<String> pubconstrainturi;
	@XmlAttribute(name = "guidref")
	protected String guidref;
	@XmlAttribute(name = "hreftype")
	protected String hreftype;
	@XmlAttribute(name = "href")
	protected String href;
	@XmlAttribute(name = "residref")
	protected String residref;
	@XmlAttribute(name = "version")
	@XmlSchemaType(name = "positiveInteger")
	protected BigInteger version;
	@XmlAttribute(name = "persistidref")
	protected String persistidref;
	@XmlAttribute(name = "contenttype")
	protected String contenttype;
	@XmlAttribute(name = "contenttypevariant")
	protected String contenttypevariant;
	@XmlAttribute(name = "format")
	protected String format;
	@XmlAttribute(name = "formaturi")
	protected String formaturi;
	@XmlAttribute(name = "size")
	@XmlSchemaType(name = "nonNegativeInteger")
	protected BigInteger size;
	@XmlAttribute(name = "title")
	protected String title;
	@XmlAttribute(name = "validfrom")
	protected String validfrom;
	@XmlAttribute(name = "validto")
	protected String validto;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
	 * Gets the value of the rel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRel() {
		return rel;
	}

	/**
	 * Sets the value of the rel property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRel(String value) {
		this.rel = value;
	}

	/**
	 * Gets the value of the reluri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReluri() {
		return reluri;
	}

	/**
	 * Sets the value of the reluri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReluri(String value) {
		this.reluri = value;
	}

	/**
	 * Gets the value of the rank property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getRank() {
		return rank;
	}

	/**
	 * Sets the value of the rank property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setRank(BigInteger value) {
		this.rank = value;
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
	 * Gets the value of the creator property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * Sets the value of the creator property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreator(String value) {
		this.creator = value;
	}

	/**
	 * Gets the value of the creatoruri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreatoruri() {
		return creatoruri;
	}

	/**
	 * Sets the value of the creatoruri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreatoruri(String value) {
		this.creatoruri = value;
	}

	/**
	 * Gets the value of the modified property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModified() {
		return modified;
	}

	/**
	 * Sets the value of the modified property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setModified(String value) {
		this.modified = value;
	}

	/**
	 * Gets the value of the custom property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isCustom() {
		return custom;
	}

	/**
	 * Sets the value of the custom property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setCustom(Boolean value) {
		this.custom = value;
	}

	/**
	 * Gets the value of the how property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHow() {
		return how;
	}

	/**
	 * Sets the value of the how property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHow(String value) {
		this.how = value;
	}

	/**
	 * Gets the value of the howuri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHowuri() {
		return howuri;
	}

	/**
	 * Sets the value of the howuri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHowuri(String value) {
		this.howuri = value;
	}

	/**
	 * Gets the value of the why property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWhy() {
		return why;
	}

	/**
	 * Sets the value of the why property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWhy(String value) {
		this.why = value;
	}

	/**
	 * Gets the value of the whyuri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWhyuri() {
		return whyuri;
	}

	/**
	 * Sets the value of the whyuri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWhyuri(String value) {
		this.whyuri = value;
	}

	/**
	 * Gets the value of the pubconstraint property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the pubconstraint property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPubconstraint().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getPubconstraint() {
		if (pubconstraint == null) {
			pubconstraint = new ArrayList<String>();
		}
		return this.pubconstraint;
	}

	/**
	 * Gets the value of the pubconstrainturi property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the pubconstrainturi property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPubconstrainturi().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getPubconstrainturi() {
		if (pubconstrainturi == null) {
			pubconstrainturi = new ArrayList<String>();
		}
		return this.pubconstrainturi;
	}

	/**
	 * Gets the value of the guidref property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGuidref() {
		return guidref;
	}

	/**
	 * Sets the value of the guidref property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGuidref(String value) {
		this.guidref = value;
	}

	/**
	 * Gets the value of the hreftype property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHreftype() {
		return hreftype;
	}

	/**
	 * Sets the value of the hreftype property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHreftype(String value) {
		this.hreftype = value;
	}

	/**
	 * Gets the value of the href property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHref() {
		return href;
	}

	/**
	 * Sets the value of the href property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHref(String value) {
		this.href = value;
	}

	/**
	 * Gets the value of the residref property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResidref() {
		return residref;
	}

	/**
	 * Sets the value of the residref property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResidref(String value) {
		this.residref = value;
	}

	/**
	 * Gets the value of the version property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getVersion() {
		return version;
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
	 * Gets the value of the persistidref property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPersistidref() {
		return persistidref;
	}

	/**
	 * Sets the value of the persistidref property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPersistidref(String value) {
		this.persistidref = value;
	}

	/**
	 * Gets the value of the contenttype property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContenttype() {
		return contenttype;
	}

	/**
	 * Sets the value of the contenttype property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContenttype(String value) {
		this.contenttype = value;
	}

	/**
	 * Gets the value of the contenttypevariant property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContenttypevariant() {
		return contenttypevariant;
	}

	/**
	 * Sets the value of the contenttypevariant property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContenttypevariant(String value) {
		this.contenttypevariant = value;
	}

	/**
	 * Gets the value of the format property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * Sets the value of the format property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFormat(String value) {
		this.format = value;
	}

	/**
	 * Gets the value of the formaturi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFormaturi() {
		return formaturi;
	}

	/**
	 * Sets the value of the formaturi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFormaturi(String value) {
		this.formaturi = value;
	}

	/**
	 * Gets the value of the size property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getSize() {
		return size;
	}

	/**
	 * Sets the value of the size property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setSize(BigInteger value) {
		this.size = value;
	}

	/**
	 * Gets the value of the title property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the value of the title property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTitle(String value) {
		this.title = value;
	}

	/**
	 * Gets the value of the validfrom property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValidfrom() {
		return validfrom;
	}

	/**
	 * Sets the value of the validfrom property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValidfrom(String value) {
		this.validfrom = value;
	}

	/**
	 * Gets the value of the validto property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValidto() {
		return validto;
	}

	/**
	 * Sets the value of the validto property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValidto(String value) {
		this.validto = value;
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
