
package gex.newsml.g2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Flexible generic type for both controlled and uncontrolled values of a related concept
 * 
 * <p>Java class for FlexRelatedPropType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlexRelatedPropType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}FlexProp2Type">
 *       &lt;attribute name="rel" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *       &lt;attribute name="reluri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexRelatedPropType")
public class FlexRelatedPropType
    extends FlexProp2Type
{

    @XmlAttribute(name = "rel")
    protected String rel;
    @XmlAttribute(name = "reluri")
    protected String reluri;

    /**
     * Gets the value of the rel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRel() {
        return rel;
    }

    /**
     * Sets the value of the rel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRel(String value) {
        this.rel = value;
    }

    /**
     * Gets the value of the reluri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReluri() {
        return reluri;
    }

    /**
     * Sets the value of the reluri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReluri(String value) {
        this.reluri = value;
    }

}
