
package gex.newsml.g2;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Flexible Author (creator or contributor) PCL-type for both controlled and
 * uncontrolled values
 * 
 * <p>
 * Java class for FlexAuthorPropType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="FlexAuthorPropType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}FlexPartyPropType">
 *       &lt;attribute name="role" type="{http://iptc.org/std/nar/2006-10-01/}QCodeListType" />
 *       &lt;attribute name="roleuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIListType" />
 *       &lt;attribute name="jobtitle" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *       &lt;attribute name="jobtitleuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexAuthorPropType")
@ToString
public class FlexAuthorPropType extends FlexPartyPropType {

	@XmlAttribute(name = "role")
	protected List<String> role;
	@XmlAttribute(name = "roleuri")
	protected List<String> roleuri;
	@XmlAttribute(name = "jobtitle")
	protected String jobtitle;
	@XmlAttribute(name = "jobtitleuri")
	protected String jobtitleuri;

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
	 * Gets the value of the jobtitle property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getJobtitle() {
		return jobtitle;
	}

	/**
	 * Sets the value of the jobtitle property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setJobtitle(String value) {
		this.jobtitle = value;
	}

	/**
	 * Gets the value of the jobtitleuri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getJobtitleuri() {
		return jobtitleuri;
	}

	/**
	 * Sets the value of the jobtitleuri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setJobtitleuri(String value) {
		this.jobtitleuri = value;
	}

}
