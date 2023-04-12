
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
 *         &lt;element name="ListServicesResult" type="{http://quetzalcoatlus/EpulPaymentService}ListServicesResult" minOccurs="0"/&gt;
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
    "listServicesResult"
})
@XmlRootElement(name = "ListServicesResponse")
public class ListServicesResponse {

    @XmlElement(name = "ListServicesResult")
    protected ListServicesResult listServicesResult;

    /**
     * Gets the value of the listServicesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListServicesResult }
     *     
     */
    public ListServicesResult getListServicesResult() {
        return listServicesResult;
    }

    /**
     * Sets the value of the listServicesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListServicesResult }
     *     
     */
    public void setListServicesResult(ListServicesResult value) {
        this.listServicesResult = value;
    }

}
