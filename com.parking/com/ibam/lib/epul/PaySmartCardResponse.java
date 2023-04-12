
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
 *         &lt;element name="PaySmartCardResult" type="{http://quetzalcoatlus/EpulPaymentService}EpulSmartCardPayResult" minOccurs="0"/&gt;
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
    "paySmartCardResult"
})
@XmlRootElement(name = "PaySmartCardResponse")
public class PaySmartCardResponse {

    @XmlElement(name = "PaySmartCardResult")
    protected EpulSmartCardPayResult paySmartCardResult;

    /**
     * Gets the value of the paySmartCardResult property.
     * 
     * @return
     *     possible object is
     *     {@link EpulSmartCardPayResult }
     *     
     */
    public EpulSmartCardPayResult getPaySmartCardResult() {
        return paySmartCardResult;
    }

    /**
     * Sets the value of the paySmartCardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EpulSmartCardPayResult }
     *     
     */
    public void setPaySmartCardResult(EpulSmartCardPayResult value) {
        this.paySmartCardResult = value;
    }

}
