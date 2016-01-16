
package gex.newsml.nitf;

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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}tobject" minOccurs="0"/>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}key-list" minOccurs="0"/>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}classifier" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}byline" minOccurs="0"/>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}dateline" minOccurs="0"/>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}copyrite" minOccurs="0"/>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}abstract" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;group ref="{http://iptc.org/std/NITF/2006-10-18/}blockContent"/>
 *         &lt;/choice>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}datasource" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/NITF/2006-10-18/}commonNITFAttributes"/>
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
    "tobject",
    "keyList",
    "classifier",
    "byline",
    "dateline",
    "copyrite",
    "_abstract",
    "pOrHl2OrTable",
    "datasource",
    "any"
})
@XmlRootElement(name = "block")
public class Block {

    protected Tobject tobject;
    @XmlElement(name = "key-list")
    protected KeyList keyList;
    protected List<Classifier> classifier;
    protected Byline byline;
    protected Dateline dateline;
    protected Copyrite copyrite;
    @XmlElement(name = "abstract")
    protected List<Abstract> _abstract;
    @XmlElements({
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "hl2", type = Hl2 .class),
        @XmlElement(name = "table", type = Table.class),
        @XmlElement(name = "nitf-table", type = NitfTable.class),
        @XmlElement(name = "media", type = Media.class),
        @XmlElement(name = "ol", type = Ol.class),
        @XmlElement(name = "ul", type = Ul.class),
        @XmlElement(name = "dl", type = Dl.class),
        @XmlElement(name = "bq", type = Bq.class),
        @XmlElement(name = "fn", type = Fn.class),
        @XmlElement(name = "note", type = Note.class),
        @XmlElement(name = "pre", type = Pre.class),
        @XmlElement(name = "hr", type = Hr.class)
    })
    protected List<Object> pOrHl2OrTable;
    protected Datasource datasource;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
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
     * Gets the value of the tobject property.
     * 
     * @return
     *     possible object is
     *     {@link Tobject }
     *     
     */
    public Tobject getTobject() {
        return tobject;
    }

    /**
     * Sets the value of the tobject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tobject }
     *     
     */
    public void setTobject(Tobject value) {
        this.tobject = value;
    }

    /**
     * Gets the value of the keyList property.
     * 
     * @return
     *     possible object is
     *     {@link KeyList }
     *     
     */
    public KeyList getKeyList() {
        return keyList;
    }

    /**
     * Sets the value of the keyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyList }
     *     
     */
    public void setKeyList(KeyList value) {
        this.keyList = value;
    }

    /**
     * Gets the value of the classifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Classifier }
     * 
     * 
     */
    public List<Classifier> getClassifier() {
        if (classifier == null) {
            classifier = new ArrayList<Classifier>();
        }
        return this.classifier;
    }

    /**
     * Gets the value of the byline property.
     * 
     * @return
     *     possible object is
     *     {@link Byline }
     *     
     */
    public Byline getByline() {
        return byline;
    }

    /**
     * Sets the value of the byline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byline }
     *     
     */
    public void setByline(Byline value) {
        this.byline = value;
    }

    /**
     * Gets the value of the dateline property.
     * 
     * @return
     *     possible object is
     *     {@link Dateline }
     *     
     */
    public Dateline getDateline() {
        return dateline;
    }

    /**
     * Sets the value of the dateline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dateline }
     *     
     */
    public void setDateline(Dateline value) {
        this.dateline = value;
    }

    /**
     * Gets the value of the copyrite property.
     * 
     * @return
     *     possible object is
     *     {@link Copyrite }
     *     
     */
    public Copyrite getCopyrite() {
        return copyrite;
    }

    /**
     * Sets the value of the copyrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Copyrite }
     *     
     */
    public void setCopyrite(Copyrite value) {
        this.copyrite = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Abstract }
     * 
     * 
     */
    public List<Abstract> getAbstract() {
        if (_abstract == null) {
            _abstract = new ArrayList<Abstract>();
        }
        return this._abstract;
    }

    /**
     * Gets the value of the pOrHl2OrTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pOrHl2OrTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOrHl2OrTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P }
     * {@link Hl2 }
     * {@link Table }
     * {@link NitfTable }
     * {@link Media }
     * {@link Ol }
     * {@link Ul }
     * {@link Dl }
     * {@link Bq }
     * {@link Fn }
     * {@link Note }
     * {@link Pre }
     * {@link Hr }
     * 
     * 
     */
    public List<Object> getPOrHl2OrTable() {
        if (pOrHl2OrTable == null) {
            pOrHl2OrTable = new ArrayList<Object>();
        }
        return this.pOrHl2OrTable;
    }

    /**
     * Gets the value of the datasource property.
     * 
     * @return
     *     possible object is
     *     {@link Datasource }
     *     
     */
    public Datasource getDatasource() {
        return datasource;
    }

    /**
     * Sets the value of the datasource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Datasource }
     *     
     */
    public void setDatasource(Datasource value) {
        this.datasource = value;
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
