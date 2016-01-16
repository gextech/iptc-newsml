
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
 *         &lt;element name="founded" type="{http://iptc.org/std/nar/2006-10-01/}TruncatedDateTimePropType" minOccurs="0"/>
 *         &lt;element name="dissolved" type="{http://iptc.org/std/nar/2006-10-01/}TruncatedDateTimePropType" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="location" type="{http://iptc.org/std/nar/2006-10-01/}FlexLocationPropType"/>
 *           &lt;element name="contactInfo" type="{http://iptc.org/std/nar/2006-10-01/}ContactInfoType"/>
 *           &lt;element name="hasInstrument">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *                   &lt;attribute name="symbol" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="symbolsrc" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *                   &lt;attribute name="symbolsrcuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *                   &lt;attribute name="market" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *                   &lt;attribute name="marketuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *                   &lt;attribute name="marketlabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="marketlabelsrc" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *                   &lt;attribute name="marketlabelsrcuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *                   &lt;attribute name="type" type="{http://iptc.org/std/nar/2006-10-01/}QCodeListType" />
 *                   &lt;attribute name="typeuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIListType" />
 *                   &lt;attribute name="rank" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                   &lt;anyAttribute namespace='##other'/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "founded", "dissolved", "locationOrContactInfoOrHasInstrument", "any" })
@XmlRootElement(name = "organisationDetails")
@ToString
public class OrganisationDetails {

	protected TruncatedDateTimePropType founded;
	protected TruncatedDateTimePropType dissolved;
	@XmlElements({ @XmlElement(name = "location", type = FlexLocationPropType.class),
			@XmlElement(name = "contactInfo", type = ContactInfoType.class),
			@XmlElement(name = "hasInstrument", type = OrganisationDetails.HasInstrument.class) })
	protected List<Object> locationOrContactInfoOrHasInstrument;
	@XmlAnyElement(lax = true)
	protected List<Object> any;
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
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the founded property.
	 * 
	 * @return possible object is {@link TruncatedDateTimePropType }
	 * 
	 */
	public TruncatedDateTimePropType getFounded() {
		return founded;
	}

	/**
	 * Sets the value of the founded property.
	 * 
	 * @param value
	 *            allowed object is {@link TruncatedDateTimePropType }
	 * 
	 */
	public void setFounded(TruncatedDateTimePropType value) {
		this.founded = value;
	}

	/**
	 * Gets the value of the dissolved property.
	 * 
	 * @return possible object is {@link TruncatedDateTimePropType }
	 * 
	 */
	public TruncatedDateTimePropType getDissolved() {
		return dissolved;
	}

	/**
	 * Sets the value of the dissolved property.
	 * 
	 * @param value
	 *            allowed object is {@link TruncatedDateTimePropType }
	 * 
	 */
	public void setDissolved(TruncatedDateTimePropType value) {
		this.dissolved = value;
	}

