
package gex.newsml.g2;

import lombok.ToString;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The type for an identifier of a related concept 
 * 
 * <p>Java class for RelatedConceptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedConceptType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}FlexPropType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}facet"/>
 *         &lt;element name="related">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}FlexPropType">
 *                 &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}timeValidityAttributes"/>
 *                 &lt;attribute name="rel" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *                 &lt;attribute name="reluri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *                 &lt;attribute name="rank" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;anyAttribute processContents='lax' namespace='##other'/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}sameAs"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}timeValidityAttributes"/>
 *       &lt;attribute name="rel" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *       &lt;attribute name="reluri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *       &lt;attribute name="rank" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedConceptType", propOrder = {
    "facetOrRelatedOrSameAs"
})
@XmlSeeAlso({
    FlexRelatedConceptType.class
})
@ToString public class RelatedConceptType
    extends FlexPropType
{

    @XmlElements({
        @XmlElement(name = "facet", type = Facet.class),
        @XmlElement(name = "related", type = RelatedConceptType.Related.class),
        @XmlElement(name = "sameAs", type = SameAsType.class)
    })
    protected List<FlexPropType> facetOrRelatedOrSameAs;
    @XmlAttribute(name = "rel")
    protected String rel;
    @XmlAttribute(name = "reluri")
    protected String reluri;
    @XmlAttribute(name = "rank")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger rank;
    @XmlAttribute(name = "validfrom")
    protected String validfrom;
    @XmlAttribute(name = "validto")
    protected String validto;

    /**
     * Gets the value of the facetOrRelatedOrSameAs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facetOrRelatedOrSameAs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacetOrRelatedOrSameAs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Facet }
     * {@link RelatedConceptType.Related }
     * {@link SameAsType }
     * 
     * 
     */
    public List<FlexPropType> getFacetOrRelatedOrSameAs() {
        if (facetOrRelatedOrSameAs == null) {
            facetOrRelatedOrSameAs = new ArrayList<FlexPropType>();
        }
        return this.facetOrRelatedOrSameAs;
    }

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
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRank(BigInteger value) {
        this.rank = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}FlexPropType">
     *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}timeValidityAttributes"/>
     *       &lt;attribute name="rel" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
     *       &lt;attribute name="reluri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
     *       &lt;attribute name="rank" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
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
    @ToString public static class Related
        extends FlexPropType
    {

        @XmlAttribute(name = "rel")
        protected String rel;
        @XmlAttribute(name = "reluri")
        protected String reluri;
        @XmlAttribute(name = "rank")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger rank;
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
         * Gets the value of the rank property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRank() {
            return rank;
        }

        /**
         * Sets the value of the rank property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRank(BigInteger value) {
            this.rank = value;
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

}
