
package gex.newsml.g2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}title" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scheme" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}sameAsScheme"/>
 *                   &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}name"/>
 *                   &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}definition"/>
 *                   &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}note"/>
 *                   &lt;element name="sameAs">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>IRIType">
 *                           &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *                           &lt;attribute name="g2flag" type="{http://www.w3.org/2001/XMLSchema}string" fixed="DEPR-SCH" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *                 &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *                 &lt;attribute name="alias" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                 &lt;attribute name="uri" use="required" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *                 &lt;attribute name="authority" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *                 &lt;anyAttribute processContents='lax' namespace='##other'/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *       &lt;attribute name="additionalInfo" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *       &lt;attribute name="url" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *       &lt;attribute name="authority" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *       &lt;attribute name="guid" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "scheme"
})
@XmlRootElement(name = "catalog")
public class Catalog {

    protected List<Label1Type> title;
    @XmlElement(required = true)
    protected List<Catalog.Scheme> scheme;
    @XmlAttribute(name = "additionalInfo")
    protected String additionalInfo;
    @XmlAttribute(name = "url")
    protected String url;
    @XmlAttribute(name = "authority")
    protected String authority;
    @XmlAttribute(name = "guid")
    @XmlSchemaType(name = "anyURI")
    protected String guid;
    @XmlAttribute(name = "version")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger version;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "creator")
    protected String creator;
    @XmlAttribute(name = "creatoruri")
    protected String creatoruri;
    @XmlAttribute(name = "modified")
    protected String modified;
    @XmlAttribute(name = "custom")
    protected Boolean custom;
    @XmlAttribute(name = "how")
    protected String how;
    @XmlAttribute(name = "howuri")
    protected String howuri;
    @XmlAttribute(name = "why")
    protected String why;
    @XmlAttribute(name = "whyuri")
    protected String whyuri;
    @XmlAttribute(name = "pubconstraint")
    protected List<String> pubconstraint;
    @XmlAttribute(name = "pubconstrainturi")
    protected List<String> pubconstrainturi;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * A short natural language name for the Catalog.Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Label1Type }
     * 
     * 
     */
    public List<Label1Type> getTitle() {
        if (title == null) {
            title = new ArrayList<Label1Type>();
        }
        return this.title;
    }

    /**
     * Gets the value of the scheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Catalog.Scheme }
     * 
     * 
     */
    public List<Catalog.Scheme> getScheme() {
        if (scheme == null) {
            scheme = new ArrayList<Catalog.Scheme>();
        }
        return this.scheme;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the authority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * Sets the value of the authority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthority(String value) {
        this.authority = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the creatoruri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatoruri() {
        return creatoruri;
    }

    /**
     * Sets the value of the creatoruri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatoruri(String value) {
        this.creatoruri = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModified(String value) {
        this.modified = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustom(Boolean value) {
        this.custom = value;
    }

    /**
     * Gets the value of the how property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHow() {
        return how;
    }

    /**
     * Sets the value of the how property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHow(String value) {
        this.how = value;
    }

    /**
     * Gets the value of the howuri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHowuri() {
        return howuri;
    }

    /**
     * Sets the value of the howuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHowuri(String value) {
        this.howuri = value;
    }

    /**
     * Gets the value of the why property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhy() {
        return why;
    }

    /**
     * Sets the value of the why property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhy(String value) {
        this.why = value;
    }

    /**
     * Gets the value of the whyuri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhyuri() {
        return whyuri;
    }

    /**
     * Sets the value of the whyuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhyuri(String value) {
        this.whyuri = value;
    }

    /**
     * Gets the value of the pubconstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubconstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubconstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPubconstraint() {
        if (pubconstraint == null) {
            pubconstraint = new ArrayList<String>();
        }
        return this.pubconstraint;
    }

    /**
     * Gets the value of the pubconstrainturi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubconstrainturi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubconstrainturi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPubconstrainturi() {
        if (pubconstrainturi == null) {
            pubconstrainturi = new ArrayList<String>();
        }
        return this.pubconstrainturi;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}sameAsScheme"/>
     *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}name"/>
     *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}definition"/>
     *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}note"/>
     *         &lt;element name="sameAs">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>IRIType">
     *                 &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
     *                 &lt;attribute name="g2flag" type="{http://www.w3.org/2001/XMLSchema}string" fixed="DEPR-SCH" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
     *       &lt;attribute name="alias" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *       &lt;attribute name="uri" use="required" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
     *       &lt;attribute name="authority" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
     *       &lt;anyAttribute processContents='lax' namespace='##other'/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sameAsSchemeOrNameOrDefinition"
    })
    public static class Scheme {

        @XmlElements({
            @XmlElement(name = "sameAsScheme", type = SameAsScheme.class),
            @XmlElement(name = "name", type = ConceptNameType.class),
            @XmlElement(name = "definition", type = Definition.class),
            @XmlElement(name = "note", type = Note.class),
            @XmlElement(name = "sameAs", type = Catalog.Scheme.SameAs.class)
        })
        protected List<Object> sameAsSchemeOrNameOrDefinition;
        @XmlAttribute(name = "alias", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String alias;
        @XmlAttribute(name = "uri", required = true)
        protected String uri;
        @XmlAttribute(name = "authority")
        protected String authority;
        @XmlAttribute(name = "id")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "creator")
        protected String creator;
        @XmlAttribute(name = "creatoruri")
        protected String creatoruri;
        @XmlAttribute(name = "modified")
        protected String modified;
        @XmlAttribute(name = "custom")
        protected Boolean custom;
        @XmlAttribute(name = "how")
        protected String how;
        @XmlAttribute(name = "howuri")
        protected String howuri;
        @XmlAttribute(name = "why")
        protected String why;
        @XmlAttribute(name = "whyuri")
        protected String whyuri;
        @XmlAttribute(name = "pubconstraint")
        protected List<String> pubconstraint;
        @XmlAttribute(name = "pubconstrainturi")
        protected List<String> pubconstrainturi;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the sameAsSchemeOrNameOrDefinition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sameAsSchemeOrNameOrDefinition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSameAsSchemeOrNameOrDefinition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SameAsScheme }
         * {@link ConceptNameType }
         * {@link Definition }
         * {@link Note }
         * {@link Catalog.Scheme.SameAs }
         * 
         * 
         */
        public List<Object> getSameAsSchemeOrNameOrDefinition() {
            if (sameAsSchemeOrNameOrDefinition == null) {
                sameAsSchemeOrNameOrDefinition = new ArrayList<Object>();
            }
            return this.sameAsSchemeOrNameOrDefinition;
        }

        /**
         * Gets the value of the alias property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlias() {
            return alias;
        }

        /**
         * Sets the value of the alias property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlias(String value) {
            this.alias = value;
        }

        /**
         * Gets the value of the uri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUri() {
            return uri;
        }

        /**
         * Sets the value of the uri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUri(String value) {
            this.uri = value;
        }

        /**
         * Gets the value of the authority property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthority() {
            return authority;
        }

        /**
         * Sets the value of the authority property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthority(String value) {
            this.authority = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the creator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreator() {
            return creator;
        }

        /**
         * Sets the value of the creator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreator(String value) {
            this.creator = value;
        }

        /**
         * Gets the value of the creatoruri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreatoruri() {
            return creatoruri;
        }

        /**
         * Sets the value of the creatoruri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreatoruri(String value) {
            this.creatoruri = value;
        }

        /**
         * Gets the value of the modified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModified() {
            return modified;
        }

        /**
         * Sets the value of the modified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModified(String value) {
            this.modified = value;
        }

        /**
         * Gets the value of the custom property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCustom() {
            return custom;
        }

        /**
         * Sets the value of the custom property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCustom(Boolean value) {
            this.custom = value;
        }

        /**
         * Gets the value of the how property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHow() {
            return how;
        }

        /**
         * Sets the value of the how property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHow(String value) {
            this.how = value;
        }

        /**
         * Gets the value of the howuri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHowuri() {
            return howuri;
        }

        /**
         * Sets the value of the howuri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHowuri(String value) {
            this.howuri = value;
        }

        /**
         * Gets the value of the why property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWhy() {
            return why;
        }

        /**
         * Sets the value of the why property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWhy(String value) {
            this.why = value;
        }

        /**
         * Gets the value of the whyuri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWhyuri() {
            return whyuri;
        }

        /**
         * Sets the value of the whyuri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWhyuri(String value) {
            this.whyuri = value;
        }

        /**
         * Gets the value of the pubconstraint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pubconstraint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPubconstraint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPubconstraint() {
            if (pubconstraint == null) {
                pubconstraint = new ArrayList<String>();
            }
            return this.pubconstraint;
        }

        /**
         * Gets the value of the pubconstrainturi property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pubconstrainturi property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPubconstrainturi().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPubconstrainturi() {
            if (pubconstrainturi == null) {
                pubconstrainturi = new ArrayList<String>();
            }
            return this.pubconstrainturi;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>IRIType">
         *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
         *       &lt;attribute name="g2flag" type="{http://www.w3.org/2001/XMLSchema}string" fixed="DEPR-SCH" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class SameAs {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "g2flag")
            protected String g2Flag;
            @XmlAttribute(name = "id")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "creator")
            protected String creator;
            @XmlAttribute(name = "creatoruri")
            protected String creatoruri;
            @XmlAttribute(name = "modified")
            protected String modified;
            @XmlAttribute(name = "custom")
            protected Boolean custom;
            @XmlAttribute(name = "how")
            protected String how;
            @XmlAttribute(name = "howuri")
            protected String howuri;
            @XmlAttribute(name = "why")
            protected String why;
            @XmlAttribute(name = "whyuri")
            protected String whyuri;
            @XmlAttribute(name = "pubconstraint")
            protected List<String> pubconstraint;
            @XmlAttribute(name = "pubconstrainturi")
            protected List<String> pubconstrainturi;

            /**
             * The type of an Internationalized Resource Identifier Reference, as defined in RFC 3987. Identical to xs : anyURI.
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
             * Gets the value of the g2Flag property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getG2Flag() {
                if (g2Flag == null) {
                    return "DEPR-SCH";
                } else {
                    return g2Flag;
                }
            }

            /**
             * Sets the value of the g2Flag property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setG2Flag(String value) {
                this.g2Flag = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the creator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreator() {
                return creator;
            }

            /**
             * Sets the value of the creator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreator(String value) {
                this.creator = value;
            }

            /**
             * Gets the value of the creatoruri property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreatoruri() {
                return creatoruri;
            }

            /**
             * Sets the value of the creatoruri property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreatoruri(String value) {
                this.creatoruri = value;
            }

            /**
             * Gets the value of the modified property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModified() {
                return modified;
            }

            /**
             * Sets the value of the modified property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModified(String value) {
                this.modified = value;
            }

            /**
             * Gets the value of the custom property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCustom() {
                return custom;
            }

            /**
             * Sets the value of the custom property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCustom(Boolean value) {
                this.custom = value;
            }

            /**
             * Gets the value of the how property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHow() {
                return how;
            }

            /**
             * Sets the value of the how property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHow(String value) {
                this.how = value;
            }

            /**
             * Gets the value of the howuri property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHowuri() {
                return howuri;
            }

            /**
             * Sets the value of the howuri property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHowuri(String value) {
                this.howuri = value;
            }

            /**
             * Gets the value of the why property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWhy() {
                return why;
            }

            /**
             * Sets the value of the why property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWhy(String value) {
                this.why = value;
            }

            /**
             * Gets the value of the whyuri property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWhyuri() {
                return whyuri;
            }

            /**
             * Sets the value of the whyuri property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWhyuri(String value) {
                this.whyuri = value;
            }

            /**
             * Gets the value of the pubconstraint property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pubconstraint property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPubconstraint().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getPubconstraint() {
                if (pubconstraint == null) {
                    pubconstraint = new ArrayList<String>();
                }
                return this.pubconstraint;
            }

            /**
             * Gets the value of the pubconstrainturi property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pubconstrainturi property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPubconstrainturi().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getPubconstrainturi() {
                if (pubconstrainturi == null) {
                    pubconstrainturi = new ArrayList<String>();
                }
                return this.pubconstrainturi;
            }

        }

    }

}
