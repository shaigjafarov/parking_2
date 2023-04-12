
package com.ibam.lib.epul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EpulPaymentHistoryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EpulPaymentHistoryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://quetzalcoatlus/EpulPaymentService}StandardResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="List" type="{http://quetzalcoatlus/EpulPaymentService}ArrayOfInputPaymentHistory" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EpulPaymentHistoryResult", propOrder = {
    "quantity",
    "totalAmount",
    "list"
})
public class EpulPaymentHistoryResult
    extends StandardResult
{

    @XmlElement(name = "Quantity")
    protected long quantity;
    @XmlElement(name = "TotalAmount")
    protected long totalAmount;
    @XmlElement(name = "List")
    protected ArrayOfInputPaymentHistory list;

    /**
     * Gets the value of the quantity property.
     * 
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(long value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     */
    public long getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     */
    public void setTotalAmount(long value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInputPaymentHistory }
     *     
     */
    public ArrayOfInputPaymentHistory getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInputPaymentHistory }
     *     
     */
    public void setList(ArrayOfInputPaymentHistory value) {
        this.list = value;
    }

}
