
package com.ibam.lib.epul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPaymentInfoServiceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPaymentInfoServiceItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentInfoServiceItem" type="{http://quetzalcoatlus/EpulPaymentService}PaymentInfoServiceItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPaymentInfoServiceItem", propOrder = {
    "paymentInfoServiceItem"
})
public class ArrayOfPaymentInfoServiceItem {

    @XmlElement(name = "PaymentInfoServiceItem", nillable = true)
    protected List<PaymentInfoServiceItem> paymentInfoServiceItem;

    /**
     * Gets the value of the paymentInfoServiceItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInfoServiceItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInfoServiceItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInfoServiceItem }
     * 
     * 
     */
    public List<PaymentInfoServiceItem> getPaymentInfoServiceItem() {
        if (paymentInfoServiceItem == null) {
            paymentInfoServiceItem = new ArrayList<PaymentInfoServiceItem>();
        }
        return this.paymentInfoServiceItem;
    }

}
