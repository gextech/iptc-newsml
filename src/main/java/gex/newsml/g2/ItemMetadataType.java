
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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * The type for a set of properties directly associated with the item (Type defined in this XML Schema only)
 * 
 * <p>Java class for ItemMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemMetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://iptc.org/std/nar/2006-10-01/}ItemManagementGroup"/>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}link" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itemMetaExtProperty" type="{http://iptc.org/std/nar/2006-10-01/}Flex2ExtPropType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ItemMetadataType", propOrder = {
    "itemClass",
    "provider",
    "versionCreated",
    "firstCreated",
    "embargoed",
    "pubStatus",
    "role",
    "fileName",
    "generator",
    "profile",
    "service",
    "title",
    "edNote",
    "memberOf",
    "instanceOf",
    "signal",
    "altRep",
    "deliverableOf",
    "hash",
    "expires",
    "origRep",
    "incomingFeedId",
    "link",
    "itemMetaExtProperty",
    "any"
})
@ToString public class ItemMetadataType {

    @XmlElement(required = true)
    protected QualPropType itemClass;
    @XmlElement(required = true)
    protected FlexPartyPropType provider;
    @XmlElement(required = true)
    protected DateTimePropType versionCreated;
    protected DateTimePropType firstCreated;
    protected DateTimeOrNullPropType embargoed;
    protected QualPropType pubStatus;
    protected QualPropType role;
    protected FileName fileName;
    protected List<Generator> generator;
    protected VersionedStringType profile;
    protected List<QualPropType> service;
    protected List<Label1Type> title;
    protected List<BlockType> edNote;
    protected List<Flex1PropType> memberOf;
    protected List<Flex1PropType> instanceOf;
    protected List<Signal> signal;
    protected List<AltRep> altRep;
    protected List<Link1Type> deliverableOf;
    protected List<Hash> hash;
    protected List<DateOptTimePropType> expires;
    protected List<OrigRep> origRep;
    protected List<IncomingFeedId> incomingFeedId;
    protected List<Link1Type> link;
    protected List<Flex2ExtPropType> itemMetaExtProperty;
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
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the itemClass property.
     * 
     * @return
     *     possible object is
     *     {@link QualPropType }
     *     
     */
    public QualPropType getItemClass() {
        return itemClass;
    }

