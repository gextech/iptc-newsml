
package gex.newsml.g2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * Flexible generic PCL-type for controlled, uncontrolled values and arbitrary values
 * 
 * <p>Java class for Flex1ExtPropType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Flex1ExtPropType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}Flex1PropType">
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}arbitraryValueAttributes"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flex1ExtPropType")
@XmlSeeAlso({
    Flex2ExtPropType.class
})
public class Flex1ExtPropType
    extends Flex1PropType
{

    @XmlAttribute(name = "value")
    protected String value;
    @XmlAttribute(name = "valuedatatype")
    protected QName valuedatatype;
    @XmlAttribute(name = "valueunit")
    protected String valueunit;
    @XmlAttribute(name = "valueunituri")
    protected String valueunituri;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the valuedatatype property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getValuedatatype() {
        return valuedatatype;
    }

    /**
     * Sets the value of the valuedatatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setValuedatatype(QName value) {
        this.valuedatatype = value;
    }

    /**
     * Gets the value of the valueunit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueunit() {
        return valueunit;
    }

    /**
     * Sets the value of the valueunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueunit(String value) {
        this.valueunit = value;
    }

    /**
     * Gets the value of the valueunituri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueunituri() {
        return valueunituri;
    }

    /**
     * Sets the value of the valueunituri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueunituri(String value) {
        this.valueunituri = value;
    }

}
