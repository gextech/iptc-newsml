
package gex.newsml.g2;

import lombok.ToString;


import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The type to cover all qualifers for an audience property
 * 
 * <p>Java class for AudienceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudienceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}Flex1PropType">
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}quantifyAttributes"/>
 *       &lt;attribute name="significance" type="{http://iptc.org/std/nar/2006-10-01/}Int1to9Type" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceType")
@ToString public class AudienceType
    extends Flex1PropType
{

    @XmlAttribute(name = "significance")
    protected Integer significance;
    @XmlAttribute(name = "confidence")
    protected Integer confidence;
    @XmlAttribute(name = "relevance")
    protected Integer relevance;
    @XmlAttribute(name = "derivedfrom")
    protected List<String> derivedfrom;

    /**
     * Gets the value of the significance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSignificance() {
        return significance;
    }

    /**
     * Sets the value of the significance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSignificance(Integer value) {
        this.significance = value;
    }

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfidence(Integer value) {
        this.confidence = value;
    }

    /**
     * Gets the value of the relevance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelevance() {
        return relevance;
    }

    /**
     * Sets the value of the relevance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelevance(Integer value) {
        this.relevance = value;
    }

    /**
     * Gets the value of the derivedfrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derivedfrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivedfrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDerivedfrom() {
        if (derivedfrom == null) {
            derivedfrom = new ArrayList<String>();
        }
        return this.derivedfrom;
    }

}
