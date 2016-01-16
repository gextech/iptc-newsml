
package gex.newsml.nitf;

import lombok.ToString;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
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
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}block"/>
 *         &lt;group ref="{http://iptc.org/std/NITF/2006-10-18/}blockContent"/>
 *       &lt;/choice>
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
    "blockOrPOrHl2"
})
@XmlRootElement(name = "body.content")
@ToString public class BodyContent {

    @XmlElements({
        @XmlElement(name = "block", type = Block.class),
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
    protected List<Object> blockOrPOrHl2;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the blockOrPOrHl2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockOrPOrHl2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockOrPOrHl2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Block }
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
    public List<Object> getBlockOrPOrHl2() {
        if (blockOrPOrHl2 == null) {
            blockOrPOrHl2 = new ArrayList<Object>();
        }
        return this.blockOrPOrHl2;
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
