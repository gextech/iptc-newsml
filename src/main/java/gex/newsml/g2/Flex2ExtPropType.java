
package gex.newsml.g2;

import lombok.ToString;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 *  Flexible generic PCL-Type for controlled, uncontrolled values and arbitrary values, with mandatory relationship
 * 
 * <p>Java class for Flex2ExtPropType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Flex2ExtPropType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}Flex1ExtPropType">
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}timeValidityAttributes"/>
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
@XmlType(name = "Flex2ExtPropType")
@ToString public class Flex2ExtPropType
    extends Flex1ExtPropType
{

    @XmlAttribute(name = "rel")
    protected String rel;
    @XmlAttribute(name = "reluri")
    protected String reluri;
    @XmlAttribute(name = "validfrom")
    protected String validfrom;
    @XmlAttribute(name = "validto")
    protected String validto;

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

    /**
     * Gets the value of the validfrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidfrom() {
        return validfrom;
    }

    /**
     * Sets the value of the validfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidfrom(String value) {
        this.validfrom = value;
    }

    /**
     * Gets the value of the validto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidto() {
        return validto;
    }

    /**
     * Sets the value of the validto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidto(String value) {
        this.validto = value;
    }

}
