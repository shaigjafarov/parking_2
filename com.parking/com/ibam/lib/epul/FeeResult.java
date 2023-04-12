
package com.ibam.lib.epul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://quetzalcoatlus/EpulPaymentService}StandardResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeeAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeResult", propOrder = {
    "feeAmount"
})
public class FeeResult
    extends StandardResult
{

    @XmlElement(name = "FeeAmount")
    protected long feeAmount;

    /**
     * Gets the value of the feeAmount property.
     * 
     */
    public long getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     */
    public void setFeeAmount(long value) {
        this.feeAmount = value;
    }

}
