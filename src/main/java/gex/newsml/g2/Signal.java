
package gex.newsml.g2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}QualPropType">
 *       &lt;attribute name="severity" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *       &lt;attribute name="severityuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "signal")
public class Signal
    extends QualPropType
{

    @XmlAttribute(name = "severity")
    protected String severity;
    @XmlAttribute(name = "severityuri")
    protected String severityuri;

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the severityuri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverityuri() {
        return severityuri;
    }

    /**
     * Sets the value of the severityuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverityuri(String value) {
        this.severityuri = value;
    }

}
