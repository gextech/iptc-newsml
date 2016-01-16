
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
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}title" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}meta" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}tobject" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}iim" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}docdata" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}pubdata" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}revision-history" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/NITF/2006-10-18/}globalNITFAttributes"/>
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
    "title",
    "meta",
    "tobject",
    "iim",
    "docdata",
    "pubdata",
    "revisionHistory",
    "any"
})
@XmlRootElement(name = "head")
public class Head {

    protected Title title;
    protected List<Meta> meta;
    protected Tobject tobject;
    protected Iim iim;
    protected Docdata docdata;
    protected List<Pubdata> pubdata;
    @XmlElement(name = "revision-history")
    protected List<RevisionHistory> revisionHistory;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 
     * 							Partial description	Document Title.
     * 							Full description	Often displayed within a result-list after a search finds this article.
     * 						
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * 
     * 							Partial description	A construct for sending generic metadata.
     * 							Full description	Normally is undisplayed.
     * 						Gets the value of the meta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Meta }
     * 
     * 
     */
    public List<Meta> getMeta() {
        if (meta == null) {
            meta = new ArrayList<Meta>();
        }
        return this.meta;
    }

    /**
     * 
     * 							Partial description	Subject code.
     * 							Full description	Used to identify the type of the news material, based on a Subject Code system.
     * 						
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
     * 
     * 							Partial description	IIM Record 2 Data Container.
     * 							Full description	Location for IIM Record 2 DataSet information.
     * 						
     * 
     * @return
     *     possible object is
     *     {@link Iim }
     *     
     */
    public Iim getIim() {
        return iim;
    }

    /**
     * Sets the value of the iim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Iim }
     *     
     */
    public void setIim(Iim value) {
        this.iim = value;
    }

    /**
     * 
     * 							Partial description		Document metadata.
     * 							Full description		Container for metadata information about this particular document.
     * 						
     * 
     * @return
     *     possible object is
     *     {@link Docdata }
     *     
     */
    public Docdata getDocdata() {
        return docdata;
    }

    /**
     * Sets the value of the docdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Docdata }
     *     
     */
    public void setDocdata(Docdata value) {
        this.docdata = value;
    }

    /**
     * 
     * 							Partial description	Information about specific instance of an item's publication.
     * 							Full description	Contains metadata about how the particular news object was used in a specific instance.
     * 						Gets the value of the pubdata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubdata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubdata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pubdata }
     * 
     * 
     */
    public List<Pubdata> getPubdata() {
        if (pubdata == null) {
            pubdata = new ArrayList<Pubdata>();
        }
        return this.pubdata;
    }

    /**
     * 
     * 							Partial description	Information about the creative history of the document; also used as an audit trail.
     * 							Full description	Includes who made changes, when the changes were made, and why.
     * 						Gets the value of the revisionHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revisionHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevisionHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevisionHistory }
     * 
     * 
     */
    public List<RevisionHistory> getRevisionHistory() {
        if (revisionHistory == null) {
            revisionHistory = new ArrayList<RevisionHistory>();
        }
        return this.revisionHistory;
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
