
package com.ibam.lib.epul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiLangString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiLangString"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValueEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValueRu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValueAz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiLangString", propOrder = {
    "valueEn",
    "valueRu",
    "valueAz"
})
public class MultiLangString {

    @XmlElement(name = "ValueEn")
    protected String valueEn;
    @XmlElement(name = "ValueRu")
    protected String valueRu;
    @XmlElement(name = "ValueAz")
    protected String valueAz;

    /**
     * Gets the value of the valueEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueEn() {
        return valueEn;
    }

    /**
     * Sets the value of the valueEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueEn(String value) {
        this.valueEn = value;
    }

    /**
     * Gets the value of the valueRu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueRu() {
        return valueRu;
    }

    /**
     * Sets the value of the valueRu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueRu(String value) {
        this.valueRu = value;
    }

    /**
     * Gets the value of the valueAz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueAz() {
        return valueAz;
    }

    /**
     * Sets the value of the valueAz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueAz(String value) {
        this.valueAz = value;
    }

}
