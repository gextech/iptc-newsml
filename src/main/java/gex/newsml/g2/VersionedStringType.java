
package gex.newsml.g2;

import lombok.ToString;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The type extending IntlStringType by a version information
 * 
 * <p>Java class for VersionedStringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VersionedStringType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>IntlStringType">
 *       &lt;attribute name="versioninfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionedStringType")
@XmlSeeAlso({
    Generator.class
})
@ToString public class VersionedStringType
    extends IntlStringType
{

    @XmlAttribute(name = "versioninfo")
    protected String versioninfo;

    /**
     * Gets the value of the versioninfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersioninfo() {
        return versioninfo;
    }

    /**
     * Sets the value of the versioninfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersioninfo(String value) {
        this.versioninfo = value;
    }

}
