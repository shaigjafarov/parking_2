
package com.ibam.lib.epul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EpulPaymentInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EpulPaymentInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://quetzalcoatlus/EpulPaymentService}EpulPaymentStandardRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fields" type="{http://quetzalcoatlus/EpulPaymentService}ArrayOfPaymentInfoServiceItem" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInfoServiceItem" type="{http://quetzalcoatlus/EpulPaymentService}PaymentInfoServiceItem" minOccurs="0"/&gt;
 *         &lt;element name="SelectedGroupId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EpulPaymentInfoRequest", propOrder = {
    "serviceId",
    "name",
    "fields",
    "paymentInfoServiceItem",
    "selectedGroupId"
})
@XmlSeeAlso({
    EpulPayRequest.class
})
public class EpulPaymentInfoRequest
    extends EpulPaymentStandardRequest
{

    @XmlElement(name = "ServiceId")
    protected int serviceId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Fields")
    protected ArrayOfPaymentInfoServiceItem fields;
    @XmlElement(name = "PaymentInfoServiceItem")
    protected PaymentInfoServiceItem paymentInfoServiceItem;
    @XmlElement(name = "SelectedGroupId")
    protected int selectedGroupId;

    /**
     * Gets the value of the serviceId property.
     * 
     */
    public int getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     */
    public void setServiceId(int value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentInfoServiceItem }
     *     
     */
    public ArrayOfPaymentInfoServiceItem getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentInfoServiceItem }
     *     
     */
    public void setFields(ArrayOfPaymentInfoServiceItem value) {
        this.fields = value;
    }

    /**
     * Gets the value of the paymentInfoServiceItem property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfoServiceItem }
     *     
     */
    public PaymentInfoServiceItem getPaymentInfoServiceItem() {
        return paymentInfoServiceItem;
    }

    /**
     * Sets the value of the paymentInfoServiceItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfoServiceItem }
     *     
     */
    public void setPaymentInfoServiceItem(PaymentInfoServiceItem value) {
        this.paymentInfoServiceItem = value;
    }

    /**
     * Gets the value of the selectedGroupId property.
     * 
     */
    public int getSelectedGroupId() {
        return selectedGroupId;
    }

    /**
     * Sets the value of the selectedGroupId property.
     * 
     */
    public void setSelectedGroupId(int value) {
        this.selectedGroupId = value;
    }

}
