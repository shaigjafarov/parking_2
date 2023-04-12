
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
 * <p>Java class for ServicesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicesInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Person" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Debt" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Values" type="{http://quetzalcoatlus/EpulPaymentService}ArrayOfServiceInfoItem" minOccurs="0"/&gt;
 *         &lt;element name="InternalSingleServiceInfoValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AdditionalInfo" type="{http://quetzalcoatlus/EpulPaymentService}ArrayOfKeyValueString" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalFields" type="{http://quetzalcoatlus/EpulPaymentService}ArrayOfKeyValueString" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardSerialnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardInFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardOutFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardExtraFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardError" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OptionAmounts" type="{http://quetzalcoatlus/EpulPaymentService}KeyValueString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PersonInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttentionMessage" type="{http://quetzalcoatlus/EpulPaymentService}MultiLangString" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ExchangeCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MinAmount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxAmount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TotalAmountForPayAllDebt" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="HasLinkPayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AmountType" type="{http://quetzalcoatlus/EpulPaymentService}ServiceAmountTypes"/&gt;
 *         &lt;element name="FixedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SameCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Voen" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Verdict" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResultCode" type="{http://quetzalcoatlus/EpulPaymentService}ResultCodes"/&gt;
 *         &lt;element name="MaxAmountSetByGetInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicesInfo", propOrder = {
    "person",
    "debt",
    "values",
    "internalSingleServiceInfoValue",
    "isAvailable",
    "isError",
    "additionalInfo",
    "additionalFields",
    "currency",
    "cardType",
    "cardSerialnum",
    "cardInFile",
    "cardOutFile",
    "cardExtraFile",
    "cardError",
    "optionAmounts",
    "personInfo",
    "attentionMessage",
    "exchangeRate",
    "exchangeCurrency",
    "minAmount",
    "maxAmount",
    "balance",
    "totalAmountForPayAllDebt",
    "hasLinkPayment",
    "amountType",
    "fixedAmount",
    "sameCurrency",
    "voen",
    "verdict",
    "date",
    "resultCode",
    "maxAmountSetByGetInfo"
})
public class ServicesInfo {

    @XmlElement(name = "Person")
    protected String person;
    @XmlElement(name = "Debt")
    protected float debt;
    @XmlElement(name = "Values")
    protected ArrayOfServiceInfoItem values;
    @XmlElement(name = "InternalSingleServiceInfoValue")
    protected String internalSingleServiceInfoValue;
    @XmlElement(name = "IsAvailable")
    protected boolean isAvailable;
    @XmlElement(name = "IsError")
    protected boolean isError;
    @XmlElement(name = "AdditionalInfo")
    protected ArrayOfKeyValueString additionalInfo;
    @XmlElement(name = "AdditionalFields")
    protected ArrayOfKeyValueString additionalFields;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "CardSerialnum")
    protected String cardSerialnum;
    @XmlElement(name = "CardInFile")
    protected String cardInFile;
    @XmlElement(name = "CardOutFile")
    protected String cardOutFile;
    @XmlElement(name = "CardExtraFile")
    protected String cardExtraFile;
    @XmlElement(name = "CardError")
    protected int cardError;
    @XmlElement(name = "OptionAmounts")
    protected List<KeyValueString> optionAmounts;
    @XmlElement(name = "PersonInfo")
    protected String personInfo;
    @XmlElement(name = "AttentionMessage")
    protected MultiLangString attentionMessage;
    @XmlElement(name = "ExchangeRate", required = true)
    protected BigDecimal exchangeRate;
    @XmlElement(name = "ExchangeCurrency")
    protected String exchangeCurrency;
    @XmlElement(name = "MinAmount")
    protected int minAmount;
    @XmlElement(name = "MaxAmount")
    protected int maxAmount;
    @XmlElement(name = "Balance", required = true)
    protected BigDecimal balance;
    @XmlElement(name = "TotalAmountForPayAllDebt", required = true)
    protected BigDecimal totalAmountForPayAllDebt;
    @XmlElement(name = "HasLinkPayment")
    protected boolean hasLinkPayment;
    @XmlElement(name = "AmountType", required = true)
    @XmlSchemaType(name = "string")
    protected ServiceAmountTypes amountType;
    @XmlElement(name = "FixedAmount", required = true)
    protected BigDecimal fixedAmount;
    @XmlElement(name = "SameCurrency")
    protected boolean sameCurrency;
    @XmlElement(name = "Voen")
    protected long voen;
    @XmlElement(name = "Verdict")
    protected int verdict;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "ResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected ResultCodes resultCode;
    @XmlElement(name = "MaxAmountSetByGetInfo")
    protected boolean maxAmountSetByGetInfo;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerson(String value) {
        this.person = value;
    }

    /**
     * Gets the value of the debt property.
     * 
     */
    public float getDebt() {
        return debt;
    }

    /**
     * Sets the value of the debt property.
     * 
     */
    public void setDebt(float value) {
        this.debt = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceInfoItem }
     *     
     */
    public ArrayOfServiceInfoItem getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceInfoItem }
     *     
     */
    public void setValues(ArrayOfServiceInfoItem value) {
        this.values = value;
    }

    /**
     * Gets the value of the internalSingleServiceInfoValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalSingleServiceInfoValue() {
        return internalSingleServiceInfoValue;
    }

    /**
     * Sets the value of the internalSingleServiceInfoValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalSingleServiceInfoValue(String value) {
        this.internalSingleServiceInfoValue = value;
    }

    /**
     * Gets the value of the isAvailable property.
     * 
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * Sets the value of the isAvailable property.
     * 
     */
    public void setIsAvailable(boolean value) {
        this.isAvailable = value;
    }

    /**
     * Gets the value of the isError property.
     * 
     */
    public boolean isIsError() {
        return isError;
    }

    /**
     * Sets the value of the isError property.
     * 
     */
    public void setIsError(boolean value) {
        this.isError = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueString }
     *     
     */
    public ArrayOfKeyValueString getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueString }
     *     
     */
    public void setAdditionalInfo(ArrayOfKeyValueString value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the additionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueString }
     *     
     */
    public ArrayOfKeyValueString getAdditionalFields() {
        return additionalFields;
    }

    /**
     * Sets the value of the additionalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueString }
     *     
     */
    public void setAdditionalFields(ArrayOfKeyValueString value) {
        this.additionalFields = value;
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
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardSerialnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSerialnum() {
        return cardSerialnum;
    }

    /**
     * Sets the value of the cardSerialnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSerialnum(String value) {
        this.cardSerialnum = value;
    }

    /**
     * Gets the value of the cardInFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardInFile() {
        return cardInFile;
    }

    /**
     * Sets the value of the cardInFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardInFile(String value) {
        this.cardInFile = value;
    }

    /**
     * Gets the value of the cardOutFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardOutFile() {
        return cardOutFile;
    }

    /**
     * Sets the value of the cardOutFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardOutFile(String value) {
        this.cardOutFile = value;
    }

    /**
     * Gets the value of the cardExtraFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExtraFile() {
        return cardExtraFile;
    }

    /**
     * Sets the value of the cardExtraFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExtraFile(String value) {
        this.cardExtraFile = value;
    }

    /**
     * Gets the value of the cardError property.
     * 
     */
    public int getCardError() {
        return cardError;
    }

    /**
     * Sets the value of the cardError property.
     * 
     */
    public void setCardError(int value) {
        this.cardError = value;
    }

    /**
     * Gets the value of the optionAmounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionAmounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionAmounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueString }
     * 
     * 
     */
    public List<KeyValueString> getOptionAmounts() {
        if (optionAmounts == null) {
            optionAmounts = new ArrayList<KeyValueString>();
        }
        return this.optionAmounts;
    }

    /**
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonInfo(String value) {
        this.personInfo = value;
    }

    /**
     * Gets the value of the attentionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangString }
     *     
     */
    public MultiLangString getAttentionMessage() {
        return attentionMessage;
    }

    /**
     * Sets the value of the attentionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangString }
     *     
     */
    public void setAttentionMessage(MultiLangString value) {
        this.attentionMessage = value;
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
     * Gets the value of the exchangeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeCurrency() {
        return exchangeCurrency;
    }

    /**
     * Sets the value of the exchangeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeCurrency(String value) {
        this.exchangeCurrency = value;
    }

    /**
     * Gets the value of the minAmount property.
     * 
     */
    public int getMinAmount() {
        return minAmount;
    }

    /**
     * Sets the value of the minAmount property.
     * 
     */
    public void setMinAmount(int value) {
        this.minAmount = value;
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
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the totalAmountForPayAllDebt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmountForPayAllDebt() {
        return totalAmountForPayAllDebt;
    }

    /**
     * Sets the value of the totalAmountForPayAllDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmountForPayAllDebt(BigDecimal value) {
        this.totalAmountForPayAllDebt = value;
    }

    /**
     * Gets the value of the hasLinkPayment property.
     * 
     */
    public boolean isHasLinkPayment() {
        return hasLinkPayment;
    }

    /**
     * Sets the value of the hasLinkPayment property.
     * 
     */
    public void setHasLinkPayment(boolean value) {
        this.hasLinkPayment = value;
    }

    /**
     * Gets the value of the amountType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAmountTypes }
     *     
     */
    public ServiceAmountTypes getAmountType() {
        return amountType;
    }

    /**
     * Sets the value of the amountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAmountTypes }
     *     
     */
    public void setAmountType(ServiceAmountTypes value) {
        this.amountType = value;
    }

    /**
     * Gets the value of the fixedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedAmount() {
        return fixedAmount;
    }

    /**
     * Sets the value of the fixedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixedAmount(BigDecimal value) {
        this.fixedAmount = value;
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

    /**
     * Gets the value of the voen property.
     * 
     */
    public long getVoen() {
        return voen;
    }

    /**
     * Sets the value of the voen property.
     * 
     */
    public void setVoen(long value) {
        this.voen = value;
    }

    /**
     * Gets the value of the verdict property.
     * 
     */
    public int getVerdict() {
        return verdict;
    }

    /**
     * Sets the value of the verdict property.
     * 
     */
    public void setVerdict(int value) {
        this.verdict = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResultCodes }
     *     
     */
    public ResultCodes getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultCodes }
     *     
     */
    public void setResultCode(ResultCodes value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the maxAmountSetByGetInfo property.
     * 
     */
    public boolean isMaxAmountSetByGetInfo() {
        return maxAmountSetByGetInfo;
    }

    /**
     * Sets the value of the maxAmountSetByGetInfo property.
     * 
     */
    public void setMaxAmountSetByGetInfo(boolean value) {
        this.maxAmountSetByGetInfo = value;
    }

}
