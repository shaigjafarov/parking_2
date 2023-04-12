
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
 *         &lt;element name="CheckTransactionResult" type="{http://quetzalcoatlus/EpulPaymentService}EpulCheckTransactionResult" minOccurs="0"/&gt;
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
    "checkTransactionResult"
})
@XmlRootElement(name = "CheckTransactionResponse")
public class CheckTransactionResponse {

    @XmlElement(name = "CheckTransactionResult")
    protected EpulCheckTransactionResult checkTransactionResult;

    /**
     * Gets the value of the checkTransactionResult property.
     * 
     * @return
     *     possible object is
     *     {@link EpulCheckTransactionResult }
     *     
     */
    public EpulCheckTransactionResult getCheckTransactionResult() {
        return checkTransactionResult;
    }

    /**
     * Sets the value of the checkTransactionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EpulCheckTransactionResult }
     *     
     */
    public void setCheckTransactionResult(EpulCheckTransactionResult value) {
        this.checkTransactionResult = value;
    }

}
