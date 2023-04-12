
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
 *         &lt;element name="ListServicesByCategoryResult" type="{http://quetzalcoatlus/EpulPaymentService}ListServicesResult" minOccurs="0"/&gt;
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
    "listServicesByCategoryResult"
})
@XmlRootElement(name = "ListServicesByCategoryResponse")
public class ListServicesByCategoryResponse {

    @XmlElement(name = "ListServicesByCategoryResult")
    protected ListServicesResult listServicesByCategoryResult;

    /**
     * Gets the value of the listServicesByCategoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListServicesResult }
     *     
     */
    public ListServicesResult getListServicesByCategoryResult() {
        return listServicesByCategoryResult;
    }

    /**
     * Sets the value of the listServicesByCategoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListServicesResult }
     *     
     */
    public void setListServicesByCategoryResult(ListServicesResult value) {
        this.listServicesByCategoryResult = value;
    }

}
