
package gex.newsml.g2;

import java.math.BigDecimal;
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
 *  A type representing the structure of the remoteContent property
 * 
 * <p>Java class for RemoteContentPropType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoteContentPropType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="channel" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *                 &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}newsContentCharacteristics"/>
 *                 &lt;attribute name="chnlid" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="type" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *                 &lt;attribute name="typeuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *                 &lt;attribute name="role" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *                 &lt;attribute name="roleuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *                 &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *                 &lt;attribute name="g2flag" type="{http://www.w3.org/2001/XMLSchema}string" fixed="RCONT" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}altId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}altLoc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}hash" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}signal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remoteContentExtProperty" type="{http://iptc.org/std/nar/2006-10-01/}Flex2ExtPropType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}newsContentCharacteristics"/>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}targetResourceAttributes"/>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}newsContentAttributes"/>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}timeValidityAttributes"/>
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteContentPropType", propOrder = {
    "channel",
    "altId",
    "altLoc",
    "hash",
    "signal",
    "remoteContentExtProperty",
    "any"
})
public class RemoteContentPropType {

    protected List<RemoteContentPropType.Channel> channel;
    protected List<AltId> altId;
    protected List<AltLoc> altLoc;
    protected List<Hash> hash;
    protected List<Signal> signal;
    protected List<Flex2ExtPropType> remoteContentExtProperty;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlAttribute(name = "wordcount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger wordcount;
    @XmlAttribute(name = "linecount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger linecount;
    @XmlAttribute(name = "pagecount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pagecount;
    @XmlAttribute(name = "width")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger width;
    @XmlAttribute(name = "widthunit")
    protected String widthunit;
    @XmlAttribute(name = "widthunituri")
    protected String widthunituri;
    @XmlAttribute(name = "height")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger height;
    @XmlAttribute(name = "heightunit")
    protected String heightunit;
    @XmlAttribute(name = "heightunituri")
    protected String heightunituri;
    @XmlAttribute(name = "orientation")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger orientation;
    @XmlAttribute(name = "layoutorientation")
    protected String layoutorientation;
    @XmlAttribute(name = "layoutorientationuri")
    protected String layoutorientationuri;
    @XmlAttribute(name = "colourspace")
    protected String colourspace;
    @XmlAttribute(name = "colourspaceuri")
    protected String colourspaceuri;
    @XmlAttribute(name = "colourindicator")
    protected String colourindicator;
    @XmlAttribute(name = "colourindicatoruri")
    protected String colourindicatoruri;
    @XmlAttribute(name = "colourdepth")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger colourdepth;
    @XmlAttribute(name = "resolution")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger resolution;
    @XmlAttribute(name = "duration")
    protected String duration;
    @XmlAttribute(name = "durationunit")
    protected String durationunit;
    @XmlAttribute(name = "durationunituri")
    protected String durationunituri;
    @XmlAttribute(name = "audiocodec")
    protected String audiocodec;
    @XmlAttribute(name = "audiocodecuri")
    protected String audiocodecuri;
    @XmlAttribute(name = "audiobitrate")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger audiobitrate;
    @XmlAttribute(name = "audiovbr")
    protected Boolean audiovbr;
    @XmlAttribute(name = "audiosamplesize")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger audiosamplesize;
    @XmlAttribute(name = "audiosamplerate")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger audiosamplerate;
    @XmlAttribute(name = "audiochannels")
    protected String audiochannels;
    @XmlAttribute(name = "audiochannelsuri")
    protected String audiochannelsuri;
    @XmlAttribute(name = "videocodec")
    protected String videocodec;
    @XmlAttribute(name = "videocodecuri")
    protected String videocodecuri;
    @XmlAttribute(name = "videoavgbitrate")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger videoavgbitrate;
    @XmlAttribute(name = "videovbr")
    protected Boolean videovbr;
    @XmlAttribute(name = "videoframerate")
    protected BigDecimal videoframerate;
    @XmlAttribute(name = "videoscan")
    protected String videoscan;
    @XmlAttribute(name = "videoaspectratio")
    protected String videoaspectratio;
    @XmlAttribute(name = "videosampling")
    protected String videosampling;
    @XmlAttribute(name = "videoscaling")
    protected String videoscaling;
    @XmlAttribute(name = "videoscalinguri")
    protected String videoscalinguri;
    @XmlAttribute(name = "videodefinition")
    protected String videodefinition;
    @XmlAttribute(name = "videodefinitionuri")
    protected String videodefinitionuri;
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
    @XmlAttribute(name = "rendition")
    protected String rendition;
    @XmlAttribute(name = "renditionuri")
    protected String renditionuri;
    @XmlAttribute(name = "generator")
    protected String generator;
    @XmlAttribute(name = "generated")
    protected String generated;
    @XmlAttribute(name = "hascontent")
    protected Boolean hascontent;
    @XmlAttribute(name = "validfrom")
    protected String validfrom;
    @XmlAttribute(name = "validto")
    protected String validto;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the channel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemoteContentPropType.Channel }
     * 
     * 
     */
    public List<RemoteContentPropType.Channel> getChannel() {
        if (channel == null) {
            channel = new ArrayList<RemoteContentPropType.Channel>();
        }
        return this.channel;
    }

    /**
     * Gets the value of the altId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AltId }
     * 
     * 
     */
    public List<AltId> getAltId() {
        if (altId == null) {
            altId = new ArrayList<AltId>();
        }
        return this.altId;
    }

    /**
     * Gets the value of the altLoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altLoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltLoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AltLoc }
     * 
     * 
     */
    public List<AltLoc> getAltLoc() {
        if (altLoc == null) {
            altLoc = new ArrayList<AltLoc>();
        }
        return this.altLoc;
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
     * Gets the value of the remoteContentExtProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteContentExtProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteContentExtProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Flex2ExtPropType }
     * 
     * 
     */
    public List<Flex2ExtPropType> getRemoteContentExtProperty() {
        if (remoteContentExtProperty == null) {
            remoteContentExtProperty = new ArrayList<Flex2ExtPropType>();
        }
        return this.remoteContentExtProperty;
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
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the wordcount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWordcount() {
        return wordcount;
    }

    /**
     * Sets the value of the wordcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWordcount(BigInteger value) {
        this.wordcount = value;
    }

    /**
     * Gets the value of the linecount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLinecount() {
        return linecount;
    }

    /**
     * Sets the value of the linecount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLinecount(BigInteger value) {
        this.linecount = value;
    }

    /**
     * Gets the value of the pagecount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPagecount() {
        return pagecount;
    }

    /**
     * Sets the value of the pagecount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPagecount(BigInteger value) {
        this.pagecount = value;
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
     * Gets the value of the widthunit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidthunit() {
        return widthunit;
    }

    /**
     * Sets the value of the widthunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidthunit(String value) {
        this.widthunit = value;
    }

    /**
     * Gets the value of the widthunituri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidthunituri() {
        return widthunituri;
    }

    /**
     * Sets the value of the widthunituri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidthunituri(String value) {
        this.widthunituri = value;
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
     * Gets the value of the heightunit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeightunit() {
        return heightunit;
    }

    /**
     * Sets the value of the heightunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeightunit(String value) {
        this.heightunit = value;
    }

    /**
     * Gets the value of the heightunituri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeightunituri() {
        return heightunituri;
    }

    /**
     * Sets the value of the heightunituri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeightunituri(String value) {
        this.heightunituri = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrientation(BigInteger value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the layoutorientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayoutorientation() {
        return layoutorientation;
    }

    /**
     * Sets the value of the layoutorientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayoutorientation(String value) {
        this.layoutorientation = value;
    }

    /**
     * Gets the value of the layoutorientationuri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayoutorientationuri() {
        return layoutorientationuri;
    }

    /**
     * Sets the value of the layoutorientationuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayoutorientationuri(String value) {
        this.layoutorientationuri = value;
    }

    /**
     * Gets the value of the colourspace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColourspace() {
        return colourspace;
    }

    /**
     * Sets the value of the colourspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColourspace(String value) {
        this.colourspace = value;
    }

    /**
     * Gets the value of the colourspaceuri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColourspaceuri() {
        return colourspaceuri;
    }

    /**
     * Sets the value of the colourspaceuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColourspaceuri(String value) {
        this.colourspaceuri = value;
    }

    /**
     * Gets the value of the colourindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColourindicator() {
        return colourindicator;
    }

    /**
     * Sets the value of the colourindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColourindicator(String value) {
        this.colourindicator = value;
    }

    /**
     * Gets the value of the colourindicatoruri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColourindicatoruri() {
        return colourindicatoruri;
    }

    /**
     * Sets the value of the colourindicatoruri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColourindicatoruri(String value) {
        this.colourindicatoruri = value;
    }

    /**
     * Gets the value of the colourdepth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColourdepth() {
        return colourdepth;
    }

    /**
     * Sets the value of the colourdepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColourdepth(BigInteger value) {
        this.colourdepth = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResolution(BigInteger value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the durationunit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationunit() {
        return durationunit;
    }

    /**
     * Sets the value of the durationunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationunit(String value) {
        this.durationunit = value;
    }

    /**
     * Gets the value of the durationunituri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationunituri() {
        return durationunituri;
    }

    /**
     * Sets the value of the durationunituri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationunituri(String value) {
        this.durationunituri = value;
    }

    /**
     * Gets the value of the audiocodec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudiocodec() {
        return audiocodec;
    }

    /**
     * Sets the value of the audiocodec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudiocodec(String value) {
        this.audiocodec = value;
    }

    /**
     * Gets the value of the audiocodecuri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudiocodecuri() {
        return audiocodecuri;
    }

    /**
     * Sets the value of the audiocodecuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudiocodecuri(String value) {
        this.audiocodecuri = value;
    }

    /**
     * Gets the value of the audiobitrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAudiobitrate() {
        return audiobitrate;
    }

    /**
     * Sets the value of the audiobitrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAudiobitrate(BigInteger value) {
        this.audiobitrate = value;
    }

    /**
     * Gets the value of the audiovbr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAudiovbr() {
        return audiovbr;
    }

    /**
     * Sets the value of the audiovbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAudiovbr(Boolean value) {
        this.audiovbr = value;
    }

    /**
     * Gets the value of the audiosamplesize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAudiosamplesize() {
        return audiosamplesize;
    }

    /**
     * Sets the value of the audiosamplesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAudiosamplesize(BigInteger value) {
        this.audiosamplesize = value;
    }

    /**
     * Gets the value of the audiosamplerate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAudiosamplerate() {
        return audiosamplerate;
    }

    /**
     * Sets the value of the audiosamplerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAudiosamplerate(BigInteger value) {
        this.audiosamplerate = value;
    }

    /**
     * Gets the value of the audiochannels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudiochannels() {
        return audiochannels;
    }

    /**
     * Sets the value of the audiochannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudiochannels(String value) {
        this.audiochannels = value;
    }

    /**
     * Gets the value of the audiochannelsuri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudiochannelsuri() {
        return audiochannelsuri;
    }

    /**
     * Sets the value of the audiochannelsuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudiochannelsuri(String value) {
        this.audiochannelsuri = value;
    }

    /**
     * Gets the value of the videocodec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideocodec() {
        return videocodec;
    }

    /**
     * Sets the value of the videocodec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideocodec(String value) {
        this.videocodec = value;
    }

    /**
     * Gets the value of the videocodecuri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideocodecuri() {
        return videocodecuri;
    }

    /**
     * Sets the value of the videocodecuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideocodecuri(String value) {
        this.videocodecuri = value;
    }

    /**
     * Gets the value of the videoavgbitrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVideoavgbitrate() {
        return videoavgbitrate;
    }

    /**
     * Sets the value of the videoavgbitrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVideoavgbitrate(BigInteger value) {
        this.videoavgbitrate = value;
    }

    /**
     * Gets the value of the videovbr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVideovbr() {
        return videovbr;
    }

    /**
     * Sets the value of the videovbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVideovbr(Boolean value) {
        this.videovbr = value;
    }

    /**
     * Gets the value of the videoframerate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVideoframerate() {
        return videoframerate;
    }

    /**
     * Sets the value of the videoframerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVideoframerate(BigDecimal value) {
        this.videoframerate = value;
    }

    /**
     * Gets the value of the videoscan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoscan() {
        return videoscan;
    }

    /**
     * Sets the value of the videoscan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoscan(String value) {
        this.videoscan = value;
    }

    /**
     * Gets the value of the videoaspectratio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoaspectratio() {
        return videoaspectratio;
    }

    /**
     * Sets the value of the videoaspectratio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoaspectratio(String value) {
        this.videoaspectratio = value;
    }

    /**
     * Gets the value of the videosampling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideosampling() {
        return videosampling;
    }

    /**
     * Sets the value of the videosampling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideosampling(String value) {
        this.videosampling = value;
    }

    /**
     * Gets the value of the videoscaling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoscaling() {
        return videoscaling;
    }

    /**
     * Sets the value of the videoscaling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoscaling(String value) {
        this.videoscaling = value;
    }

    /**
     * Gets the value of the videoscalinguri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoscalinguri() {
        return videoscalinguri;
    }

    /**
     * Sets the value of the videoscalinguri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoscalinguri(String value) {
        this.videoscalinguri = value;
    }

    /**
     * Gets the value of the videodefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideodefinition() {
        return videodefinition;
    }

    /**
     * Sets the value of the videodefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideodefinition(String value) {
        this.videodefinition = value;
    }

    /**
     * Gets the value of the videodefinitionuri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideodefinitionuri() {
        return videodefinitionuri;
    }

    /**
     * Sets the value of the videodefinitionuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideodefinitionuri(String value) {
        this.videodefinitionuri = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the residref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidref() {
        return residref;
    }

    /**
     * Sets the value of the residref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidref(String value) {
        this.residref = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Gets the value of the persistidref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistidref() {
        return persistidref;
    }

    /**
     * Sets the value of the persistidref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistidref(String value) {
        this.persistidref = value;
    }

    /**
     * Gets the value of the contenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContenttype() {
        return contenttype;
    }

    /**
     * Sets the value of the contenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContenttype(String value) {
        this.contenttype = value;
    }

    /**
     * Gets the value of the contenttypevariant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContenttypevariant() {
        return contenttypevariant;
    }

    /**
     * Sets the value of the contenttypevariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContenttypevariant(String value) {
        this.contenttypevariant = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the formaturi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaturi() {
        return formaturi;
    }

    /**
     * Sets the value of the formaturi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaturi(String value) {
        this.formaturi = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSize(BigInteger value) {
        this.size = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the value of the rendition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRendition() {
        return rendition;
    }

    /**
     * Sets the value of the rendition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRendition(String value) {
        this.rendition = value;
    }

    /**
     * Gets the value of the renditionuri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenditionuri() {
        return renditionuri;
    }

    /**
     * Sets the value of the renditionuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenditionuri(String value) {
        this.renditionuri = value;
    }

    /**
     * Gets the value of the generator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerator() {
        return generator;
    }

    /**
     * Sets the value of the generator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerator(String value) {
        this.generator = value;
    }

    /**
     * Gets the value of the generated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerated() {
        return generated;
    }

    /**
     * Sets the value of the generated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerated(String value) {
        this.generated = value;
    }

    /**
     * Gets the value of the hascontent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHascontent() {
        return hascontent;
    }

    /**
     * Sets the value of the hascontent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHascontent(Boolean value) {
        this.hascontent = value;
    }

    /**
     * Gets the value of the validfrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidfrom() {
        return validfrom;
    }

    /**
     * Sets the value of the validfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidfrom(String value) {
        this.validfrom = value;
    }

    /**
     * Gets the value of the validto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidto() {
        return validto;
    }

    /**
     * Sets the value of the validto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidto(String value) {
        this.validto = value;
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
     *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}newsContentCharacteristics"/>
     *       &lt;attribute name="chnlid" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="type" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
     *       &lt;attribute name="typeuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
     *       &lt;attribute name="role" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
     *       &lt;attribute name="roleuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
     *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}language" />
     *       &lt;attribute name="g2flag" type="{http://www.w3.org/2001/XMLSchema}string" fixed="RCONT" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Channel {

        @XmlAttribute(name = "chnlid")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger chnlid;
        @XmlAttribute(name = "type")
        protected String type;
        @XmlAttribute(name = "typeuri")
        protected String typeuri;
        @XmlAttribute(name = "role")
        protected String role;
        @XmlAttribute(name = "roleuri")
        protected String roleuri;
        @XmlAttribute(name = "language")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String language;
        @XmlAttribute(name = "g2flag")
        protected String g2Flag;
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
        @XmlAttribute(name = "wordcount")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger wordcount;
        @XmlAttribute(name = "linecount")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger linecount;
        @XmlAttribute(name = "pagecount")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger pagecount;
        @XmlAttribute(name = "width")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger width;
        @XmlAttribute(name = "widthunit")
        protected String widthunit;
        @XmlAttribute(name = "widthunituri")
        protected String widthunituri;
        @XmlAttribute(name = "height")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger height;
        @XmlAttribute(name = "heightunit")
        protected String heightunit;
        @XmlAttribute(name = "heightunituri")
        protected String heightunituri;
        @XmlAttribute(name = "orientation")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger orientation;
        @XmlAttribute(name = "layoutorientation")
        protected String layoutorientation;
        @XmlAttribute(name = "layoutorientationuri")
        protected String layoutorientationuri;
        @XmlAttribute(name = "colourspace")
        protected String colourspace;
        @XmlAttribute(name = "colourspaceuri")
        protected String colourspaceuri;
        @XmlAttribute(name = "colourindicator")
        protected String colourindicator;
        @XmlAttribute(name = "colourindicatoruri")
        protected String colourindicatoruri;
        @XmlAttribute(name = "colourdepth")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger colourdepth;
        @XmlAttribute(name = "resolution")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger resolution;
        @XmlAttribute(name = "duration")
        protected String duration;
        @XmlAttribute(name = "durationunit")
        protected String durationunit;
        @XmlAttribute(name = "durationunituri")
        protected String durationunituri;
        @XmlAttribute(name = "audiocodec")
        protected String audiocodec;
        @XmlAttribute(name = "audiocodecuri")
        protected String audiocodecuri;
        @XmlAttribute(name = "audiobitrate")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger audiobitrate;
        @XmlAttribute(name = "audiovbr")
        protected Boolean audiovbr;
        @XmlAttribute(name = "audiosamplesize")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger audiosamplesize;
        @XmlAttribute(name = "audiosamplerate")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger audiosamplerate;
        @XmlAttribute(name = "audiochannels")
        protected String audiochannels;
        @XmlAttribute(name = "audiochannelsuri")
        protected String audiochannelsuri;
        @XmlAttribute(name = "videocodec")
        protected String videocodec;
        @XmlAttribute(name = "videocodecuri")
        protected String videocodecuri;
        @XmlAttribute(name = "videoavgbitrate")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger videoavgbitrate;
        @XmlAttribute(name = "videovbr")
        protected Boolean videovbr;
        @XmlAttribute(name = "videoframerate")
        protected BigDecimal videoframerate;
        @XmlAttribute(name = "videoscan")
        protected String videoscan;
        @XmlAttribute(name = "videoaspectratio")
        protected String videoaspectratio;
        @XmlAttribute(name = "videosampling")
        protected String videosampling;
        @XmlAttribute(name = "videoscaling")
        protected String videoscaling;
        @XmlAttribute(name = "videoscalinguri")
        protected String videoscalinguri;
        @XmlAttribute(name = "videodefinition")
        protected String videodefinition;
        @XmlAttribute(name = "videodefinitionuri")
        protected String videodefinitionuri;

        /**
         * Gets the value of the chnlid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getChnlid() {
            return chnlid;
        }

        /**
         * Sets the value of the chnlid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setChnlid(BigInteger value) {
            this.chnlid = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the typeuri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypeuri() {
            return typeuri;
        }

        /**
         * Sets the value of the typeuri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypeuri(String value) {
            this.typeuri = value;
        }

        /**
         * Gets the value of the role property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRole() {
            return role;
        }

        /**
         * Sets the value of the role property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRole(String value) {
            this.role = value;
        }

        /**
         * Gets the value of the roleuri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoleuri() {
            return roleuri;
        }

        /**
         * Sets the value of the roleuri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoleuri(String value) {
            this.roleuri = value;
        }

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * Gets the value of the g2Flag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getG2Flag() {
            if (g2Flag == null) {
                return "RCONT";
            } else {
                return g2Flag;
            }
        }

        /**
         * Sets the value of the g2Flag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setG2Flag(String value) {
            this.g2Flag = value;
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
         * Gets the value of the wordcount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWordcount() {
            return wordcount;
        }

        /**
         * Sets the value of the wordcount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWordcount(BigInteger value) {
            this.wordcount = value;
        }

        /**
         * Gets the value of the linecount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLinecount() {
            return linecount;
        }

        /**
         * Sets the value of the linecount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLinecount(BigInteger value) {
            this.linecount = value;
        }

        /**
         * Gets the value of the pagecount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPagecount() {
            return pagecount;
        }

        /**
         * Sets the value of the pagecount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPagecount(BigInteger value) {
            this.pagecount = value;
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
         * Gets the value of the widthunit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWidthunit() {
            return widthunit;
        }

        /**
         * Sets the value of the widthunit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWidthunit(String value) {
            this.widthunit = value;
        }

        /**
         * Gets the value of the widthunituri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWidthunituri() {
            return widthunituri;
        }

        /**
         * Sets the value of the widthunituri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWidthunituri(String value) {
            this.widthunituri = value;
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
         * Gets the value of the heightunit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHeightunit() {
            return heightunit;
        }

        /**
         * Sets the value of the heightunit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHeightunit(String value) {
            this.heightunit = value;
        }

        /**
         * Gets the value of the heightunituri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHeightunituri() {
            return heightunituri;
        }

        /**
         * Sets the value of the heightunituri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHeightunituri(String value) {
            this.heightunituri = value;
        }

        /**
         * Gets the value of the orientation property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOrientation() {
            return orientation;
        }

        /**
         * Sets the value of the orientation property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOrientation(BigInteger value) {
            this.orientation = value;
        }

        /**
         * Gets the value of the layoutorientation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLayoutorientation() {
            return layoutorientation;
        }

        /**
         * Sets the value of the layoutorientation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLayoutorientation(String value) {
            this.layoutorientation = value;
        }

        /**
         * Gets the value of the layoutorientationuri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLayoutorientationuri() {
            return layoutorientationuri;
        }

        /**
         * Sets the value of the layoutorientationuri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLayoutorientationuri(String value) {
            this.layoutorientationuri = value;
        }

        /**
         * Gets the value of the colourspace property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColourspace() {
            return colourspace;
        }

        /**
         * Sets the value of the colourspace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColourspace(String value) {
            this.colourspace = value;
        }

        /**
         * Gets the value of the colourspaceuri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColourspaceuri() {
            return colourspaceuri;
        }

        /**
         * Sets the value of the colourspaceuri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColourspaceuri(String value) {
            this.colourspaceuri = value;
        }

        /**
         * Gets the value of the colourindicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColourindicator() {
            return colourindicator;
        }

        /**
         * Sets the value of the colourindicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColourindicator(String value) {
            this.colourindicator = value;
        }

        /**
         * Gets the value of the colourindicatoruri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColourindicatoruri() {
            return colourindicatoruri;
        }

        /**
         * Sets the value of the colourindicatoruri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColourindicatoruri(String value) {
            this.colourindicatoruri = value;
        }

        /**
         * Gets the value of the colourdepth property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getColourdepth() {
            return colourdepth;
        }

        /**
         * Sets the value of the colourdepth property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setColourdepth(BigInteger value) {
            this.colourdepth = value;
        }

        /**
         * Gets the value of the resolution property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getResolution() {
            return resolution;
        }

        /**
         * Sets the value of the resolution property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setResolution(BigInteger value) {
            this.resolution = value;
        }

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * Gets the value of the durationunit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDurationunit() {
            return durationunit;
        }

        /**
         * Sets the value of the durationunit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDurationunit(String value) {
            this.durationunit = value;
        }

        /**
         * Gets the value of the durationunituri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDurationunituri() {
            return durationunituri;
        }

        /**
         * Sets the value of the durationunituri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDurationunituri(String value) {
            this.durationunituri = value;
        }

        /**
         * Gets the value of the audiocodec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAudiocodec() {
            return audiocodec;
        }

        /**
         * Sets the value of the audiocodec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAudiocodec(String value) {
            this.audiocodec = value;
        }

        /**
         * Gets the value of the audiocodecuri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAudiocodecuri() {
            return audiocodecuri;
        }

        /**
         * Sets the value of the audiocodecuri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAudiocodecuri(String value) {
            this.audiocodecuri = value;
        }

        /**
         * Gets the value of the audiobitrate property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAudiobitrate() {
            return audiobitrate;
        }

        /**
         * Sets the value of the audiobitrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAudiobitrate(BigInteger value) {
            this.audiobitrate = value;
        }

        /**
         * Gets the value of the audiovbr property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAudiovbr() {
            return audiovbr;
        }

        /**
         * Sets the value of the audiovbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAudiovbr(Boolean value) {
            this.audiovbr = value;
        }

        /**
         * Gets the value of the audiosamplesize property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAudiosamplesize() {
            return audiosamplesize;
        }

        /**
         * Sets the value of the audiosamplesize property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAudiosamplesize(BigInteger value) {
            this.audiosamplesize = value;
        }

        /**
         * Gets the value of the audiosamplerate property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAudiosamplerate() {
            return audiosamplerate;
        }

        /**
         * Sets the value of the audiosamplerate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAudiosamplerate(BigInteger value) {
            this.audiosamplerate = value;
        }

        /**
         * Gets the value of the audiochannels property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAudiochannels() {
            return audiochannels;
        }

        /**
         * Sets the value of the audiochannels property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAudiochannels(String value) {
            this.audiochannels = value;
        }

        /**
         * Gets the value of the audiochannelsuri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAudiochannelsuri() {
            return audiochannelsuri;
        }

        /**
         * Sets the value of the audiochannelsuri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAudiochannelsuri(String value) {
            this.audiochannelsuri = value;
        }

        /**
         * Gets the value of the videocodec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVideocodec() {
            return videocodec;
        }

        /**
         * Sets the value of the videocodec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVideocodec(String value) {
            this.videocodec = value;
        }

        /**
         * Gets the value of the videocodecuri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVideocodecuri() {
            return videocodecuri;
        }

        /**
         * Sets the value of the videocodecuri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVideocodecuri(String value) {
            this.videocodecuri = value;
        }

        /**
         * Gets the value of the videoavgbitrate property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getVideoavgbitrate() {
            return videoavgbitrate;
        }

        /**
         * Sets the value of the videoavgbitrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setVideoavgbitrate(BigInteger value) {
            this.videoavgbitrate = value;
        }

        /**
         * Gets the value of the videovbr property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVideovbr() {
            return videovbr;
        }

        /**
         * Sets the value of the videovbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVideovbr(Boolean value) {
            this.videovbr = value;
        }

        /**
         * Gets the value of the videoframerate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVideoframerate() {
            return videoframerate;
        }

        /**
         * Sets the value of the videoframerate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVideoframerate(BigDecimal value) {
            this.videoframerate = value;
        }

        /**
         * Gets the value of the videoscan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVideoscan() {
            return videoscan;
        }

        /**
         * Sets the value of the videoscan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVideoscan(String value) {
            this.videoscan = value;
        }

        /**
         * Gets the value of the videoaspectratio property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVideoaspectratio() {
            return videoaspectratio;
        }

        /**
         * Sets the value of the videoaspectratio property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVideoaspectratio(String value) {
            this.videoaspectratio = value;
        }

        /**
         * Gets the value of the videosampling property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVideosampling() {
            return videosampling;
        }

        /**
         * Sets the value of the videosampling property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVideosampling(String value) {
            this.videosampling = value;
        }

        /**
         * Gets the value of the videoscaling property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVideoscaling() {
            return videoscaling;
        }

        /**
         * Sets the value of the videoscaling property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVideoscaling(String value) {
            this.videoscaling = value;
        }

        /**
         * Gets the value of the videoscalinguri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVideoscalinguri() {
            return videoscalinguri;
        }

        /**
         * Sets the value of the videoscalinguri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVideoscalinguri(String value) {
            this.videoscalinguri = value;
        }

        /**
         * Gets the value of the videodefinition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVideodefinition() {
            return videodefinition;
        }

        /**
         * Sets the value of the videodefinition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVideodefinition(String value) {
            this.videodefinition = value;
        }

        /**
         * Gets the value of the videodefinitionuri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVideodefinitionuri() {
            return videodefinitionuri;
        }

        /**
         * Sets the value of the videodefinitionuri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVideodefinitionuri(String value) {
            this.videodefinitionuri = value;
        }

    }

}
