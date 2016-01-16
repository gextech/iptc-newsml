
package gex.newsml.g2;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * The type of a natural language name for the concept (Type defined in this XML
 * Schema only)
 * 
 * <p>
 * Java class for ConceptNameType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ConceptNameType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>IntlStringType">
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}timeValidityAttributes"/>
 *       &lt;attribute name="role" type="{http://iptc.org/std/nar/2006-10-01/}QCodeListType" />
 *       &lt;attribute name="roleuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIListType" />
 *       &lt;attribute name="part" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *       &lt;attribute name="parturi" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptNameType")
@ToString
public class ConceptNameType extends IntlStringType {

	@XmlAttribute(name = "role")
	protected List<String> role;
	@XmlAttribute(name = "roleuri")
	protected List<String> roleuri;
	@XmlAttribute(name = "part")
	protected String part;
	@XmlAttribute(name = "parturi")
	protected String parturi;
	@XmlAttribute(name = "validfrom")
	protected String validfrom;
	@XmlAttribute(name = "validto")
	protected String validto;

	/**
	 * Gets the value of the role property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the role property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRole().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getRole() {
		if (role == null) {
			role = new ArrayList<String>();
		}
		return this.role;
	}

	/**
	 * Gets the value of the roleuri property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the roleuri property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRoleuri().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getRoleuri() {
		if (roleuri == null) {
			roleuri = new ArrayList<String>();
		}
		return this.roleuri;
	}

	/**
	 * Gets the value of the part property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPart() {
		return part;
	}

	/**
	 * Sets the value of the part property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPart(String value) {
		this.part = value;
	}

	/**
	 * Gets the value of the parturi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParturi() {
		return parturi;
	}

	/**
	 * Sets the value of the parturi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParturi(String value) {
		this.parturi = value;
	}

	/**
	 * Gets the value of the validfrom property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValidfrom() {
		return validfrom;
	}

	/**
	 * Sets the value of the validfrom property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValidfrom(String value) {
		this.validfrom = value;
	}

	/**
	 * Gets the value of the validto property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValidto() {
		return validto;
	}

	/**
	 * Sets the value of the validto property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValidto(String value) {
		this.validto = value;
	}

}
