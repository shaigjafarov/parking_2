
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
 *         &lt;element name="FeeResult" type="{http://quetzalcoatlus/EpulPaymentService}FeeResult" minOccurs="0"/&gt;
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
    "feeResult"
})
@XmlRootElement(name = "FeeResponse")
public class FeeResponse {

    @XmlElement(name = "FeeResult")
    protected FeeResult feeResult;

    /**
     * Gets the value of the feeResult property.
     * 
     * @return
     *     possible object is
     *     {@link FeeResult }
     *     
     */
    public FeeResult getFeeResult() {
        return feeResult;
    }

    /**
     * Sets the value of the feeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeResult }
     *     
     */
    public void setFeeResult(FeeResult value) {
        this.feeResult = value;
    }

}
