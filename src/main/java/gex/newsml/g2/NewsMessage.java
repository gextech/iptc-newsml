
package gex.newsml.g2;

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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element name="header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sent" type="{http://iptc.org/std/nar/2006-10-01/}DateTimePropType"/>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="catalogRef">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}title" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *                             &lt;attribute name="href" use="required" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *                             &lt;anyAttribute processContents='lax' namespace='##other'/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}catalog"/>
 *                   &lt;/choice>
 *                   &lt;element name="sender" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>StringType">
 *                           &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}qualifyingAttributes"/>
 *                           &lt;anyAttribute processContents='lax' namespace='##other'/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="transmitId" type="{http://iptc.org/std/nar/2006-10-01/}StringType" minOccurs="0"/>
 *                   &lt;element name="priority" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>Int1to9Type">
 *                           &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *                           &lt;anyAttribute processContents='lax' namespace='##other'/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="origin" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>StringType">
 *                           &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}qualifyingAttributes"/>
 *                           &lt;anyAttribute processContents='lax' namespace='##other'/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="timestamp">
 *                       &lt;complexType>
 *                         &lt;simpleContent>
 *                           &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>DateTimePropType">
 *                             &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;anyAttribute processContents='lax' namespace='##other'/>
 *                           &lt;/extension>
 *                         &lt;/simpleContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="destination">
 *                       &lt;complexType>
 *                         &lt;simpleContent>
 *                           &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>StringType">
 *                             &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}qualifyingAttributes"/>
 *                             &lt;anyAttribute processContents='lax' namespace='##other'/>
 *                           &lt;/extension>
 *                         &lt;/simpleContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="channel">
 *                       &lt;complexType>
 *                         &lt;simpleContent>
 *                           &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>StringType">
 *                             &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}qualifyingAttributes"/>
 *                             &lt;attribute name="g2flag" type="{http://www.w3.org/2001/XMLSchema}string" fixed="NMSG" />
 *                             &lt;anyAttribute processContents='lax' namespace='##other'/>
 *                           &lt;/extension>
 *                         &lt;/simpleContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}signal"/>
 *                     &lt;element name="headerExtProperty" type="{http://iptc.org/std/nar/2006-10-01/}Flex2ExtPropType"/>
 *                   &lt;/choice>
 *                   &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *                 &lt;anyAttribute processContents='lax' namespace='##other'/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="itemSet">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' namespace='http://iptc.org/std/nar/2006-10-01/' maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *                 &lt;anyAttribute processContents='lax' namespace='##other'/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "header", "itemSet" })
@XmlRootElement(name = "newsMessage")
@ToString
public class NewsMessage {

	@XmlElement(required = true)
	protected NewsMessage.Header header;
	@XmlElement(required = true)
	protected NewsMessage.ItemSet itemSet;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the header property.
	 * 
	 * @return possible object is {@link NewsMessage.Header }
	 * 
	 */
	public NewsMessage.Header getHeader() {
		return header;
	}

	/**
	 * Sets the value of the header property.
	 * 
	 * @param value
	 *            allowed object is {@link NewsMessage.Header }
	 * 
	 */
	public void setHeader(NewsMessage.Header value) {
		this.header = value;
	}

	/**
	 * Gets the value of the itemSet property.
	 * 
	 * @return possible object is {@link NewsMessage.ItemSet }
	 * 
	 */
	public NewsMessage.ItemSet getItemSet() {
		return itemSet;
	}

