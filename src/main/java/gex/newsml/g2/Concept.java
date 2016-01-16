
package gex.newsml.g2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


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
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}conceptId"/>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}type" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}name" maxOccurs="unbounded"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}definition"/>
 *           &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}note"/>
 *           &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}facet"/>
 *           &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}remoteInfo"/>
 *           &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}hierarchyInfo"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://iptc.org/std/nar/2006-10-01/}ConceptRelationshipsGroup"/>
 *         &lt;group ref="{http://iptc.org/std/nar/2006-10-01/}EntityDetailsGroup" minOccurs="0"/>
 *         &lt;element name="conceptExtProperty" type="{http://iptc.org/std/nar/2006-10-01/}Flex2ExtPropType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}i18nAttributes"/>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
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
    "conceptId",
    "type",
    "name",
    "definitionOrNoteOrFacet",
    "sameAsOrBroaderOrNarrower",
    "personDetails",
    "organisationDetails",
    "geoAreaDetails",
    "poiDetails",
    "objectDetails",
    "eventDetails",
    "conceptExtProperty",
    "any"
})
@XmlRootElement(name = "concept")
public class Concept {

    @XmlElement(required = true)
    protected ConceptIdType conceptId;
    protected QualPropType type;
    @XmlElement(required = true)
    protected List<ConceptNameType> name;
    @XmlElements({
        @XmlElement(name = "definition", type = Definition.class),
        @XmlElement(name = "note", type = Note.class),
        @XmlElement(name = "facet", type = Facet.class),
        @XmlElement(name = "remoteInfo", type = Link1Type.class),
        @XmlElement(name = "hierarchyInfo", type = HierarchyInfo.class)
    })
    protected List<Object> definitionOrNoteOrFacet;
    @XmlElementRefs({
        @XmlElementRef(name = "narrower", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "related", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sameAs", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "broader", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends FlexPropType>> sameAsOrBroaderOrNarrower;
    protected PersonDetails personDetails;
    protected OrganisationDetails organisationDetails;
    protected GeoAreaDetails geoAreaDetails;
    @XmlElement(name = "POIDetails")
    protected POIDetails poiDetails;
    protected ObjectDetails objectDetails;
    protected EventDetails eventDetails;
    protected List<Flex2ExtPropType> conceptExtProperty;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;
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
     * Gets the value of the conceptId property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptIdType }
     *     
     */
    public ConceptIdType getConceptId() {
        return conceptId;
    }

    /**
     * Sets the value of the conceptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptIdType }
     *     
     */
    public void setConceptId(ConceptIdType value) {
        this.conceptId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link QualPropType }
     *     
     */
    public QualPropType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualPropType }
     *     
     */
    public void setType(QualPropType value) {
        this.type = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptNameType }
     * 
     * 
     */
    public List<ConceptNameType> getName() {
        if (name == null) {
            name = new ArrayList<ConceptNameType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the definitionOrNoteOrFacet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the definitionOrNoteOrFacet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinitionOrNoteOrFacet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Definition }
     * {@link Note }
     * {@link Facet }
     * {@link Link1Type }
     * {@link HierarchyInfo }
     * 
     * 
     */
    public List<Object> getDefinitionOrNoteOrFacet() {
        if (definitionOrNoteOrFacet == null) {
            definitionOrNoteOrFacet = new ArrayList<Object>();
        }
        return this.definitionOrNoteOrFacet;
    }

    /**
     * Gets the value of the sameAsOrBroaderOrNarrower property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sameAsOrBroaderOrNarrower property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSameAsOrBroaderOrNarrower().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RelatedConceptType }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexRelatedConceptType }{@code >}
     * {@link JAXBElement }{@code <}{@link SameAsType }{@code >}
     * {@link JAXBElement }{@code <}{@link RelatedConceptType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends FlexPropType>> getSameAsOrBroaderOrNarrower() {
        if (sameAsOrBroaderOrNarrower == null) {
            sameAsOrBroaderOrNarrower = new ArrayList<JAXBElement<? extends FlexPropType>>();
        }
        return this.sameAsOrBroaderOrNarrower;
    }

    /**
     * Gets the value of the personDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PersonDetails }
     *     
     */
    public PersonDetails getPersonDetails() {
        return personDetails;
    }

    /**
     * Sets the value of the personDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonDetails }
     *     
     */
    public void setPersonDetails(PersonDetails value) {
        this.personDetails = value;
    }

    /**
     * Gets the value of the organisationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationDetails }
     *     
     */
    public OrganisationDetails getOrganisationDetails() {
        return organisationDetails;
    }

    /**
     * Sets the value of the organisationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationDetails }
     *     
     */
    public void setOrganisationDetails(OrganisationDetails value) {
        this.organisationDetails = value;
    }

    /**
     * Gets the value of the geoAreaDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GeoAreaDetails }
     *     
     */
    public GeoAreaDetails getGeoAreaDetails() {
        return geoAreaDetails;
    }

    /**
     * Sets the value of the geoAreaDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoAreaDetails }
     *     
     */
    public void setGeoAreaDetails(GeoAreaDetails value) {
        this.geoAreaDetails = value;
    }

    /**
     * Gets the value of the poiDetails property.
     * 
     * @return
     *     possible object is
     *     {@link POIDetails }
     *     
     */
    public POIDetails getPOIDetails() {
        return poiDetails;
    }

    /**
     * Sets the value of the poiDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link POIDetails }
     *     
     */
    public void setPOIDetails(POIDetails value) {
        this.poiDetails = value;
    }

    /**
     * Gets the value of the objectDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectDetails }
     *     
     */
    public ObjectDetails getObjectDetails() {
        return objectDetails;
    }

    /**
     * Sets the value of the objectDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectDetails }
     *     
     */
    public void setObjectDetails(ObjectDetails value) {
        this.objectDetails = value;
    }

    /**
     * Gets the value of the eventDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EventDetails }
     *     
     */
    public EventDetails getEventDetails() {
        return eventDetails;
    }

    /**
     * Sets the value of the eventDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDetails }
     *     
     */
    public void setEventDetails(EventDetails value) {
        this.eventDetails = value;
    }

    /**
     * Gets the value of the conceptExtProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conceptExtProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptExtProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Flex2ExtPropType }
     * 
     * 
     */
    public List<Flex2ExtPropType> getConceptExtProperty() {
        if (conceptExtProperty == null) {
            conceptExtProperty = new ArrayList<Flex2ExtPropType>();
        }
        return this.conceptExtProperty;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Specifies the language of this property and potentially all descendant properties. xml:lang values of descendant properties override this value. Values are determined by Internet BCP 47.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDir() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDir(String value) {
        this.dir = value;
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

}
