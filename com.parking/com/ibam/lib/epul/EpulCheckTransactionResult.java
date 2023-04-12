
package com.ibam.lib.epul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EpulCheckTransactionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EpulCheckTransactionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://quetzalcoatlus/EpulPaymentService}StandardResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BatchId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="PaymentId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EpulCheckTransactionResult", propOrder = {
    "batchId",
    "paymentId"
})
public class EpulCheckTransactionResult
    extends StandardResult
{

    @XmlElement(name = "BatchId")
    protected long batchId;
    @XmlElement(name = "PaymentId")
    protected long paymentId;

    /**
     * Gets the value of the batchId property.
     * 
     */
    public long getBatchId() {
        return batchId;
    }

    /**
     * Sets the value of the batchId property.
     * 
     */
    public void setBatchId(long value) {
        this.batchId = value;
    }

    /**
     * Gets the value of the paymentId property.
     * 
     */
    public long getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     */
    public void setPaymentId(long value) {
        this.paymentId = value;
    }

}
