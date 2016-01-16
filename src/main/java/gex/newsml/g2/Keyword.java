
package gex.newsml.g2;

import lombok.ToString;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

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
 *     &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>IntlStringType">
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}rankingAttributes"/>
 *       &lt;attribute name="role" type="{http://iptc.org/std/nar/2006-10-01/}QCodeListType" />
 *       &lt;attribute name="roleuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIListType" />
 *       &lt;attribute name="confidence" type="{http://iptc.org/std/nar/2006-10-01/}Int100Type" />
 *       &lt;attribute name="relevance" type="{http://iptc.org/std/nar/2006-10-01/}Int100Type" />
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
@XmlRootElement(name = "keyword")
@ToString
public class Keyword extends IntlStringType {

	@XmlAttribute(name = "role")
	protected List<String> role;
	@XmlAttribute(name = "roleuri")
	protected List<String> roleuri;
	@XmlAttribute(name = "confidence")
	protected Integer confidence;
	@XmlAttribute(name = "relevance")
	protected Integer relevance;
	@XmlAttribute(name = "rank")
	@XmlSchemaType(name = "nonNegativeInteger")
	protected BigInteger rank;

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
	 * Gets the value of the confidence property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getConfidence() {
		return confidence;
	}

	/**
	 * Sets the value of the confidence property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setConfidence(Integer value) {
		this.confidence = value;
	}

	/**
	 * Gets the value of the relevance property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getRelevance() {
		return relevance;
	}

	/**
	 * Sets the value of the relevance property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setRelevance(Integer value) {
		this.relevance = value;
	}

	/**
	 * Gets the value of the rank property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getRank() {
		return rank;
	}

	/**
	 * Sets the value of the rank property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setRank(BigInteger value) {
		this.rank = value;
	}

}
