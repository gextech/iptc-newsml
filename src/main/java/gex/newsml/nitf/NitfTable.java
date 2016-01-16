
package gex.newsml.nitf;

import lombok.ToString;


import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}nitf-table-metadata"/>
 *         &lt;choice>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}table"/>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}custom-table"/>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}table-reference"/>
 *         &lt;/choice>
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
    "nitfTableMetadata",
    "table",
    "customTable",
    "tableReference"
})
@XmlRootElement(name = "nitf-table")
@ToString public class NitfTable {

    @XmlElement(name = "nitf-table-metadata", required = true)
    protected NitfTableMetadata nitfTableMetadata;
    protected Table table;
    @XmlElement(name = "custom-table")
    protected CustomTable customTable;
    @XmlElement(name = "table-reference")
    protected TableReference tableReference;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the nitfTableMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link NitfTableMetadata }
     *     
     */
    public NitfTableMetadata getNitfTableMetadata() {
        return nitfTableMetadata;
    }

    /**
     * Sets the value of the nitfTableMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link NitfTableMetadata }
     *     
     */
    public void setNitfTableMetadata(NitfTableMetadata value) {
        this.nitfTableMetadata = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link Table }
     *     
     */
    public Table getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link Table }
     *     
     */
    public void setTable(Table value) {
        this.table = value;
    }

    /**
     * Gets the value of the customTable property.
     * 
     * @return
     *     possible object is
     *     {@link CustomTable }
     *     
     */
    public CustomTable getCustomTable() {
        return customTable;
    }

    /**
     * Sets the value of the customTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomTable }
     *     
     */
    public void setCustomTable(CustomTable value) {
        this.customTable = value;
    }

    /**
     * Gets the value of the tableReference property.
     * 
     * @return
     *     possible object is
     *     {@link TableReference }
     *     
     */
    public TableReference getTableReference() {
        return tableReference;
    }

    /**
     * Sets the value of the tableReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableReference }
     *     
     */
    public void setTableReference(TableReference value) {
        this.tableReference = value;
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
