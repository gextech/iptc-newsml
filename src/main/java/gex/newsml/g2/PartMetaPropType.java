
package gex.newsml.g2;

import lombok.ToString;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 *  A type representing the structure of a partMeta property
 * 
 * <p>Java class for partMetaPropType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partMetaPropType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}icon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timeDelim" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *                 &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="end" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="timeunit" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *                 &lt;attribute name="timeunituri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *                 &lt;attribute name="renditionref" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *                 &lt;attribute name="renditionrefuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *                 &lt;anyAttribute processContents='lax' namespace='##other'/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="regionDelim" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *                 &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;anyAttribute processContents='lax' namespace='##other'/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="role" type="{http://iptc.org/std/nar/2006-10-01/}QualPropType" minOccurs="0"/>
 *         &lt;group ref="{http://iptc.org/std/nar/2006-10-01/}AdministrativeMetadataGroup"/>
 *         &lt;group ref="{http://iptc.org/std/nar/2006-10-01/}DescriptiveMetadataGroup"/>
 *         &lt;element name="partMetaExtProperty" type="{http://iptc.org/std/nar/2006-10-01/}Flex2ExtPropType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}signal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}edNote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}link" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}i18nAttributes"/>
 *       &lt;attribute name="partid" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="creator" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *       &lt;attribute name="creatoruri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *       &lt;attribute name="modified" type="{http://iptc.org/std/nar/2006-10-01/}DateOptTimeType" />
 *       &lt;attribute name="custom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="how" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *       &lt;attribute name="howuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *       &lt;attribute name="why" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *       &lt;attribute name="whyuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *       &lt;attribute name="seq" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="contentrefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partMetaPropType", propOrder = {
    "icon",
    "timeDelim",
    "regionDelim",
    "role",
    "urgency",
    "contentCreated",
    "contentModified",
    "locatedOrInfoSourceOrCreator",
    "languageOrGenreOrKeyword",
    "partMetaExtProperty",
    "signal",
    "edNote",
    "link",
    "any"
})
@ToString public class PartMetaPropType {

