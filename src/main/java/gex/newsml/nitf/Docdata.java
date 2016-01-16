
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
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}correction"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}evloc"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}doc-id"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}del-list"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}urgency"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}fixture"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}date.issue"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}date.release"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}date.expire"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}doc-scope"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}series"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}ed-msg"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}du-key"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}doc.copyright"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}doc.rights"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}key-list"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}identified-content"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://iptc.org/std/NITF/2006-10-18/}globalNITFAttributes"/>
 *       &lt;attribute name="management-status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="management-doc-idref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="management-idref-status" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "correctionOrEvlocOrDocId"
})
@XmlRootElement(name = "docdata")
@ToString public class Docdata {

    @XmlElementRefs({
        @XmlElementRef(name = "doc.copyright", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = DocCopyright.class, required = false),
        @XmlElementRef(name = "fixture", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Fixture.class, required = false),
        @XmlElementRef(name = "date.expire", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = DateExpire.class, required = false),
        @XmlElementRef(name = "doc-scope", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = DocScope.class, required = false),
        @XmlElementRef(name = "urgency", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Urgency.class, required = false),
        @XmlElementRef(name = "date.issue", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = DateIssue.class, required = false),
        @XmlElementRef(name = "du-key", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = DuKey.class, required = false),
        @XmlElementRef(name = "doc.rights", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = DocRights.class, required = false),
        @XmlElementRef(name = "correction", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Correction.class, required = false),
        @XmlElementRef(name = "evloc", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Evloc.class, required = false),
        @XmlElementRef(name = "key-list", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = KeyList.class, required = false),
        @XmlElementRef(name = "series", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Series.class, required = false),
        @XmlElementRef(name = "identified-content", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = IdentifiedContent.class, required = false),
        @XmlElementRef(name = "doc-id", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = DocId.class, required = false),
        @XmlElementRef(name = "date.release", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = DateRelease.class, required = false),
        @XmlElementRef(name = "del-list", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = DelList.class, required = false),
        @XmlElementRef(name = "ed-msg", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = EdMsg.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> correctionOrEvlocOrDocId;
    @XmlAttribute(name = "management-status")
    protected String managementStatus;
    @XmlAttribute(name = "management-doc-idref")
    protected String managementDocIdref;
    @XmlAttribute(name = "management-idref-status")
    protected String managementIdrefStatus;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the correctionOrEvlocOrDocId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correctionOrEvlocOrDocId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrectionOrEvlocOrDocId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocCopyright }
     * {@link Fixture }
     * {@link DateExpire }
     * {@link DocScope }
     * {@link Urgency }
     * {@link DateIssue }
     * {@link DuKey }
     * {@link DocRights }
     * {@link Correction }
     * {@link Evloc }
     * {@link KeyList }
     * {@link Object }
     * {@link Series }
     * {@link IdentifiedContent }
     * {@link DocId }
     * {@link DateRelease }
     * {@link DelList }
     * {@link Element }
     * {@link EdMsg }
     * 
     * 
     */
    public List<Object> getCorrectionOrEvlocOrDocId() {
        if (correctionOrEvlocOrDocId == null) {
            correctionOrEvlocOrDocId = new ArrayList<Object>();
        }
        return this.correctionOrEvlocOrDocId;
    }

    /**
     * Gets the value of the managementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementStatus() {
        return managementStatus;
    }

    /**
     * Sets the value of the managementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementStatus(String value) {
        this.managementStatus = value;
    }

    /**
     * Gets the value of the managementDocIdref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementDocIdref() {
        return managementDocIdref;
    }

    /**
     * Sets the value of the managementDocIdref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementDocIdref(String value) {
        this.managementDocIdref = value;
    }

    /**
     * Gets the value of the managementIdrefStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementIdrefStatus() {
        return managementIdrefStatus;
    }

    /**
     * Sets the value of the managementIdrefStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementIdrefStatus(String value) {
        this.managementIdrefStatus = value;
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
