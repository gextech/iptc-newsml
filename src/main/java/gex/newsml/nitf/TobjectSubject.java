
package gex.newsml.nitf;

import lombok.ToString;


import java.util.HashMap;
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
 *       &lt;attGroup ref="{http://iptc.org/std/NITF/2006-10-18/}globalNITFAttributes"/>
 *       &lt;attribute name="tobject.subject.ipr" type="{http://www.w3.org/2001/XMLSchema}string" default="IPTC" />
 *       &lt;attribute name="tobject.subject.refnum" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="tobject.subject.code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tobject.subject.type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tobject.subject.matter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tobject.subject.detail" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "tobject.subject")
@ToString public class TobjectSubject {

    @XmlAttribute(name = "tobject.subject.ipr")
    protected String tobjectSubjectIpr;
    @XmlAttribute(name = "tobject.subject.refnum", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String tobjectSubjectRefnum;
    @XmlAttribute(name = "tobject.subject.code")
    protected String tobjectSubjectCode;
    @XmlAttribute(name = "tobject.subject.type")
    protected String tobjectSubjectType;
    @XmlAttribute(name = "tobject.subject.matter")
    protected String tobjectSubjectMatter;
    @XmlAttribute(name = "tobject.subject.detail")
    protected String tobjectSubjectDetail;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the tobjectSubjectIpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTobjectSubjectIpr() {
        if (tobjectSubjectIpr == null) {
            return "IPTC";
        } else {
            return tobjectSubjectIpr;
        }
    }

    /**
     * Sets the value of the tobjectSubjectIpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTobjectSubjectIpr(String value) {
        this.tobjectSubjectIpr = value;
    }

    /**
     * Gets the value of the tobjectSubjectRefnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTobjectSubjectRefnum() {
        return tobjectSubjectRefnum;
    }

    /**
     * Sets the value of the tobjectSubjectRefnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTobjectSubjectRefnum(String value) {
        this.tobjectSubjectRefnum = value;
    }

    /**
     * Gets the value of the tobjectSubjectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTobjectSubjectCode() {
        return tobjectSubjectCode;
    }

    /**
     * Sets the value of the tobjectSubjectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTobjectSubjectCode(String value) {
        this.tobjectSubjectCode = value;
    }

    /**
     * Gets the value of the tobjectSubjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTobjectSubjectType() {
        return tobjectSubjectType;
    }

    /**
     * Sets the value of the tobjectSubjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTobjectSubjectType(String value) {
        this.tobjectSubjectType = value;
    }

    /**
     * Gets the value of the tobjectSubjectMatter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTobjectSubjectMatter() {
        return tobjectSubjectMatter;
    }

    /**
     * Sets the value of the tobjectSubjectMatter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTobjectSubjectMatter(String value) {
        this.tobjectSubjectMatter = value;
    }

    /**
     * Gets the value of the tobjectSubjectDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTobjectSubjectDetail() {
        return tobjectSubjectDetail;
    }

    /**
     * Sets the value of the tobjectSubjectDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTobjectSubjectDetail(String value) {
        this.tobjectSubjectDetail = value;
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