	/**
	 * Gets the value of the locationOrContactInfoOrHasInstrument property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the locationOrContactInfoOrHasInstrument
	 * property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLocationOrContactInfoOrHasInstrument().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link FlexLocationPropType } {@link ContactInfoType }
	 * {@link OrganisationDetails.HasInstrument }
	 * 
	 * 
	 */
	public List<Object> getLocationOrContactInfoOrHasInstrument() {
		if (locationOrContactInfoOrHasInstrument == null) {
			locationOrContactInfoOrHasInstrument = new ArrayList<Object>();
		}
		return this.locationOrContactInfoOrHasInstrument;
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
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
	 *       &lt;attribute name="symbol" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *       &lt;attribute name="symbolsrc" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
	 *       &lt;attribute name="symbolsrcuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
	 *       &lt;attribute name="market" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
	 *       &lt;attribute name="marketuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
	 *       &lt;attribute name="marketlabel" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *       &lt;attribute name="marketlabelsrc" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
	 *       &lt;attribute name="marketlabelsrcuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
	 *       &lt;attribute name="type" type="{http://iptc.org/std/nar/2006-10-01/}QCodeListType" />
	 *       &lt;attribute name="typeuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIListType" />
	 *       &lt;attribute name="rank" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
	 *       &lt;anyAttribute namespace='##other'/>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	@ToString
	public static class HasInstrument {

		@XmlAttribute(name = "symbol", required = true)
		protected String symbol;
		@XmlAttribute(name = "symbolsrc")
		protected String symbolsrc;
		@XmlAttribute(name = "symbolsrcuri")
		protected String symbolsrcuri;
		@XmlAttribute(name = "market")
		protected String market;
		@XmlAttribute(name = "marketuri")
		protected String marketuri;
		@XmlAttribute(name = "marketlabel")
		protected String marketlabel;
		@XmlAttribute(name = "marketlabelsrc")
		protected String marketlabelsrc;
		@XmlAttribute(name = "marketlabelsrcuri")
		protected String marketlabelsrcuri;
		@XmlAttribute(name = "type")
		protected List<String> type;
		@XmlAttribute(name = "typeuri")
		protected List<String> typeuri;
		@XmlAttribute(name = "rank")
		@XmlSchemaType(name = "nonNegativeInteger")
		protected BigInteger rank;
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
		@XmlAnyAttribute
		private Map<QName, String> otherAttributes = new HashMap<QName, String>();

		/**
		 * Gets the value of the symbol property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSymbol() {
			return symbol;
		}

		/**
		 * Sets the value of the symbol property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSymbol(String value) {
			this.symbol = value;
		}

		/**
		 * Gets the value of the symbolsrc property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSymbolsrc() {
			return symbolsrc;
		}

		/**
		 * Sets the value of the symbolsrc property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSymbolsrc(String value) {
			this.symbolsrc = value;
		}

		/**
		 * Gets the value of the symbolsrcuri property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSymbolsrcuri() {
			return symbolsrcuri;
		}

		/**
		 * Sets the value of the symbolsrcuri property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSymbolsrcuri(String value) {
			this.symbolsrcuri = value;
		}

		/**
		 * Gets the value of the market property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getMarket() {
			return market;
		}

		/**
		 * Sets the value of the market property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setMarket(String value) {
			this.market = value;
		}

		/**
		 * Gets the value of the marketuri property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getMarketuri() {
			return marketuri;
		}

		/**
		 * Sets the value of the marketuri property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setMarketuri(String value) {
			this.marketuri = value;
		}

		/**
		 * Gets the value of the marketlabel property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getMarketlabel() {
			return marketlabel;
		}

		/**
		 * Sets the value of the marketlabel property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setMarketlabel(String value) {
			this.marketlabel = value;
		}

		/**
		 * Gets the value of the marketlabelsrc property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getMarketlabelsrc() {
			return marketlabelsrc;
		}

		/**
		 * Sets the value of the marketlabelsrc property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setMarketlabelsrc(String value) {
			this.marketlabelsrc = value;
		}

		/**
		 * Gets the value of the marketlabelsrcuri property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getMarketlabelsrcuri() {
			return marketlabelsrcuri;
		}

		/**
		 * Sets the value of the marketlabelsrcuri property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setMarketlabelsrcuri(String value) {
			this.marketlabelsrcuri = value;
		}

		/**
		 * Gets the value of the type property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the type property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getType().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link String }
		 * 
		 * 
		 */
		public List<String> getType() {
			if (type == null) {
				type = new ArrayList<String>();
			}
			return this.type;
		}

		/**
		 * Gets the value of the typeuri property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the typeuri property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getTypeuri().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link String }
		 * 
		 * 
		 */
		public List<String> getTypeuri() {
			if (typeuri == null) {
				typeuri = new ArrayList<String>();
			}
			return this.typeuri;
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
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
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
		 * Objects of the following type(s) are allowed in the list
		 * {@link String }
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
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
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
		 * Objects of the following type(s) are allowed in the list
		 * {@link String }
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
		 * Gets a map that contains attributes that aren't bound to any typed
		 * property on this class.
		 * 
		 * <p>
		 * the map is keyed by the name of the attribute and the value is the
		 * string value of the attribute.
		 * 
		 * the map returned by this method is live, and you can add new
		 * attribute by updating the map directly. Because of this design,
		 * there's no setter.
		 * 
		 * 
		 * @return always non-null
		 */
		public Map<QName, String> getOtherAttributes() {
			return otherAttributes;
		}

	}

}
