
package gex.newsml.g2;

import java.util.ArrayList;
import java.util.List;
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
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>IntlStringType2">
 *       &lt;attribute name="type" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *       &lt;attribute name="typeuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *       &lt;attribute name="environment" type="{http://iptc.org/std/nar/2006-10-01/}QCodeListType" />
 *       &lt;attribute name="environmenturi" type="{http://iptc.org/std/nar/2006-10-01/}IRIListType" />
 *       &lt;attribute name="idformat" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *       &lt;attribute name="idformaturi" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "altId")
public class AltId
    extends IntlStringType2
{

    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "typeuri")
    protected String typeuri;
    @XmlAttribute(name = "environment")
    protected List<String> environment;
    @XmlAttribute(name = "environmenturi")
    protected List<String> environmenturi;
    @XmlAttribute(name = "idformat")
    protected String idformat;
    @XmlAttribute(name = "idformaturi")
    protected String idformaturi;

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

    /**
     * Gets the value of the environment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEnvironment() {
        if (environment == null) {
            environment = new ArrayList<String>();
        }
        return this.environment;
    }

    /**
     * Gets the value of the environmenturi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmenturi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmenturi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEnvironmenturi() {
        if (environmenturi == null) {
            environmenturi = new ArrayList<String>();
        }
        return this.environmenturi;
    }

    /**
     * Gets the value of the idformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdformat() {
        return idformat;
    }

    /**
     * Sets the value of the idformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdformat(String value) {
        this.idformat = value;
    }

    /**
     * Gets the value of the idformaturi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdformaturi() {
        return idformaturi;
    }

    /**
     * Sets the value of the idformaturi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdformaturi(String value) {
        this.idformaturi = value;
    }

}
