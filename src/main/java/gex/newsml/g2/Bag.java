
package gex.newsml.g2;

import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 *         &lt;element name="bit" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}QCodePropType">
 *                 &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}quantifyAttributes"/>
 *                 &lt;attribute name="type" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *                 &lt;attribute name="typeuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *                 &lt;attribute name="significance" type="{http://iptc.org/std/nar/2006-10-01/}Int100Type" />
 *                 &lt;anyAttribute processContents='lax' namespace='##other'/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}i18nAttributes"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "bit" })
@XmlRootElement(name = "bag")
@ToString
public class Bag {

	@XmlElement(required = true)
	protected List<Bag.Bit> bit;
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
	@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
	protected String lang;
	@XmlAttribute(name = "dir")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String dir;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the bit property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the bit property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getBit().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Bag.Bit }
	 * 
	 * 
	 */
	public List<Bag.Bit> getBit() {
		if (bit == null) {
			bit = new ArrayList<Bag.Bit>();
		}
		return this.bit;
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

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}QCodePropType">
	 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}quantifyAttributes"/>
	 *       &lt;attribute name="type" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
	 *       &lt;attribute name="typeuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
	 *       &lt;attribute name="significance" type="{http://iptc.org/std/nar/2006-10-01/}Int100Type" />
	 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
	 *     &lt;/extension>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	@ToString
	public static class Bit extends QCodePropType {

		@XmlAttribute(name = "type")
		protected String type;
		@XmlAttribute(name = "typeuri")
		protected String typeuri;
		@XmlAttribute(name = "significance")
		protected Integer significance;
		@XmlAttribute(name = "confidence")
		protected Integer confidence;
		@XmlAttribute(name = "relevance")
		protected Integer relevance;
		@XmlAttribute(name = "derivedfrom")
		protected List<String> derivedfrom;

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
		 * Gets the value of the typeuri property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTypeuri() {
			return typeuri;
		}

		/**
		 * Sets the value of the typeuri property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTypeuri(String value) {
			this.typeuri = value;
		}

		/**
		 * Gets the value of the significance property.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getSignificance() {
			return significance;
		}

		/**
		 * Sets the value of the significance property.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setSignificance(Integer value) {
			this.significance = value;
		}

		/**
		 * Gets the value of the confidence property.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getConfidence() {
			return confidence;
		}

		/**
		 * Sets the value of the confidence property.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setConfidence(Integer value) {
			this.confidence = value;
		}

		/**
		 * Gets the value of the relevance property.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getRelevance() {
			return relevance;
		}

		/**
		 * Sets the value of the relevance property.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setRelevance(Integer value) {
			this.relevance = value;
		}

		/**
		 * Gets the value of the derivedfrom property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the derivedfrom property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getDerivedfrom().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link String }
		 * 
		 * 
		 */
		public List<String> getDerivedfrom() {
			if (derivedfrom == null) {
				derivedfrom = new ArrayList<String>();
			}
			return this.derivedfrom;
		}

	}

}
