
package gex.newsml.g2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * An expression of rights in natural language or as a reference to remote information
 * 
 * <p>Java class for RightsBlockType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RightsBlockType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}BlockType">
 *       &lt;attribute name="href" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RightsBlockType")
public class RightsBlockType
    extends BlockType
{

    @XmlAttribute(name = "href")
    protected String href;

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

}
