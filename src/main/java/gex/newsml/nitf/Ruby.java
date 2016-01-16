
package gex.newsml.nitf;

import lombok.ToString;


import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}rb"/>
 *           &lt;choice>
 *             &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}rt"/>
 *             &lt;sequence>
 *               &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}rp"/>
 *               &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}rt"/>
 *               &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}rp"/>
 *             &lt;/sequence>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}rbc"/>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}rtc"/>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}rtc" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "ruby")
@ToString public class Ruby {

    @XmlElementRefs({
        @XmlElementRef(name = "rtc", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Rtc.class, required = false),
        @XmlElementRef(name = "rbc", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Rbc.class, required = false),
        @XmlElementRef(name = "rt", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Rt.class, required = false),
        @XmlElementRef(name = "rb", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Rb.class, required = false),
        @XmlElementRef(name = "rp", namespace = "http://iptc.org/std/NITF/2006-10-18/", type = Rp.class, required = false)
    })
    protected List<Object> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Rt" is used by two different parts of a schema. See: 
     * line 21 of https://www.iptc.org/std/NITF/3.6/specification/nitf-3-6-ruby-include.xsd
     * line 18 of https://www.iptc.org/std/NITF/3.6/specification/nitf-3-6-ruby-include.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rtc }
     * {@link Rt }
     * {@link Rb }
     * {@link Rbc }
     * {@link Rp }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
