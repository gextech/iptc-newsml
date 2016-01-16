
package gex.newsml.g2;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Flexible generic PCL-type for both controlled and uncontrolled values, with
 * optional attributes
 * 
 * <p>
 * Java class for Flex1ConceptPropType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Flex1ConceptPropType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}Flex1PropType">
 *       &lt;sequence>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}bag" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}quantifyAttributes"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flex1ConceptPropType", propOrder = { "bag" })
@XmlSeeAlso({ Subject.class, Genre.class })
@ToString
public class Flex1ConceptPropType extends Flex1PropType {

	protected Bag bag;
	@XmlAttribute(name = "confidence")
	protected Integer confidence;
	@XmlAttribute(name = "relevance")
	protected Integer relevance;
	@XmlAttribute(name = "derivedfrom")
	protected List<String> derivedfrom;

	/**
	 * Gets the value of the bag property.
	 * 
	 * @return possible object is {@link Bag }
	 * 
	 */
	public Bag getBag() {
		return bag;
	}

	/**
	 * Sets the value of the bag property.
	 * 
	 * @param value
	 *            allowed object is {@link Bag }
	 * 
	 */
	public void setBag(Bag value) {
		this.bag = value;
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
	 * Gets the value of the derivedfrom property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the derivedfrom property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDerivedfrom().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getDerivedfrom() {
		if (derivedfrom == null) {
			derivedfrom = new ArrayList<String>();
		}
		return this.derivedfrom;
	}

}
