
package gex.newsml.g2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type type for a property with a  QCode value in a qcode attribute and optional names
 * 
 * <p>Java class for QualPropType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualPropType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}QCodePropType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}name"/>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}hierarchyInfo"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}i18nAttributes"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualPropType", propOrder = {
    "nameOrHierarchyInfo"
})
@XmlSeeAlso({
    gex.newsml.g2.HopHistory.Hop.Action.class,
    TypedQualPropType.class,
    Signal.class
})
public class QualPropType
    extends QCodePropType
{

    @XmlElements({
        @XmlElement(name = "name", type = ConceptNameType.class),
        @XmlElement(name = "hierarchyInfo", type = HierarchyInfo.class)
    })
    protected List<Object> nameOrHierarchyInfo;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;

    /**
     * Gets the value of the nameOrHierarchyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameOrHierarchyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameOrHierarchyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptNameType }
     * {@link HierarchyInfo }
     * 
     * 
     */
    public List<Object> getNameOrHierarchyInfo() {
        if (nameOrHierarchyInfo == null) {
            nameOrHierarchyInfo = new ArrayList<Object>();
        }
        return this.nameOrHierarchyInfo;
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

}