    protected List<Icon> icon;
    protected List<PartMetaPropType.TimeDelim> timeDelim;
    protected PartMetaPropType.RegionDelim regionDelim;
    protected QualPropType role;
    protected Urgency urgency;
    protected TruncatedDateTimePropType contentCreated;
    protected TruncatedDateTimePropType contentModified;
    @XmlElementRefs({
        @XmlElementRef(name = "exclAudience", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "located", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "altId", namespace = "http://iptc.org/std/nar/2006-10-01/", type = AltId.class, required = false),
        @XmlElementRef(name = "infoSource", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "audience", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "contributor", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "userInteraction", namespace = "http://iptc.org/std/nar/2006-10-01/", type = UserInteraction.class, required = false),
        @XmlElementRef(name = "creator", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rating", namespace = "http://iptc.org/std/nar/2006-10-01/", type = Rating.class, required = false)
    })
    protected List<Object> locatedOrInfoSourceOrCreator;
    @XmlElements({
        @XmlElement(name = "language", type = Language.class),
        @XmlElement(name = "genre", type = Genre.class),
        @XmlElement(name = "keyword", type = Keyword.class),
        @XmlElement(name = "subject", type = Subject.class),
        @XmlElement(name = "slugline", type = Slugline.class),
        @XmlElement(name = "headline", type = Headline.class),
        @XmlElement(name = "dateline", type = Dateline.class),
        @XmlElement(name = "by", type = By.class),
        @XmlElement(name = "creditline", type = Creditline.class),
        @XmlElement(name = "description", type = Description.class)
    })
    protected List<Object> languageOrGenreOrKeyword;
    protected List<Flex2ExtPropType> partMetaExtProperty;
    protected List<Signal> signal;
    protected List<BlockType> edNote;
    protected List<Link1Type> link;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "partid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String partid;
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
    @XmlAttribute(name = "seq")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger seq;
    @XmlAttribute(name = "contentrefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> contentrefs;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the icon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the icon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIcon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Icon }
     * 
     * 
     */
    public List<Icon> getIcon() {
        if (icon == null) {
            icon = new ArrayList<Icon>();
        }
        return this.icon;
    }

    /**
     * Gets the value of the timeDelim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeDelim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeDelim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartMetaPropType.TimeDelim }
     * 
     * 
     */
    public List<PartMetaPropType.TimeDelim> getTimeDelim() {
        if (timeDelim == null) {
            timeDelim = new ArrayList<PartMetaPropType.TimeDelim>();
        }
        return this.timeDelim;
    }

    /**
     * Gets the value of the regionDelim property.
     * 
     * @return
     *     possible object is
     *     {@link PartMetaPropType.RegionDelim }
     *     
     */
    public PartMetaPropType.RegionDelim getRegionDelim() {
        return regionDelim;
    }

    /**
     * Sets the value of the regionDelim property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartMetaPropType.RegionDelim }
     *     
     */
    public void setRegionDelim(PartMetaPropType.RegionDelim value) {
        this.regionDelim = value;
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
     * Gets the value of the urgency property.
     * 
     * @return
     *     possible object is
     *     {@link Urgency }
     *     
     */
    public Urgency getUrgency() {
        return urgency;
    }

    /**
     * Sets the value of the urgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Urgency }
     *     
     */
    public void setUrgency(Urgency value) {
        this.urgency = value;
    }

    /**
     * Gets the value of the contentCreated property.
     * 
     * @return
     *     possible object is
     *     {@link TruncatedDateTimePropType }
     *     
     */
    public TruncatedDateTimePropType getContentCreated() {
        return contentCreated;
    }

    /**
     * Sets the value of the contentCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TruncatedDateTimePropType }
     *     
     */
    public void setContentCreated(TruncatedDateTimePropType value) {
        this.contentCreated = value;
    }

    /**
     * Gets the value of the contentModified property.
     * 
     * @return
     *     possible object is
     *     {@link TruncatedDateTimePropType }
     *     
     */
    public TruncatedDateTimePropType getContentModified() {
        return contentModified;
    }

    /**
     * Sets the value of the contentModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link TruncatedDateTimePropType }
     *     
     */
    public void setContentModified(TruncatedDateTimePropType value) {
        this.contentModified = value;
    }

    /**
     * Gets the value of the locatedOrInfoSourceOrCreator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locatedOrInfoSourceOrCreator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocatedOrInfoSourceOrCreator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AudienceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexLocationPropType }{@code >}
     * {@link AltId }
     * {@link JAXBElement }{@code <}{@link Flex1PartyPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link AudienceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexAuthorPropType }{@code >}
     * {@link UserInteraction }
     * {@link JAXBElement }{@code <}{@link FlexAuthorPropType }{@code >}
     * {@link Rating }
     * 
     * 
     */
    public List<Object> getLocatedOrInfoSourceOrCreator() {
        if (locatedOrInfoSourceOrCreator == null) {
            locatedOrInfoSourceOrCreator = new ArrayList<Object>();
        }
        return this.locatedOrInfoSourceOrCreator;
    }

    /**
     * Gets the value of the languageOrGenreOrKeyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageOrGenreOrKeyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageOrGenreOrKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Language }
     * {@link Genre }
     * {@link Keyword }
     * {@link Subject }
     * {@link Slugline }
     * {@link Headline }
     * {@link Dateline }
     * {@link By }
     * {@link Creditline }
     * {@link Description }
     * 
     * 
     */
    public List<Object> getLanguageOrGenreOrKeyword() {
        if (languageOrGenreOrKeyword == null) {
            languageOrGenreOrKeyword = new ArrayList<Object>();
        }
        return this.languageOrGenreOrKeyword;
    }

    /**
     * Gets the value of the partMetaExtProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partMetaExtProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartMetaExtProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Flex2ExtPropType }
     * 
     * 
     */
    public List<Flex2ExtPropType> getPartMetaExtProperty() {
        if (partMetaExtProperty == null) {
            partMetaExtProperty = new ArrayList<Flex2ExtPropType>();
        }
        return this.partMetaExtProperty;
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
     * Gets the value of the partid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartid() {
        return partid;
    }

    /**
     * Sets the value of the partid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartid(String value) {
        this.partid = value;
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
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeq(BigInteger value) {
        this.seq = value;
    }

    /**
     * Gets the value of the contentrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getContentrefs() {
        if (contentrefs == null) {
            contentrefs = new ArrayList<Object>();
        }
        return this.contentrefs;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
     *       &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
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
    @ToString public static class RegionDelim {

        @XmlAttribute(name = "x")
        protected BigInteger x;
        @XmlAttribute(name = "y")
        protected BigInteger y;
        @XmlAttribute(name = "width")
        protected BigInteger width;
        @XmlAttribute(name = "height")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger height;
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
         * Gets the value of the x property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getX() {
            return x;
        }

        /**
         * Sets the value of the x property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setX(BigInteger value) {
            this.x = value;
        }

        /**
         * Gets the value of the y property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getY() {
            return y;
        }

        /**
         * Sets the value of the y property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setY(BigInteger value) {
            this.y = value;
        }

        /**
         * Gets the value of the width property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWidth() {
            return width;
        }

        /**
         * Sets the value of the width property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWidth(BigInteger value) {
            this.width = value;
        }

        /**
         * Gets the value of the height property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getHeight() {
            return height;
        }

        /**
         * Sets the value of the height property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setHeight(BigInteger value) {
            this.height = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
     *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="end" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="timeunit" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
     *       &lt;attribute name="timeunituri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
     *       &lt;attribute name="renditionref" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
     *       &lt;attribute name="renditionrefuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
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
    @ToString public static class TimeDelim {

        @XmlAttribute(name = "start", required = true)
        protected String start;
        @XmlAttribute(name = "end", required = true)
        protected String end;
        @XmlAttribute(name = "timeunit")
        protected String timeunit;
        @XmlAttribute(name = "timeunituri")
        protected String timeunituri;
        @XmlAttribute(name = "renditionref")
        protected String renditionref;
        @XmlAttribute(name = "renditionrefuri")
        protected String renditionrefuri;
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
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * Gets the value of the timeunit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeunit() {
            return timeunit;
        }

        /**
         * Sets the value of the timeunit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeunit(String value) {
            this.timeunit = value;
        }

        /**
         * Gets the value of the timeunituri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeunituri() {
            return timeunituri;
        }

        /**
         * Sets the value of the timeunituri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeunituri(String value) {
            this.timeunituri = value;
        }

        /**
         * Gets the value of the renditionref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRenditionref() {
            return renditionref;
        }

        /**
         * Sets the value of the renditionref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRenditionref(String value) {
            this.renditionref = value;
        }

        /**
         * Gets the value of the renditionrefuri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRenditionrefuri() {
            return renditionrefuri;
        }

        /**
         * Sets the value of the renditionrefuri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRenditionrefuri(String value) {
            this.renditionrefuri = value;
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

}
