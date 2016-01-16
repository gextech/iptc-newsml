
package gex.newsml.g2;

import lombok.ToString;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}AnyItemType">
 *       &lt;sequence>
 *         &lt;element name="contentMeta" type="{http://iptc.org/std/nar/2006-10-01/}ContentMetadataCatType" minOccurs="0"/>
 *         &lt;element name="catalogContainer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}catalog"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "", propOrder = {
    "contentMeta",
    "catalogContainer"
})
@XmlRootElement(name = "catalogItem")
@ToString public class CatalogItem
    extends AnyItemType
{

    protected ContentMetadataCatType contentMeta;
    @XmlElement(required = true)
    protected CatalogItem.CatalogContainer catalogContainer;

    /**
     * Gets the value of the contentMeta property.
     * 
     * @return
     *     possible object is
     *     {@link ContentMetadataCatType }
     *     
     */
    public ContentMetadataCatType getContentMeta() {
        return contentMeta;
    }

    /**
     * Sets the value of the contentMeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentMetadataCatType }
     *     
     */
    public void setContentMeta(ContentMetadataCatType value) {
        this.contentMeta = value;
    }

    /**
     * Gets the value of the catalogContainer property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogItem.CatalogContainer }
     *     
     */
    public CatalogItem.CatalogContainer getCatalogContainer() {
        return catalogContainer;
    }

    /**
     * Sets the value of the catalogContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogItem.CatalogContainer }
     *     
     */
    public void setCatalogContainer(CatalogItem.CatalogContainer value) {
        this.catalogContainer = value;
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
     *       &lt;sequence>
     *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}catalog"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "catalog"
    })
    @ToString public static class CatalogContainer {

        @XmlElement(required = true)
        protected Catalog catalog;

        /**
         * Gets the value of the catalog property.
         * 
         * @return
         *     possible object is
         *     {@link Catalog }
         *     
         */
        public Catalog getCatalog() {
            return catalog;
        }

        /**
         * Sets the value of the catalog property.
         * 
         * @param value
         *     allowed object is
         *     {@link Catalog }
         *     
         */
        public void setCatalog(Catalog value) {
            this.catalog = value;
        }

    }

}
