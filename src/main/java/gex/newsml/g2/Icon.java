
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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


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
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}mediaContentCharacteristics1"/>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}targetResourceAttributes"/>
 *       &lt;attribute name="rendition" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *       &lt;attribute name="renditionuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
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
@XmlRootElement(name = "icon")
@ToString public class Icon {

    @XmlAttribute(name = "rendition")
    protected String rendition;
    @XmlAttribute(name = "renditionuri")
    protected String renditionuri;
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
    @XmlAttribute(name = "videocodec")
    protected String videocodec;
    @XmlAttribute(name = "videocodecuri")
    protected String videocodecuri;
    @XmlAttribute(name = "colourdepth")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger colourdepth;
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
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
