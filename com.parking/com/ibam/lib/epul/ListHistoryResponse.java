
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
 *         &lt;element name="ListHistoryResult" type="{http://quetzalcoatlus/EpulPaymentService}EpulPaymentHistoryResult" minOccurs="0"/&gt;
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
    "listHistoryResult"
})
@XmlRootElement(name = "ListHistoryResponse")
public class ListHistoryResponse {

    @XmlElement(name = "ListHistoryResult")
    protected EpulPaymentHistoryResult listHistoryResult;

    /**
     * Gets the value of the listHistoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link EpulPaymentHistoryResult }
     *     
     */
    public EpulPaymentHistoryResult getListHistoryResult() {
        return listHistoryResult;
    }

    /**
     * Sets the value of the listHistoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EpulPaymentHistoryResult }
     *     
     */
    public void setListHistoryResult(EpulPaymentHistoryResult value) {
        this.listHistoryResult = value;
    }

}