	/**
	 * Sets the value of the itemSet property.
	 * 
	 * @param value
	 *            allowed object is {@link NewsMessage.ItemSet }
	 * 
	 */
	public void setItemSet(NewsMessage.ItemSet value) {
		this.itemSet = value;
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
	 *       &lt;sequence>
	 *         &lt;element name="sent" type="{http://iptc.org/std/nar/2006-10-01/}DateTimePropType"/>
	 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *           &lt;element name="catalogRef">
	 *             &lt;complexType>
	 *               &lt;complexContent>
	 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                   &lt;sequence>
	 *                     &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}title" maxOccurs="unbounded" minOccurs="0"/>
	 *                   &lt;/sequence>
	 *                   &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
	 *                   &lt;attribute name="href" use="required" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
	 *                   &lt;anyAttribute processContents='lax' namespace='##other'/>
	 *                 &lt;/restriction>
	 *               &lt;/complexContent>
	 *             &lt;/complexType>
	 *           &lt;/element>
	 *           &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}catalog"/>
	 *         &lt;/choice>
	 *         &lt;element name="sender" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;simpleContent>
	 *               &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>StringType">
	 *                 &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}qualifyingAttributes"/>
	 *                 &lt;anyAttribute processContents='lax' namespace='##other'/>
	 *               &lt;/extension>
	 *             &lt;/simpleContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="transmitId" type="{http://iptc.org/std/nar/2006-10-01/}StringType" minOccurs="0"/>
	 *         &lt;element name="priority" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;simpleContent>
	 *               &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>Int1to9Type">
	 *                 &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
	 *                 &lt;anyAttribute processContents='lax' namespace='##other'/>
	 *               &lt;/extension>
	 *             &lt;/simpleContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="origin" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;simpleContent>
	 *               &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>StringType">
	 *                 &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}qualifyingAttributes"/>
	 *                 &lt;anyAttribute processContents='lax' namespace='##other'/>
	 *               &lt;/extension>
	 *             &lt;/simpleContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *           &lt;element name="timestamp">
	 *             &lt;complexType>
	 *               &lt;simpleContent>
	 *                 &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>DateTimePropType">
	 *                   &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                   &lt;anyAttribute processContents='lax' namespace='##other'/>
	 *                 &lt;/extension>
	 *               &lt;/simpleContent>
	 *             &lt;/complexType>
	 *           &lt;/element>
	 *           &lt;element name="destination">
	 *             &lt;complexType>
	 *               &lt;simpleContent>
	 *                 &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>StringType">
	 *                   &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}qualifyingAttributes"/>
	 *                   &lt;anyAttribute processContents='lax' namespace='##other'/>
	 *                 &lt;/extension>
	 *               &lt;/simpleContent>
	 *             &lt;/complexType>
	 *           &lt;/element>
	 *           &lt;element name="channel">
	 *             &lt;complexType>
	 *               &lt;simpleContent>
	 *                 &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>StringType">
	 *                   &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}qualifyingAttributes"/>
	 *                   &lt;attribute name="g2flag" type="{http://www.w3.org/2001/XMLSchema}string" fixed="NMSG" />
	 *                   &lt;anyAttribute processContents='lax' namespace='##other'/>
	 *                 &lt;/extension>
	 *               &lt;/simpleContent>
	 *             &lt;/complexType>
	 *           &lt;/element>
	 *           &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}signal"/>
	 *           &lt;element name="headerExtProperty" type="{http://iptc.org/std/nar/2006-10-01/}Flex2ExtPropType"/>
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
	@XmlType(name = "", propOrder = { "sent", "catalogRefOrCatalog", "sender", "transmitId", "priority", "origin",
			"timestampOrDestinationOrChannel", "any" })
	@ToString
	public static class Header {

		@XmlElement(required = true)
		protected DateTimePropType sent;
		@XmlElements({ @XmlElement(name = "catalogRef", type = NewsMessage.Header.CatalogRef.class),
				@XmlElement(name = "catalog", type = Catalog.class) })
		protected List<Object> catalogRefOrCatalog;
		protected NewsMessage.Header.Sender sender;
		protected StringType transmitId;
		protected NewsMessage.Header.Priority priority;
		protected NewsMessage.Header.Origin origin;
		@XmlElements({ @XmlElement(name = "timestamp", type = NewsMessage.Header.Timestamp.class),
				@XmlElement(name = "destination", type = NewsMessage.Header.Destination.class),
				@XmlElement(name = "channel", type = NewsMessage.Header.Channel.class),
				@XmlElement(name = "signal", type = Signal.class),
				@XmlElement(name = "headerExtProperty", type = Flex2ExtPropType.class) })
		protected List<Object> timestampOrDestinationOrChannel;
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
		 * Gets the value of the sent property.
		 * 
		 * @return possible object is {@link DateTimePropType }
		 * 
		 */
		public DateTimePropType getSent() {
			return sent;
		}

		/**
		 * Sets the value of the sent property.
		 * 
		 * @param value
		 *            allowed object is {@link DateTimePropType }
		 * 
		 */
		public void setSent(DateTimePropType value) {
			this.sent = value;
		}

		/**
		 * Gets the value of the catalogRefOrCatalog property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
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
		 * {@link NewsMessage.Header.CatalogRef } {@link Catalog }
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
		 * Gets the value of the sender property.
		 * 
		 * @return possible object is {@link NewsMessage.Header.Sender }
		 * 
		 */
		public NewsMessage.Header.Sender getSender() {
			return sender;
		}

		/**
		 * Sets the value of the sender property.
		 * 
		 * @param value
		 *            allowed object is {@link NewsMessage.Header.Sender }
		 * 
		 */
		public void setSender(NewsMessage.Header.Sender value) {
			this.sender = value;
		}

		/**
		 * Gets the value of the transmitId property.
		 * 
		 * @return possible object is {@link StringType }
		 * 
		 */
		public StringType getTransmitId() {
			return transmitId;
		}

		/**
		 * Sets the value of the transmitId property.
		 * 
		 * @param value
		 *            allowed object is {@link StringType }
		 * 
		 */
		public void setTransmitId(StringType value) {
			this.transmitId = value;
		}

		/**
		 * Gets the value of the priority property.
		 * 
		 * @return possible object is {@link NewsMessage.Header.Priority }
		 * 
		 */
		public NewsMessage.Header.Priority getPriority() {
			return priority;
		}

		/**
		 * Sets the value of the priority property.
		 * 
		 * @param value
		 *            allowed object is {@link NewsMessage.Header.Priority }
		 * 
		 */
		public void setPriority(NewsMessage.Header.Priority value) {
			this.priority = value;
		}

		/**
		 * Gets the value of the origin property.
		 * 
		 * @return possible object is {@link NewsMessage.Header.Origin }
		 * 
		 */
		public NewsMessage.Header.Origin getOrigin() {
			return origin;
		}

		/**
		 * Sets the value of the origin property.
		 * 
		 * @param value
		 *            allowed object is {@link NewsMessage.Header.Origin }
		 * 
		 */
		public void setOrigin(NewsMessage.Header.Origin value) {
			this.origin = value;
		}

		/**
		 * Gets the value of the timestampOrDestinationOrChannel property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the timestampOrDestinationOrChannel
		 * property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getTimestampOrDestinationOrChannel().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link NewsMessage.Header.Timestamp }
		 * {@link NewsMessage.Header.Destination }
		 * {@link NewsMessage.Header.Channel } {@link Signal }
		 * {@link Flex2ExtPropType }
		 * 
		 * 
		 */
		public List<Object> getTimestampOrDestinationOrChannel() {
			if (timestampOrDestinationOrChannel == null) {
				timestampOrDestinationOrChannel = new ArrayList<Object>();
			}
			return this.timestampOrDestinationOrChannel;
		}

		/**
		 * Gets the value of the any property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
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
		 * Objects of the following type(s) are allowed in the list
		 * {@link Object } {@link Element }
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

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}title" maxOccurs="unbounded" minOccurs="0"/>
		 *       &lt;/sequence>
		 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
		 *       &lt;attribute name="href" use="required" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
		 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "title" })
		@ToString
		public static class CatalogRef {

			protected List<Label1Type> title;
			@XmlAttribute(name = "href", required = true)
			protected String href;
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
			 * A short natural language name for the catalog.Gets the value of
			 * the title property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the title property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getTitle().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link Label1Type }
			 * 
			 * 
			 */
			public List<Label1Type> getTitle() {
				if (title == null) {
					title = new ArrayList<Label1Type>();
				}
				return this.title;
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
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the pubconstraint property.
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
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the pubconstrainturi property.
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
			 * Gets a map that contains attributes that aren't bound to any
			 * typed property on this class.
			 * 
			 * <p>
			 * the map is keyed by the name of the attribute and the value is
			 * the string value of the attribute.
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

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;simpleContent>
		 *     &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>StringType">
		 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}qualifyingAttributes"/>
		 *       &lt;attribute name="g2flag" type="{http://www.w3.org/2001/XMLSchema}string" fixed="NMSG" />
		 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
		 *     &lt;/extension>
		 *   &lt;/simpleContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		@ToString
		public static class Channel extends StringType {

			@XmlAttribute(name = "g2flag")
			protected String g2Flag;
			@XmlAttribute(name = "qcode")
			protected String qcode;
			@XmlAttribute(name = "uri")
			protected String uri;
			@XmlAttribute(name = "literal")
			protected String literal;
			@XmlAttribute(name = "type")
			protected String type;
			@XmlAttribute(name = "typeuri")
			protected String typeuri;
			@XmlAttribute(name = "role")
			protected String role;
			@XmlAttribute(name = "roleuri")
			protected String roleuri;

			/**
			 * Gets the value of the g2Flag property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getG2Flag() {
				if (g2Flag == null) {
					return "NMSG";
				} else {
					return g2Flag;
				}
			}

			/**
			 * Sets the value of the g2Flag property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setG2Flag(String value) {
				this.g2Flag = value;
			}

			/**
			 * Gets the value of the qcode property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getQcode() {
				return qcode;
			}

			/**
			 * Sets the value of the qcode property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setQcode(String value) {
				this.qcode = value;
			}

			/**
			 * Gets the value of the uri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getUri() {
				return uri;
			}

			/**
			 * Sets the value of the uri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setUri(String value) {
				this.uri = value;
			}

			/**
			 * Gets the value of the literal property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLiteral() {
				return literal;
			}

			/**
			 * Sets the value of the literal property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLiteral(String value) {
				this.literal = value;
			}

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
			 * Gets the value of the role property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getRole() {
				return role;
			}

			/**
			 * Sets the value of the role property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setRole(String value) {
				this.role = value;
			}

			/**
			 * Gets the value of the roleuri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getRoleuri() {
				return roleuri;
			}

			/**
			 * Sets the value of the roleuri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setRoleuri(String value) {
				this.roleuri = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;simpleContent>
		 *     &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>StringType">
		 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}qualifyingAttributes"/>
		 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
		 *     &lt;/extension>
		 *   &lt;/simpleContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		@ToString
		public static class Destination extends StringType {

			@XmlAttribute(name = "qcode")
			protected String qcode;
			@XmlAttribute(name = "uri")
			protected String uri;
			@XmlAttribute(name = "literal")
			protected String literal;
			@XmlAttribute(name = "type")
			protected String type;
			@XmlAttribute(name = "typeuri")
			protected String typeuri;
			@XmlAttribute(name = "role")
			protected String role;
			@XmlAttribute(name = "roleuri")
			protected String roleuri;

			/**
			 * Gets the value of the qcode property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getQcode() {
				return qcode;
			}

			/**
			 * Sets the value of the qcode property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setQcode(String value) {
				this.qcode = value;
			}

			/**
			 * Gets the value of the uri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getUri() {
				return uri;
			}

			/**
			 * Sets the value of the uri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setUri(String value) {
				this.uri = value;
			}

			/**
			 * Gets the value of the literal property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLiteral() {
				return literal;
			}

			/**
			 * Sets the value of the literal property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLiteral(String value) {
				this.literal = value;
			}

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
			 * Gets the value of the role property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getRole() {
				return role;
			}

			/**
			 * Sets the value of the role property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setRole(String value) {
				this.role = value;
			}

			/**
			 * Gets the value of the roleuri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getRoleuri() {
				return roleuri;
			}

			/**
			 * Sets the value of the roleuri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setRoleuri(String value) {
				this.roleuri = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;simpleContent>
		 *     &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>StringType">
		 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}qualifyingAttributes"/>
		 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
		 *     &lt;/extension>
		 *   &lt;/simpleContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		@ToString
		public static class Origin extends StringType {

			@XmlAttribute(name = "qcode")
			protected String qcode;
			@XmlAttribute(name = "uri")
			protected String uri;
			@XmlAttribute(name = "literal")
			protected String literal;
			@XmlAttribute(name = "type")
			protected String type;
			@XmlAttribute(name = "typeuri")
			protected String typeuri;
			@XmlAttribute(name = "role")
			protected String role;
			@XmlAttribute(name = "roleuri")
			protected String roleuri;

			/**
			 * Gets the value of the qcode property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getQcode() {
				return qcode;
			}

			/**
			 * Sets the value of the qcode property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setQcode(String value) {
				this.qcode = value;
			}

			/**
			 * Gets the value of the uri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getUri() {
				return uri;
			}

			/**
			 * Sets the value of the uri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setUri(String value) {
				this.uri = value;
			}

			/**
			 * Gets the value of the literal property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLiteral() {
				return literal;
			}

			/**
			 * Sets the value of the literal property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLiteral(String value) {
				this.literal = value;
			}

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
			 * Gets the value of the role property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getRole() {
				return role;
			}

			/**
			 * Sets the value of the role property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setRole(String value) {
				this.role = value;
			}

			/**
			 * Gets the value of the roleuri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getRoleuri() {
				return roleuri;
			}

			/**
			 * Sets the value of the roleuri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setRoleuri(String value) {
				this.roleuri = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;simpleContent>
		 *     &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>Int1to9Type">
		 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
		 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
		 *     &lt;/extension>
		 *   &lt;/simpleContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "value" })
		@ToString
		public static class Priority {

			@XmlValue
			protected int value;
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
			 * The type of an integer in the range 1...9.
			 * 
			 */
			public int getValue() {
				return value;
			}

			/**
			 * Sets the value of the value property.
			 * 
			 */
			public void setValue(int value) {
				this.value = value;
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
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the pubconstraint property.
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
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the pubconstrainturi property.
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
			 * Gets a map that contains attributes that aren't bound to any
			 * typed property on this class.
			 * 
			 * <p>
			 * the map is keyed by the name of the attribute and the value is
			 * the string value of the attribute.
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

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;simpleContent>
		 *     &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>StringType">
		 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}qualifyingAttributes"/>
		 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
		 *     &lt;/extension>
		 *   &lt;/simpleContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		@ToString
		public static class Sender extends StringType {

			@XmlAttribute(name = "qcode")
			protected String qcode;
			@XmlAttribute(name = "uri")
			protected String uri;
			@XmlAttribute(name = "literal")
			protected String literal;
			@XmlAttribute(name = "type")
			protected String type;
			@XmlAttribute(name = "typeuri")
			protected String typeuri;
			@XmlAttribute(name = "role")
			protected String role;
			@XmlAttribute(name = "roleuri")
			protected String roleuri;

			/**
			 * Gets the value of the qcode property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getQcode() {
				return qcode;
			}

			/**
			 * Sets the value of the qcode property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setQcode(String value) {
				this.qcode = value;
			}

			/**
			 * Gets the value of the uri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getUri() {
				return uri;
			}

			/**
			 * Sets the value of the uri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setUri(String value) {
				this.uri = value;
			}

			/**
			 * Gets the value of the literal property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLiteral() {
				return literal;
			}

			/**
			 * Sets the value of the literal property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLiteral(String value) {
				this.literal = value;
			}

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
			 * Gets the value of the role property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getRole() {
				return role;
			}

			/**
			 * Sets the value of the role property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setRole(String value) {
				this.role = value;
			}

			/**
			 * Gets the value of the roleuri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getRoleuri() {
				return roleuri;
			}

			/**
			 * Sets the value of the roleuri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setRoleuri(String value) {
				this.roleuri = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;simpleContent>
		 *     &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>DateTimePropType">
		 *       &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
		 *     &lt;/extension>
		 *   &lt;/simpleContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		@ToString
		public static class Timestamp extends DateTimePropType {

			@XmlAttribute(name = "role")
			protected String role;

			/**
			 * Gets the value of the role property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getRole() {
				return role;
			}

			/**
			 * Sets the value of the role property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setRole(String value) {
				this.role = value;
			}

		}

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
	 *       &lt;sequence>
	 *         &lt;any processContents='lax' namespace='http://iptc.org/std/nar/2006-10-01/' maxOccurs="unbounded"/>
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
	@XmlType(name = "", propOrder = { "any" })
	@ToString
	public static class ItemSet {

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
		 * Gets the value of the any property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
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
		 * Objects of the following type(s) are allowed in the list
		 * {@link Object } {@link Element }
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
