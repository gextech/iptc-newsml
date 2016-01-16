
package gex.newsml.nitf;

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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://iptc.org/std/NITF/2006-10-18/}enrichedText"/>
 *         &lt;group ref="{http://iptc.org/std/NITF/2006-10-18/}blockContent"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://iptc.org/std/NITF/2006-10-18/}commonNITFAttributes"/>
 *       &lt;attribute name="align">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="top"/>
 *             &lt;enumeration value="bottom"/>
 *             &lt;enumeration value="left"/>
 *             &lt;enumeration value="right"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "caption")
@ToString public class Caption {

    @XmlElementRefs({
        @XmlElementRef(name = "lang", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Lang.class, required = false),
        @XmlElementRef(name = "nitf-table", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = NitfTable.class, required = false),
        @XmlElementRef(name = "classifier", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Classifier.class, required = false),
        @XmlElementRef(name = "bq", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Bq.class, required = false),
        @XmlElementRef(name = "note", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Note.class, required = false),
        @XmlElementRef(name = "virtloc", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Virtloc.class, required = false),
        @XmlElementRef(name = "location", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Location.class, required = false),
        @XmlElementRef(name = "chron", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Chron.class, required = false),
        @XmlElementRef(name = "fn", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Fn.class, required = false),
        @XmlElementRef(name = "money", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Money.class, required = false),
        @XmlElementRef(name = "pre", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Pre.class, required = false),
        @XmlElementRef(name = "hr", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Hr.class, required = false),
        @XmlElementRef(name = "dl", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Dl.class, required = false),
        @XmlElementRef(name = "hl2", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Hl2 .class, required = false),
        @XmlElementRef(name = "table", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Table.class, required = false),
        @XmlElementRef(name = "person", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Person.class, required = false),
        @XmlElementRef(name = "ol", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Ol.class, required = false),
        @XmlElementRef(name = "q", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Q.class, required = false),
        @XmlElementRef(name = "p", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = P.class, required = false),
        @XmlElementRef(name = "function", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Function.class, required = false),
        @XmlElementRef(name = "object.title", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = ObjectTitle.class, required = false),
        @XmlElementRef(name = "event", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Event.class, required = false),
        @XmlElementRef(name = "media", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Media.class, required = false),
        @XmlElementRef(name = "postaddr", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Postaddr.class, required = false),
        @XmlElementRef(name = "pronounce", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Pronounce.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Br.class, required = false),
        @XmlElementRef(name = "num", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Num.class, required = false),
        @XmlElementRef(name = "a", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = A.class, required = false),
        @XmlElementRef(name = "ul", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Ul.class, required = false),
        @XmlElementRef(name = "em", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Em.class, required = false),
        @XmlElementRef(name = "org", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Org.class, required = false),
        @XmlElementRef(name = "copyrite", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Copyrite.class, required = false)
    })
    @XmlMixed
    @XmlAnyElement(lax = true)
    protected List<Object> content;
    @XmlAttribute(name = "align")
    protected String align;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lang }
     * {@link NitfTable }
     * {@link Classifier }
     * {@link Bq }
     * {@link Note }
     * {@link Virtloc }
     * {@link Location }
     * {@link Chron }
     * {@link Fn }
     * {@link Money }
     * {@link Pre }
     * {@link Hr }
     * {@link Dl }
     * {@link Hl2 }
     * {@link Table }
     * {@link Person }
     * {@link Ol }
     * {@link Object }
     * {@link Q }
     * {@link P }
     * {@link String }
     * {@link Function }
     * {@link ObjectTitle }
     * {@link Event }
     * {@link Media }
     * {@link Postaddr }
     * {@link Pronounce }
     * {@link Br }
     * {@link Num }
     * {@link A }
     * {@link Ul }
     * {@link Em }
     * {@link Element }
     * {@link Org }
     * {@link Copyrite }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlign() {
        return align;
    }

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlign(String value) {
        this.align = value;
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
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Language value governed by RFC3066. Example: en-US.
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
