
package com.ibam.lib.epul;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListCategoriesResult" type="{http://quetzalcoatlus/EpulPaymentService}ListPlainCategoriesResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listCategoriesResult"
})
@XmlRootElement(name = "ListCategoriesResponse")
public class ListCategoriesResponse {

    @XmlElement(name = "ListCategoriesResult")
    protected ListPlainCategoriesResult listCategoriesResult;

    /**
     * Gets the value of the listCategoriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListPlainCategoriesResult }
     *     
     */
    public ListPlainCategoriesResult getListCategoriesResult() {
        return listCategoriesResult;
    }

    /**
     * Sets the value of the listCategoriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPlainCategoriesResult }
     *     
     */
    public void setListCategoriesResult(ListPlainCategoriesResult value) {
        this.listCategoriesResult = value;
    }

}
