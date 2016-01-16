
package gex.newsml.g2;

import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
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
 *   &lt;complexContent>
 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}FlexPropType">
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}timeValidityAttributes"/>
 *       &lt;attribute name="rel" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *       &lt;attribute name="reluri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *       &lt;attribute name="g2flag" type="{http://www.w3.org/2001/XMLSchema}string" fixed="DEPR" />
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
@XmlRootElement(name = "facet")
@ToString
public class Facet extends FlexPropType {

	@XmlAttribute(name = "rel")
	protected String rel;
	@XmlAttribute(name = "reluri")
	protected String reluri;
	@XmlAttribute(name = "g2flag")
	protected String g2Flag;
	@XmlAttribute(name = "validfrom")
	protected String validfrom;
	@XmlAttribute(name = "validto")
	protected String validto;

	/**
	 * Gets the value of the rel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRel() {
		return rel;
	}

	/**
	 * Sets the value of the rel property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRel(String value) {
		this.rel = value;
	}

	/**
	 * Gets the value of the reluri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReluri() {
		return reluri;
	}

	/**
	 * Sets the value of the reluri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReluri(String value) {
		this.reluri = value;
	}

	/**
	 * Gets the value of the g2Flag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getG2Flag() {
		if (g2Flag == null) {
			return "DEPR";
		} else {
			return g2Flag;
		}
	}

	/**
	 * Sets the value of the g2Flag property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setG2Flag(String value) {
		this.g2Flag = value;
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
