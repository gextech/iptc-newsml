
package gex.newsml.g2;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}AnyItemType">
 *       &lt;sequence>
 *         &lt;element name="contentMeta" type="{http://iptc.org/std/nar/2006-10-01/}ContentMetadataAcDType" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}assert" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}inlineRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}derivedFrom" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}newsCoverageSet" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "contentMeta", "_assert", "inlineRef", "derivedFrom", "newsCoverageSet" })
@XmlRootElement(name = "planningItem")
@ToString
public class PlanningItem extends AnyItemType {

	protected ContentMetadataAcDType contentMeta;
	@XmlElement(name = "assert")
	protected List<AssertType> _assert;
	protected List<InlineRef> inlineRef;
	protected List<DerivedFrom> derivedFrom;
	protected NewsCoverageSet newsCoverageSet;

	/**
	 * Gets the value of the contentMeta property.
	 * 
	 * @return possible object is {@link ContentMetadataAcDType }
	 * 
	 */
	public ContentMetadataAcDType getContentMeta() {
		return contentMeta;
	}

	/**
	 * Sets the value of the contentMeta property.
	 * 
	 * @param value
	 *            allowed object is {@link ContentMetadataAcDType }
	 * 
	 */
	public void setContentMeta(ContentMetadataAcDType value) {
		this.contentMeta = value;
	}

	/**
	 * Gets the value of the assert property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the assert property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAssert().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AssertType }
	 * 
	 * 
	 */
	public List<AssertType> getAssert() {
		if (_assert == null) {
			_assert = new ArrayList<AssertType>();
		}
		return this._assert;
	}

	/**
	 * Gets the value of the inlineRef property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the inlineRef property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getInlineRef().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link InlineRef
	 * }
	 * 
	 * 
	 */
	public List<InlineRef> getInlineRef() {
		if (inlineRef == null) {
			inlineRef = new ArrayList<InlineRef>();
		}
		return this.inlineRef;
	}

	/**
	 * Gets the value of the derivedFrom property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the derivedFrom property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDerivedFrom().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link DerivedFrom }
	 * 
	 * 
	 */
	public List<DerivedFrom> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new ArrayList<DerivedFrom>();
		}
		return this.derivedFrom;
	}

	/**
	 * Gets the value of the newsCoverageSet property.
	 * 
	 * @return possible object is {@link NewsCoverageSet }
	 * 
	 */
	public NewsCoverageSet getNewsCoverageSet() {
		return newsCoverageSet;
	}

	/**
	 * Sets the value of the newsCoverageSet property.
	 * 
	 * @param value
	 *            allowed object is {@link NewsCoverageSet }
	 * 
	 */
	public void setNewsCoverageSet(NewsCoverageSet value) {
		this.newsCoverageSet = value;
	}

}
