
package com.ibam.lib.epul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InputPaymentHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputPaymentHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BatchId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="InsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SubServiceValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HistoryAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputPaymentHistory", propOrder = {
    "id",
    "transactionId",
    "batchId",
    "serviceId",
    "serviceName",
    "amount",
    "insertDate",
    "statusName",
    "status",
    "subServiceValue",
    "field",
    "historyAlias",
    "returnUrl",
    "errorUrl"
})
public class InputPaymentHistory {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "TransactionId")
    protected String transactionId;
    @XmlElement(name = "BatchId")
    protected long batchId;
    @XmlElement(name = "ServiceId")
    protected int serviceId;
    @XmlElement(name = "ServiceName")
    protected String serviceName;
    @XmlElement(name = "Amount")
    protected long amount;
    @XmlElement(name = "InsertDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar insertDate;
    @XmlElement(name = "StatusName")
    protected String statusName;
    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "SubServiceValue")
    protected String subServiceValue;
    @XmlElement(name = "Field")
    protected String field;
    @XmlElement(name = "HistoryAlias")
    protected String historyAlias;
    @XmlElement(name = "ReturnUrl")
    protected String returnUrl;
    @XmlElement(name = "ErrorUrl")
    protected String errorUrl;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

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
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the insertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInsertDate() {
        return insertDate;
    }

    /**
     * Sets the value of the insertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInsertDate(XMLGregorianCalendar value) {
        this.insertDate = value;
    }

    /**
     * Gets the value of the statusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * Sets the value of the statusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusName(String value) {
        this.statusName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the subServiceValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubServiceValue() {
        return subServiceValue;
    }

    /**
     * Sets the value of the subServiceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubServiceValue(String value) {
        this.subServiceValue = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the historyAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryAlias() {
        return historyAlias;
    }

    /**
     * Sets the value of the historyAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryAlias(String value) {
        this.historyAlias = value;
    }

    /**
     * Gets the value of the returnUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * Sets the value of the returnUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnUrl(String value) {
        this.returnUrl = value;
    }

    /**
     * Gets the value of the errorUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorUrl() {
        return errorUrl;
    }

    /**
     * Sets the value of the errorUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorUrl(String value) {
        this.errorUrl = value;
    }

}
