
package gex.newsml.g2;

import lombok.ToString;

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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="group" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="groupRef">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *                           &lt;attribute name="idref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                           &lt;anyAttribute processContents='lax' namespace='##other'/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="itemRef" type="{http://iptc.org/std/nar/2006-10-01/}Link1Type"/>
 *                   &lt;element name="conceptRef">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}FlexPropType">
 *                           &lt;anyAttribute processContents='lax' namespace='##other'/>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}title"/>
 *                   &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}signal"/>
 *                   &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}edNote"/>
 *                   &lt;element name="groupExtProperty" type="{http://iptc.org/std/nar/2006-10-01/}Flex2ExtPropType"/>
 *                   &lt;any processContents='lax' namespace='##other'/>
 *                 &lt;/choice>
 *                 &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}i18nAttributes"/>
 *                 &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *                 &lt;attribute name="role" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *                 &lt;attribute name="roleuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *                 &lt;attribute name="mode" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *                 &lt;attribute name="modeuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *                 &lt;anyAttribute processContents='lax' namespace='##other'/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *       &lt;attribute name="root" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "group" })
@XmlRootElement(name = "groupSet")
@ToString
public class GroupSet {

	@XmlElement(required = true)
	protected List<GroupSet.Group> group;
	@XmlAttribute(name = "root", required = true)
	@XmlIDREF
	@XmlSchemaType(name = "IDREF")
	protected Object root;
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
	 * Gets the value of the group property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the group property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getGroup().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link GroupSet.Group }
	 * 
	 * 
	 */
	public List<GroupSet.Group> getGroup() {
		if (group == null) {
			group = new ArrayList<GroupSet.Group>();
		}
		return this.group;
	}

	/**
	 * Gets the value of the root property.
	 * 
	 * @return possible object is {@link Object }
	 * 
	 */
	public Object getRoot() {
		return root;
	}

	/**
	 * Sets the value of the root property.
	 * 
	 * @param value
	 *            allowed object is {@link Object }
	 * 
	 */
	public void setRoot(Object value) {
		this.root = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the creator property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * Sets the value of the creator property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreator(String value) {
		this.creator = value;
	}

	/**
	 * Gets the value of the creatoruri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreatoruri() {
		return creatoruri;
	}

	/**
	 * Sets the value of the creatoruri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreatoruri(String value) {
		this.creatoruri = value;
	}

	/**
	 * Gets the value of the modified property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModified() {
		return modified;
	}

	/**
	 * Sets the value of the modified property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setModified(String value) {
		this.modified = value;
	}

	/**
	 * Gets the value of the custom property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isCustom() {
		return custom;
	}

	/**
	 * Sets the value of the custom property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setCustom(Boolean value) {
		this.custom = value;
	}

	/**
	 * Gets the value of the how property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHow() {
		return how;
	}

	/**
	 * Sets the value of the how property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHow(String value) {
		this.how = value;
	}

	/**
	 * Gets the value of the howuri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHowuri() {
		return howuri;
	}

	/**
	 * Sets the value of the howuri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHowuri(String value) {
		this.howuri = value;
	}

	/**
	 * Gets the value of the why property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWhy() {
		return why;
	}

	/**
	 * Sets the value of the why property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWhy(String value) {
		this.why = value;
	}

	/**
	 * Gets the value of the whyuri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWhyuri() {
		return whyuri;
	}

	/**
	 * Sets the value of the whyuri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWhyuri(String value) {
		this.whyuri = value;
	}

	/**
	 * Gets the value of the pubconstraint property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the pubconstraint property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPubconstraint().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
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
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the pubconstrainturi property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPubconstrainturi().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
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
	 * Gets a map that contains attributes that aren't bound to any typed
	 * property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string
	 * value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by
	 * updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *         &lt;element name="groupRef">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
	 *                 &lt;attribute name="idref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
	 *                 &lt;anyAttribute processContents='lax' namespace='##other'/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="itemRef" type="{http://iptc.org/std/nar/2006-10-01/}Link1Type"/>
	 *         &lt;element name="conceptRef">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}FlexPropType">
	 *                 &lt;anyAttribute processContents='lax' namespace='##other'/>
	 *               &lt;/extension>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}title"/>
	 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}signal"/>
	 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}edNote"/>
	 *         &lt;element name="groupExtProperty" type="{http://iptc.org/std/nar/2006-10-01/}Flex2ExtPropType"/>
	 *         &lt;any processContents='lax' namespace='##other'/>
	 *       &lt;/choice>
	 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}i18nAttributes"/>
	 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
	 *       &lt;attribute name="role" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
	 *       &lt;attribute name="roleuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
	 *       &lt;attribute name="mode" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
	 *       &lt;attribute name="modeuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
	 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "groupRefOrItemRefOrConceptRef" })
	@ToString
	public static class Group {

		@XmlElementRefs({
				@XmlElementRef(name = "groupExtProperty", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
				@XmlElementRef(name = "groupRef", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
				@XmlElementRef(name = "itemRef", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
				@XmlElementRef(name = "signal", namespace = "http://iptc.org/std/nar/2006-10-01/", type = Signal.class, required = false),
				@XmlElementRef(name = "conceptRef", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
				@XmlElementRef(name = "edNote", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
				@XmlElementRef(name = "title", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false) })
		@XmlAnyElement(lax = true)
		protected List<Object> groupRefOrItemRefOrConceptRef;
		@XmlAttribute(name = "role")
		protected String role;
		@XmlAttribute(name = "roleuri")
		protected String roleuri;
		@XmlAttribute(name = "mode")
		protected String mode;
		@XmlAttribute(name = "modeuri")
		protected String modeuri;
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
		 * Gets the value of the groupRefOrItemRefOrConceptRef property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the groupRefOrItemRefOrConceptRef
		 * property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getGroupRefOrItemRefOrConceptRef().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link JAXBElement }{@code <}{@link Flex2ExtPropType }{@code >}
		 * {@link JAXBElement }{@code <}{@link GroupSet.Group.GroupRef }
		 * {@code >} {@link JAXBElement }{@code <}{@link Link1Type }{@code >}
		 * {@link Signal } {@link JAXBElement }{@code <}
		 * {@link GroupSet.Group.ConceptRef }{@code >} {@link JAXBElement }
		 * {@code <}{@link BlockType }{@code >} {@link Object }
		 * {@link JAXBElement }{@code <}{@link Label1Type }{@code >}
		 * {@link Element }
		 * 
		 * 
		 */
		public List<Object> getGroupRefOrItemRefOrConceptRef() {
			if (groupRefOrItemRefOrConceptRef == null) {
				groupRefOrItemRefOrConceptRef = new ArrayList<Object>();
			}
			return this.groupRefOrItemRefOrConceptRef;
		}

		/**
		 * Gets the value of the role property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRole() {
			return role;
		}

		/**
		 * Sets the value of the role property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRole(String value) {
			this.role = value;
		}

		/**
		 * Gets the value of the roleuri property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRoleuri() {
			return roleuri;
		}

		/**
		 * Sets the value of the roleuri property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRoleuri(String value) {
			this.roleuri = value;
		}

		/**
		 * Gets the value of the mode property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getMode() {
			return mode;
		}

		/**
		 * Sets the value of the mode property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setMode(String value) {
			this.mode = value;
		}

		/**
		 * Gets the value of the modeuri property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getModeuri() {
			return modeuri;
		}

		/**
		 * Sets the value of the modeuri property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setModeuri(String value) {
			this.modeuri = value;
		}

		/**
		 * Specifies the language of this property and potentially all
		 * descendant properties. xml:lang values of descendant properties
		 * override this value. Values are determined by Internet BCP 47.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLang() {
			return lang;
		}

		/**
		 * Sets the value of the lang property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLang(String value) {
			this.lang = value;
		}

		/**
		 * Gets the value of the dir property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDir() {
			return dir;
		}

		/**
		 * Sets the value of the dir property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDir(String value) {
			this.dir = value;
		}

		/**
		 * Gets the value of the id property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * Sets the value of the id property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * Gets the value of the creator property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCreator() {
			return creator;
		}

		/**
		 * Sets the value of the creator property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCreator(String value) {
			this.creator = value;
		}

		/**
		 * Gets the value of the creatoruri property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCreatoruri() {
			return creatoruri;
		}

		/**
		 * Sets the value of the creatoruri property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCreatoruri(String value) {
			this.creatoruri = value;
		}

		/**
		 * Gets the value of the modified property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getModified() {
			return modified;
		}

		/**
		 * Sets the value of the modified property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setModified(String value) {
			this.modified = value;
		}

		/**
		 * Gets the value of the custom property.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isCustom() {
			return custom;
		}

		/**
		 * Sets the value of the custom property.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setCustom(Boolean value) {
			this.custom = value;
		}

		/**
		 * Gets the value of the how property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getHow() {
			return how;
		}

		/**
		 * Sets the value of the how property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setHow(String value) {
			this.how = value;
		}

		/**
		 * Gets the value of the howuri property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getHowuri() {
			return howuri;
		}

		/**
		 * Sets the value of the howuri property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setHowuri(String value) {
			this.howuri = value;
		}

		/**
		 * Gets the value of the why property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getWhy() {
			return why;
		}

		/**
		 * Sets the value of the why property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setWhy(String value) {
			this.why = value;
		}

		/**
		 * Gets the value of the whyuri property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getWhyuri() {
			return whyuri;
		}

		/**
		 * Sets the value of the whyuri property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setWhyuri(String value) {
			this.whyuri = value;
		}

		/**
		 * Gets the value of the pubconstraint property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the pubconstraint property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getPubconstraint().add(newItem);
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
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the pubconstrainturi property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getPubconstrainturi().add(newItem);
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
		 * Gets a map that contains attributes that aren't bound to any typed
		 * property on this class.
		 * 
		 * <p>
		 * the map is keyed by the name of the attribute and the value is the
		 * string value of the attribute.
		 * 
		 * the map returned by this method is live, and you can add new
		 * attribute by updating the map directly. Because of this design,
		 * there's no setter.
		 * 
		 * 
		 * @return always non-null
		 */
		public Map<QName, String> getOtherAttributes() {
			return otherAttributes;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}FlexPropType">
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
		@ToString
		public static class ConceptRef extends FlexPropType {

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
		 *       &lt;attribute name="idref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
		 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		@ToString
		public static class GroupRef {

			@XmlAttribute(name = "idref", required = true)
			@XmlIDREF
			@XmlSchemaType(name = "IDREF")
			protected Object idref;
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
			 * Gets the value of the idref property.
			 * 
			 * @return possible object is {@link Object }
			 * 
			 */
			public Object getIdref() {
				return idref;
			}

			/**
			 * Sets the value of the idref property.
			 * 
			 * @param value
			 *            allowed object is {@link Object }
			 * 
			 */
			public void setIdref(Object value) {
				this.idref = value;
			}

			/**
			 * Gets the value of the id property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getId() {
				return id;
			}

			/**
			 * Sets the value of the id property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setId(String value) {
				this.id = value;
			}

			/**
			 * Gets the value of the creator property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCreator() {
				return creator;
			}

			/**
			 * Sets the value of the creator property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCreator(String value) {
				this.creator = value;
			}

			/**
			 * Gets the value of the creatoruri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCreatoruri() {
				return creatoruri;
			}

			/**
			 * Sets the value of the creatoruri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCreatoruri(String value) {
				this.creatoruri = value;
			}

			/**
			 * Gets the value of the modified property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModified() {
				return modified;
			}

			/**
			 * Sets the value of the modified property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModified(String value) {
				this.modified = value;
			}

			/**
			 * Gets the value of the custom property.
			 * 
			 * @return possible object is {@link Boolean }
			 * 
			 */
			public Boolean isCustom() {
				return custom;
			}

			/**
			 * Sets the value of the custom property.
			 * 
			 * @param value
			 *            allowed object is {@link Boolean }
			 * 
			 */
			public void setCustom(Boolean value) {
				this.custom = value;
			}

			/**
			 * Gets the value of the how property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHow() {
				return how;
			}

			/**
			 * Sets the value of the how property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHow(String value) {
				this.how = value;
			}

			/**
			 * Gets the value of the howuri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHowuri() {
				return howuri;
			}

			/**
			 * Sets the value of the howuri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHowuri(String value) {
				this.howuri = value;
			}

			/**
			 * Gets the value of the why property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getWhy() {
				return why;
			}

			/**
			 * Sets the value of the why property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setWhy(String value) {
				this.why = value;
			}

			/**
			 * Gets the value of the whyuri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getWhyuri() {
				return whyuri;
			}

			/**
			 * Sets the value of the whyuri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setWhyuri(String value) {
				this.whyuri = value;
			}

			/**
			 * Gets the value of the pubconstraint property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the pubconstraint property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getPubconstraint().add(newItem);
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
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the pubconstrainturi property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getPubconstrainturi().add(newItem);
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
			 * Gets a map that contains attributes that aren't bound to any
			 * typed property on this class.
			 * 
			 * <p>
			 * the map is keyed by the name of the attribute and the value is
			 * the string value of the attribute.
			 * 
			 * the map returned by this method is live, and you can add new
			 * attribute by updating the map directly. Because of this design,
			 * there's no setter.
			 * 
			 * 
			 * @return always non-null
			 */
			public Map<QName, String> getOtherAttributes() {
				return otherAttributes;
			}

		}

	}

}
