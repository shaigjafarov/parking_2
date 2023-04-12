
package com.ibam.lib.epul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInputPaymentHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInputPaymentHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InputPaymentHistory" type="{http://quetzalcoatlus/EpulPaymentService}InputPaymentHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInputPaymentHistory", propOrder = {
    "inputPaymentHistory"
})
public class ArrayOfInputPaymentHistory {

    @XmlElement(name = "InputPaymentHistory", nillable = true)
    protected List<InputPaymentHistory> inputPaymentHistory;

    /**
     * Gets the value of the inputPaymentHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputPaymentHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputPaymentHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InputPaymentHistory }
     * 
     * 
     */
    public List<InputPaymentHistory> getInputPaymentHistory() {
        if (inputPaymentHistory == null) {
            inputPaymentHistory = new ArrayList<InputPaymentHistory>();
        }
        return this.inputPaymentHistory;
    }

}
