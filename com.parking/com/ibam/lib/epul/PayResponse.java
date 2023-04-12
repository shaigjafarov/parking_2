
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
 *         &lt;element name="PayResult" type="{http://quetzalcoatlus/EpulPaymentService}PayResult" minOccurs="0"/&gt;
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
    "payResult"
})
@XmlRootElement(name = "PayResponse")
public class PayResponse {

    @XmlElement(name = "PayResult")
    protected PayResult payResult;

    /**
     * Gets the value of the payResult property.
     * 
     * @return
     *     possible object is
     *     {@link PayResult }
     *     
     */
    public PayResult getPayResult() {
        return payResult;
    }

    /**
     * Sets the value of the payResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayResult }
     *     
     */
    public void setPayResult(PayResult value) {
        this.payResult = value;
    }

}
