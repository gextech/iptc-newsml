
package gex.newsml.g2;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>IRIType">
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *       &lt;attribute name="accesstype" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *       &lt;attribute name="accesstypeuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *       &lt;attribute name="reposrole" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *       &lt;attribute name="reposroleuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "value" })
@XmlRootElement(name = "origRep")
@ToString
public class OrigRep {

	@XmlValue
	protected String value;
	@XmlAttribute(name = "accesstype")
	protected String accesstype;
	@XmlAttribute(name = "accesstypeuri")
	protected String accesstypeuri;
	@XmlAttribute(name = "reposrole")
	protected String reposrole;
	@XmlAttribute(name = "reposroleuri")
	protected String reposroleuri;
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
	 * The type of an Internationalized Resource Identifier Reference, as
	 * defined in RFC 3987. Identical to xs : anyURI.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the value of the accesstype property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccesstype() {
		return accesstype;
	}

	/**
	 * Sets the value of the accesstype property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccesstype(String value) {
		this.accesstype = value;
	}

	/**
	 * Gets the value of the accesstypeuri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccesstypeuri() {
		return accesstypeuri;
	}

	/**
	 * Sets the value of the accesstypeuri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccesstypeuri(String value) {
		this.accesstypeuri = value;
	}

	/**
	 * Gets the value of the reposrole property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReposrole() {
		return reposrole;
	}

	/**
	 * Sets the value of the reposrole property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReposrole(String value) {
		this.reposrole = value;
	}

	/**
	 * Gets the value of the reposroleuri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReposroleuri() {
		return reposroleuri;
	}

	/**
	 * Sets the value of the reposroleuri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReposroleuri(String value) {
		this.reposroleuri = value;
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

}