    /**
     * Sets the value of the itemClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualPropType }
     *     
     */
    public void setItemClass(QualPropType value) {
        this.itemClass = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link FlexPartyPropType }
     *     
     */
    public FlexPartyPropType getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexPartyPropType }
     *     
     */
    public void setProvider(FlexPartyPropType value) {
        this.provider = value;
    }

    /**
     * Gets the value of the versionCreated property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePropType }
     *     
     */
    public DateTimePropType getVersionCreated() {
        return versionCreated;
    }

    /**
     * Sets the value of the versionCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePropType }
     *     
     */
    public void setVersionCreated(DateTimePropType value) {
        this.versionCreated = value;
    }

    /**
     * Gets the value of the firstCreated property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePropType }
     *     
     */
    public DateTimePropType getFirstCreated() {
        return firstCreated;
    }

    /**
     * Sets the value of the firstCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePropType }
     *     
     */
    public void setFirstCreated(DateTimePropType value) {
        this.firstCreated = value;
    }

    /**
     * Gets the value of the embargoed property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeOrNullPropType }
     *     
     */
    public DateTimeOrNullPropType getEmbargoed() {
        return embargoed;
    }

    /**
     * Sets the value of the embargoed property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeOrNullPropType }
     *     
     */
    public void setEmbargoed(DateTimeOrNullPropType value) {
        this.embargoed = value;
    }

    /**
     * Gets the value of the pubStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QualPropType }
     *     
     */
    public QualPropType getPubStatus() {
        return pubStatus;
    }

    /**
     * Sets the value of the pubStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualPropType }
     *     
     */
    public void setPubStatus(QualPropType value) {
        this.pubStatus = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link QualPropType }
     *     
     */
    public QualPropType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualPropType }
     *     
     */
    public void setRole(QualPropType value) {
        this.role = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link FileName }
     *     
     */
    public FileName getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileName }
     *     
     */
    public void setFileName(FileName value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the generator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenerator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Generator }
     * 
     * 
     */
    public List<Generator> getGenerator() {
        if (generator == null) {
            generator = new ArrayList<Generator>();
        }
        return this.generator;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link VersionedStringType }
     *     
     */
    public VersionedStringType getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionedStringType }
     *     
     */
    public void setProfile(VersionedStringType value) {
        this.profile = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualPropType }
     * 
     * 
     */
    public List<QualPropType> getService() {
        if (service == null) {
            service = new ArrayList<QualPropType>();
        }
        return this.service;
    }

    /**
     * A short natural language name for the Item.Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
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
     * Gets the value of the edNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BlockType }
     * 
     * 
     */
    public List<BlockType> getEdNote() {
        if (edNote == null) {
            edNote = new ArrayList<BlockType>();
        }
        return this.edNote;
    }

    /**
     * Gets the value of the memberOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Flex1PropType }
     * 
     * 
     */
    public List<Flex1PropType> getMemberOf() {
        if (memberOf == null) {
            memberOf = new ArrayList<Flex1PropType>();
        }
        return this.memberOf;
    }

    /**
     * Gets the value of the instanceOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instanceOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstanceOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Flex1PropType }
     * 
     * 
     */
    public List<Flex1PropType> getInstanceOf() {
        if (instanceOf == null) {
            instanceOf = new ArrayList<Flex1PropType>();
        }
        return this.instanceOf;
    }

    /**
     * Gets the value of the signal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Signal }
     * 
     * 
     */
    public List<Signal> getSignal() {
        if (signal == null) {
            signal = new ArrayList<Signal>();
        }
        return this.signal;
    }

    /**
     * Gets the value of the altRep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altRep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltRep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AltRep }
     * 
     * 
     */
    public List<AltRep> getAltRep() {
        if (altRep == null) {
            altRep = new ArrayList<AltRep>();
        }
        return this.altRep;
    }

    /**
     * Gets the value of the deliverableOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliverableOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliverableOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Link1Type }
     * 
     * 
     */
    public List<Link1Type> getDeliverableOf() {
        if (deliverableOf == null) {
            deliverableOf = new ArrayList<Link1Type>();
        }
        return this.deliverableOf;
    }

    /**
     * Gets the value of the hash property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hash property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHash().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hash }
     * 
     * 
     */
    public List<Hash> getHash() {
        if (hash == null) {
            hash = new ArrayList<Hash>();
        }
        return this.hash;
    }

    /**
     * Gets the value of the expires property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expires property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpires().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateOptTimePropType }
     * 
     * 
     */
    public List<DateOptTimePropType> getExpires() {
        if (expires == null) {
            expires = new ArrayList<DateOptTimePropType>();
        }
        return this.expires;
    }

    /**
     * Gets the value of the origRep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the origRep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrigRep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrigRep }
     * 
     * 
     */
    public List<OrigRep> getOrigRep() {
        if (origRep == null) {
            origRep = new ArrayList<OrigRep>();
        }
        return this.origRep;
    }

    /**
     * Gets the value of the incomingFeedId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incomingFeedId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncomingFeedId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncomingFeedId }
     * 
     * 
     */
    public List<IncomingFeedId> getIncomingFeedId() {
        if (incomingFeedId == null) {
            incomingFeedId = new ArrayList<IncomingFeedId>();
        }
        return this.incomingFeedId;
    }

    /**
     * Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Link1Type }
     * 
     * 
     */
    public List<Link1Type> getLink() {
        if (link == null) {
            link = new ArrayList<Link1Type>();
        }
        return this.link;
    }

    /**
     * Gets the value of the itemMetaExtProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemMetaExtProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemMetaExtProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Flex2ExtPropType }
     * 
     * 
     */
    public List<Flex2ExtPropType> getItemMetaExtProperty() {
        if (itemMetaExtProperty == null) {
            itemMetaExtProperty = new ArrayList<Flex2ExtPropType>();
        }
        return this.itemMetaExtProperty;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the creatoruri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatoruri() {
        return creatoruri;
    }

    /**
     * Sets the value of the creatoruri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatoruri(String value) {
        this.creatoruri = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModified(String value) {
        this.modified = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustom(Boolean value) {
        this.custom = value;
    }

    /**
     * Gets the value of the how property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHow() {
        return how;
    }

    /**
     * Sets the value of the how property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHow(String value) {
        this.how = value;
    }

    /**
     * Gets the value of the howuri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHowuri() {
        return howuri;
    }

    /**
     * Sets the value of the howuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHowuri(String value) {
        this.howuri = value;
    }

    /**
     * Gets the value of the why property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhy() {
        return why;
    }

    /**
     * Sets the value of the why property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhy(String value) {
        this.why = value;
    }

    /**
     * Gets the value of the whyuri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhyuri() {
        return whyuri;
    }

    /**
     * Sets the value of the whyuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhyuri(String value) {
        this.whyuri = value;
    }

    /**
     * Gets the value of the pubconstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubconstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubconstraint().add(newItem);
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
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubconstrainturi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubconstrainturi().add(newItem);
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
     * Specifies the language of this property and potentially all descendant properties. xml:lang values of descendant properties override this value. Values are determined by Internet BCP 47.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDir() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDir(String value) {
        this.dir = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
