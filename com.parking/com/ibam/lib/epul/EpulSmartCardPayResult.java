
package com.ibam.lib.epul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EpulSmartCardPayResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EpulSmartCardPayResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://quetzalcoatlus/EpulPaymentService}PayResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CardStatus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Customer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Debt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TypeData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Serial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OutFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtraFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrigRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrigTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EpulSmartCardPayResult", propOrder = {
    "balance",
    "cardStatus",
    "credit",
    "customer",
    "debt",
    "typeData",
    "serial",
    "inFile",
    "outFile",
    "extraFile",
    "meterNumber",
    "origRef",
    "origTime"
})
public class EpulSmartCardPayResult
    extends PayResult
{

    @XmlElement(name = "Balance")
    protected int balance;
    @XmlElement(name = "CardStatus")
    protected int cardStatus;
    @XmlElement(name = "Credit")
    protected int credit;
    @XmlElement(name = "Customer")
    protected String customer;
    @XmlElement(name = "Debt")
    protected int debt;
    @XmlElement(name = "TypeData")
    protected String typeData;
    @XmlElement(name = "Serial")
    protected String serial;
    @XmlElement(name = "InFile")
    protected String inFile;
    @XmlElement(name = "OutFile")
    protected String outFile;
    @XmlElement(name = "ExtraFile")
    protected String extraFile;
    @XmlElement(name = "MeterNumber")
    protected String meterNumber;
    @XmlElement(name = "OrigRef")
    protected String origRef;
    @XmlElement(name = "OrigTime")
    protected String origTime;

    /**
     * Gets the value of the balance property.
     * 
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     */
    public void setBalance(int value) {
        this.balance = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     */
    public int getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     */
    public void setCardStatus(int value) {
        this.cardStatus = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     */
    public int getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     */
    public void setCredit(int value) {
        this.credit = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * Gets the value of the debt property.
     * 
     */
    public int getDebt() {
        return debt;
    }

    /**
     * Sets the value of the debt property.
     * 
     */
    public void setDebt(int value) {
        this.debt = value;
    }

    /**
     * Gets the value of the typeData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeData() {
        return typeData;
    }

    /**
     * Sets the value of the typeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeData(String value) {
        this.typeData = value;
    }

    /**
     * Gets the value of the serial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerial() {
        return serial;
    }

    /**
     * Sets the value of the serial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerial(String value) {
        this.serial = value;
    }

    /**
     * Gets the value of the inFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFile() {
        return inFile;
    }

    /**
     * Sets the value of the inFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFile(String value) {
        this.inFile = value;
    }

    /**
     * Gets the value of the outFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFile() {
        return outFile;
    }

    /**
     * Sets the value of the outFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFile(String value) {
        this.outFile = value;
    }

    /**
     * Gets the value of the extraFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraFile() {
        return extraFile;
    }

    /**
     * Sets the value of the extraFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraFile(String value) {
        this.extraFile = value;
    }

    /**
     * Gets the value of the meterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterNumber() {
        return meterNumber;
    }

    /**
     * Sets the value of the meterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterNumber(String value) {
        this.meterNumber = value;
    }

    /**
     * Gets the value of the origRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigRef() {
        return origRef;
    }

    /**
     * Sets the value of the origRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigRef(String value) {
        this.origRef = value;
    }

    /**
     * Gets the value of the origTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigTime() {
        return origTime;
    }

    /**
     * Sets the value of the origTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigTime(String value) {
        this.origTime = value;
    }

}
