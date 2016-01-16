
package gex.newsml.g2;

import lombok.ToString;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The type for a property with a QCode, a type and optional names
 * 
 * <p>Java class for TypedQualPropType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypedQualPropType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}QualPropType">
 *       &lt;attribute name="type" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *       &lt;attribute name="typeuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypedQualPropType")
@ToString public class TypedQualPropType
    extends QualPropType
{

    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "typeuri")
    protected String typeuri;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeuri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeuri() {
        return typeuri;
    }

    /**
     * Sets the value of the typeuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeuri(String value) {
        this.typeuri = value;
    }

}
