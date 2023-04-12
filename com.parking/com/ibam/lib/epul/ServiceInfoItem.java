
package com.ibam.lib.epul;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceInfoItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInfoItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LocaleName" type="{http://quetzalcoatlus/EpulPaymentService}MultiLangString" minOccurs="0"/&gt;
 *         &lt;element name="CantPayWithoutDebt" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowAmount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FixedAmount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CurrencyConverterExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="HasAdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AdditionalInfoBasedOnServiceInfoItem" type="{http://quetzalcoatlus/EpulPaymentService}KeyValueString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubServiceType" type="{http://quetzalcoatlus/EpulPaymentService}SubServiceType"/&gt;
 *         &lt;element name="LinkToService" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LinkToServiceFields" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaxAmount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SameCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInfoItem", propOrder = {
    "id",
    "title",
    "value",
    "amount",
    "localeName",
    "cantPayWithoutDebt",
    "showAmount",
    "currency",
    "fixedAmount",
    "readOnly",
    "currencyConverterExists",
    "exchangeRate",
    "hasAdditionalInfo",
    "additionalInfoBasedOnServiceInfoItem",
    "subServiceType",
    "linkToService",
    "linkToServiceFields",
    "maxAmount",
    "sameCurrency"
})
public class ServiceInfoItem {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "Amount")
    protected int amount;
    @XmlElement(name = "LocaleName")
    protected MultiLangString localeName;
    @XmlElement(name = "CantPayWithoutDebt")
    protected boolean cantPayWithoutDebt;
    @XmlElement(name = "ShowAmount")
    protected boolean showAmount;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "FixedAmount")
    protected boolean fixedAmount;
    @XmlElement(name = "ReadOnly")
    protected boolean readOnly;
    @XmlElement(name = "CurrencyConverterExists")
    protected boolean currencyConverterExists;
    @XmlElement(name = "ExchangeRate", required = true)
    protected BigDecimal exchangeRate;
    @XmlElement(name = "HasAdditionalInfo")
    protected boolean hasAdditionalInfo;
    @XmlElement(name = "AdditionalInfoBasedOnServiceInfoItem")
    protected List<KeyValueString> additionalInfoBasedOnServiceInfoItem;
    @XmlElement(name = "SubServiceType", required = true)
    @XmlSchemaType(name = "string")
    protected SubServiceType subServiceType;
    @XmlElement(name = "LinkToService")
    protected int linkToService;
    @XmlElement(name = "LinkToServiceFields")
    protected String linkToServiceFields;
    @XmlElement(name = "MaxAmount")
    protected int maxAmount;
    @XmlElement(name = "SameCurrency")
    protected boolean sameCurrency;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

    /**
     * Gets the value of the localeName property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangString }
     *     
     */
    public MultiLangString getLocaleName() {
        return localeName;
    }

    /**
     * Sets the value of the localeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangString }
     *     
     */
    public void setLocaleName(MultiLangString value) {
        this.localeName = value;
    }

    /**
     * Gets the value of the cantPayWithoutDebt property.
     * 
     */
    public boolean isCantPayWithoutDebt() {
        return cantPayWithoutDebt;
    }

    /**
     * Sets the value of the cantPayWithoutDebt property.
     * 
     */
    public void setCantPayWithoutDebt(boolean value) {
        this.cantPayWithoutDebt = value;
    }

    /**
     * Gets the value of the showAmount property.
     * 
     */
    public boolean isShowAmount() {
        return showAmount;
    }

    /**
     * Sets the value of the showAmount property.
     * 
     */
    public void setShowAmount(boolean value) {
        this.showAmount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the fixedAmount property.
     * 
     */
    public boolean isFixedAmount() {
        return fixedAmount;
    }

    /**
     * Sets the value of the fixedAmount property.
     * 
     */
    public void setFixedAmount(boolean value) {
        this.fixedAmount = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     */
    public boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     */
    public void setReadOnly(boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the currencyConverterExists property.
     * 
     */
    public boolean isCurrencyConverterExists() {
        return currencyConverterExists;
    }

    /**
     * Sets the value of the currencyConverterExists property.
     * 
     */
    public void setCurrencyConverterExists(boolean value) {
        this.currencyConverterExists = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the hasAdditionalInfo property.
     * 
     */
    public boolean isHasAdditionalInfo() {
        return hasAdditionalInfo;
    }

    /**
     * Sets the value of the hasAdditionalInfo property.
     * 
     */
    public void setHasAdditionalInfo(boolean value) {
        this.hasAdditionalInfo = value;
    }

    /**
     * Gets the value of the additionalInfoBasedOnServiceInfoItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfoBasedOnServiceInfoItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfoBasedOnServiceInfoItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueString }
     * 
     * 
     */
    public List<KeyValueString> getAdditionalInfoBasedOnServiceInfoItem() {
        if (additionalInfoBasedOnServiceInfoItem == null) {
            additionalInfoBasedOnServiceInfoItem = new ArrayList<KeyValueString>();
        }
        return this.additionalInfoBasedOnServiceInfoItem;
    }

    /**
     * Gets the value of the subServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link SubServiceType }
     *     
     */
    public SubServiceType getSubServiceType() {
        return subServiceType;
    }

    /**
     * Sets the value of the subServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubServiceType }
     *     
     */
    public void setSubServiceType(SubServiceType value) {
        this.subServiceType = value;
    }

    /**
     * Gets the value of the linkToService property.
     * 
     */
    public int getLinkToService() {
        return linkToService;
    }

    /**
     * Sets the value of the linkToService property.
     * 
     */
    public void setLinkToService(int value) {
        this.linkToService = value;
    }

    /**
     * Gets the value of the linkToServiceFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkToServiceFields() {
        return linkToServiceFields;
    }

    /**
     * Sets the value of the linkToServiceFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkToServiceFields(String value) {
        this.linkToServiceFields = value;
    }

    /**
     * Gets the value of the maxAmount property.
     * 
     */
    public int getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     */
    public void setMaxAmount(int value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the sameCurrency property.
     * 
     */
    public boolean isSameCurrency() {
        return sameCurrency;
    }

    /**
     * Sets the value of the sameCurrency property.
     * 
     */
    public void setSameCurrency(boolean value) {
        this.sameCurrency = value;
    }

}
