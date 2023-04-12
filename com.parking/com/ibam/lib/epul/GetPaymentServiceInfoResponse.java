
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
 *         &lt;element name="GetPaymentServiceInfoResult" type="{http://quetzalcoatlus/EpulPaymentService}ServiceInfoResult" minOccurs="0"/&gt;
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
    "getPaymentServiceInfoResult"
})
@XmlRootElement(name = "GetPaymentServiceInfoResponse")
public class GetPaymentServiceInfoResponse {

    @XmlElement(name = "GetPaymentServiceInfoResult")
    protected ServiceInfoResult getPaymentServiceInfoResult;

    /**
     * Gets the value of the getPaymentServiceInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfoResult }
     *     
     */
    public ServiceInfoResult getGetPaymentServiceInfoResult() {
        return getPaymentServiceInfoResult;
    }

    /**
     * Sets the value of the getPaymentServiceInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfoResult }
     *     
     */
    public void setGetPaymentServiceInfoResult(ServiceInfoResult value) {
        this.getPaymentServiceInfoResult = value;
    }

}
