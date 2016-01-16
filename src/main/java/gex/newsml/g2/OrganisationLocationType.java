
package gex.newsml.g2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The type for a location of an organisation (Type defined in this XML Schema only)
 * 
 * <p>Java class for OrganisationLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationLocationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}FlexLocationPropType">
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}timeValidityAttributes"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationLocationType")
public class OrganisationLocationType
    extends FlexLocationPropType
{

    @XmlAttribute(name = "validfrom")
    protected String validfrom;
    @XmlAttribute(name = "validto")
    protected String validto;

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
