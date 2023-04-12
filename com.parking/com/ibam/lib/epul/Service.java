
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
 * <p>Java class for Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaypointPaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalName" type="{http://quetzalcoatlus/EpulPaymentService}MultiLangString" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="AmountType" type="{http://quetzalcoatlus/EpulPaymentService}ServiceAmountTypes"/&gt;
 *         &lt;element name="IsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CategoryId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MinAmount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="AssemblyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="MinimalComission" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="FloatAmount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ServiceFields" type="{http://quetzalcoatlus/EpulPaymentService}ArrayOfServiceField" minOccurs="0"/&gt;
 *         &lt;element name="SubServices" type="{http://quetzalcoatlus/EpulPaymentService}ArrayOfSubService" minOccurs="0"/&gt;
 *         &lt;element name="HasDebt" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="BonusDivider" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LocalDesc" type="{http://quetzalcoatlus/EpulPaymentService}MultiLangString" minOccurs="0"/&gt;
 *         &lt;element name="SmartCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HasPersonData" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FriendlyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceIdIfToggled" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsToggled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsPayAllDebtAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExcludeFromRecurrentPayments" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IconHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Groups" type="{http://quetzalcoatlus/EpulPaymentService}ServiceFieldGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsMandatorySubServiceValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", propOrder = {
    "id",
    "name",
    "subName",
    "paypointPaymentType",
    "localName",
    "type",
    "amountType",
    "isAvailable",
    "categoryId",
    "minAmount",
    "maxAmount",
    "assemblyId",
    "percent",
    "minimalComission",
    "floatAmount",
    "serviceFields",
    "subServices",
    "hasDebt",
    "bonusDivider",
    "localDesc",
    "smartCard",
    "hasPersonData",
    "friendlyName",
    "serviceIdIfToggled",
    "isToggled",
    "isPayAllDebtAvailable",
    "excludeFromRecurrentPayments",
    "iconHash",
    "groups",
    "isMandatorySubServiceValue"
})
public class Service {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SubName")
    protected String subName;
    @XmlElement(name = "PaypointPaymentType")
    protected String paypointPaymentType;
    @XmlElement(name = "LocalName")
    protected MultiLangString localName;
    @XmlElement(name = "Type")
    protected short type;
    @XmlElement(name = "AmountType", required = true)
    @XmlSchemaType(name = "string")
    protected ServiceAmountTypes amountType;
    @XmlElement(name = "IsAvailable")
    protected boolean isAvailable;
    @XmlElement(name = "CategoryId")
    protected int categoryId;
    @XmlElement(name = "MinAmount")
    protected int minAmount;
    @XmlElement(name = "MaxAmount")
    protected long maxAmount;
    @XmlElement(name = "AssemblyId")
    protected String assemblyId;
    @XmlElement(name = "Percent")
    protected short percent;
    @XmlElement(name = "MinimalComission", required = true)
    protected BigDecimal minimalComission;
    @XmlElement(name = "FloatAmount")
    protected boolean floatAmount;
    @XmlElement(name = "ServiceFields")
    protected ArrayOfServiceField serviceFields;
    @XmlElement(name = "SubServices")
    protected ArrayOfSubService subServices;
    @XmlElement(name = "HasDebt")
    protected boolean hasDebt;
    @XmlElement(name = "BonusDivider")
    protected int bonusDivider;
    @XmlElement(name = "LocalDesc")
    protected MultiLangString localDesc;
    @XmlElement(name = "SmartCard")
    protected boolean smartCard;
    @XmlElement(name = "HasPersonData")
    protected boolean hasPersonData;
    @XmlElement(name = "FriendlyName")
    protected String friendlyName;
    @XmlElement(name = "ServiceIdIfToggled")
    protected int serviceIdIfToggled;
    @XmlElement(name = "IsToggled")
    protected boolean isToggled;
    @XmlElement(name = "IsPayAllDebtAvailable")
    protected boolean isPayAllDebtAvailable;
    @XmlElement(name = "ExcludeFromRecurrentPayments")
    protected boolean excludeFromRecurrentPayments;
    @XmlElement(name = "IconHash")
    protected String iconHash;
    @XmlElement(name = "Groups")
    protected List<ServiceFieldGroup> groups;
    @XmlElement(name = "IsMandatorySubServiceValue")
    protected boolean isMandatorySubServiceValue;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
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
     * Gets the value of the subName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubName() {
        return subName;
    }

    /**
     * Sets the value of the subName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubName(String value) {
        this.subName = value;
    }

    /**
     * Gets the value of the paypointPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypointPaymentType() {
        return paypointPaymentType;
    }

    /**
     * Sets the value of the paypointPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypointPaymentType(String value) {
        this.paypointPaymentType = value;
    }

    /**
     * Gets the value of the localName property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangString }
     *     
     */
    public MultiLangString getLocalName() {
        return localName;
    }

    /**
     * Sets the value of the localName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangString }
     *     
     */
    public void setLocalName(MultiLangString value) {
        this.localName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public short getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(short value) {
        this.type = value;
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
     * Gets the value of the categoryId property.
     * 
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     */
    public void setCategoryId(int value) {
        this.categoryId = value;
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
    public long getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     */
    public void setMaxAmount(long value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the assemblyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssemblyId() {
        return assemblyId;
    }

    /**
     * Sets the value of the assemblyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssemblyId(String value) {
        this.assemblyId = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     */
    public short getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     */
    public void setPercent(short value) {
        this.percent = value;
    }

    /**
     * Gets the value of the minimalComission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimalComission() {
        return minimalComission;
    }

    /**
     * Sets the value of the minimalComission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimalComission(BigDecimal value) {
        this.minimalComission = value;
    }

    /**
     * Gets the value of the floatAmount property.
     * 
     */
    public boolean isFloatAmount() {
        return floatAmount;
    }

    /**
     * Sets the value of the floatAmount property.
     * 
     */
    public void setFloatAmount(boolean value) {
        this.floatAmount = value;
    }

    /**
     * Gets the value of the serviceFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceField }
     *     
     */
    public ArrayOfServiceField getServiceFields() {
        return serviceFields;
    }

    /**
     * Sets the value of the serviceFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceField }
     *     
     */
    public void setServiceFields(ArrayOfServiceField value) {
        this.serviceFields = value;
    }

    /**
     * Gets the value of the subServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubService }
     *     
     */
    public ArrayOfSubService getSubServices() {
        return subServices;
    }

    /**
     * Sets the value of the subServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubService }
     *     
     */
    public void setSubServices(ArrayOfSubService value) {
        this.subServices = value;
    }

    /**
     * Gets the value of the hasDebt property.
     * 
     */
    public boolean isHasDebt() {
        return hasDebt;
    }

    /**
     * Sets the value of the hasDebt property.
     * 
     */
    public void setHasDebt(boolean value) {
        this.hasDebt = value;
    }

    /**
     * Gets the value of the bonusDivider property.
     * 
     */
    public int getBonusDivider() {
        return bonusDivider;
    }

    /**
     * Sets the value of the bonusDivider property.
     * 
     */
    public void setBonusDivider(int value) {
        this.bonusDivider = value;
    }

    /**
     * Gets the value of the localDesc property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangString }
     *     
     */
    public MultiLangString getLocalDesc() {
        return localDesc;
    }

    /**
     * Sets the value of the localDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangString }
     *     
     */
    public void setLocalDesc(MultiLangString value) {
        this.localDesc = value;
    }

    /**
     * Gets the value of the smartCard property.
     * 
     */
    public boolean isSmartCard() {
        return smartCard;
    }

    /**
     * Sets the value of the smartCard property.
     * 
     */
    public void setSmartCard(boolean value) {
        this.smartCard = value;
    }

    /**
     * Gets the value of the hasPersonData property.
     * 
     */
    public boolean isHasPersonData() {
        return hasPersonData;
    }

    /**
     * Sets the value of the hasPersonData property.
     * 
     */
    public void setHasPersonData(boolean value) {
        this.hasPersonData = value;
    }

    /**
     * Gets the value of the friendlyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * Sets the value of the friendlyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriendlyName(String value) {
        this.friendlyName = value;
    }

    /**
     * Gets the value of the serviceIdIfToggled property.
     * 
     */
    public int getServiceIdIfToggled() {
        return serviceIdIfToggled;
    }

    /**
     * Sets the value of the serviceIdIfToggled property.
     * 
     */
    public void setServiceIdIfToggled(int value) {
        this.serviceIdIfToggled = value;
    }

    /**
     * Gets the value of the isToggled property.
     * 
     */
    public boolean isIsToggled() {
        return isToggled;
    }

    /**
     * Sets the value of the isToggled property.
     * 
     */
    public void setIsToggled(boolean value) {
        this.isToggled = value;
    }

    /**
     * Gets the value of the isPayAllDebtAvailable property.
     * 
     */
    public boolean isIsPayAllDebtAvailable() {
        return isPayAllDebtAvailable;
    }

    /**
     * Sets the value of the isPayAllDebtAvailable property.
     * 
     */
    public void setIsPayAllDebtAvailable(boolean value) {
        this.isPayAllDebtAvailable = value;
    }

    /**
     * Gets the value of the excludeFromRecurrentPayments property.
     * 
     */
    public boolean isExcludeFromRecurrentPayments() {
        return excludeFromRecurrentPayments;
    }

    /**
     * Sets the value of the excludeFromRecurrentPayments property.
     * 
     */
    public void setExcludeFromRecurrentPayments(boolean value) {
        this.excludeFromRecurrentPayments = value;
    }

    /**
     * Gets the value of the iconHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconHash() {
        return iconHash;
    }

    /**
     * Sets the value of the iconHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconHash(String value) {
        this.iconHash = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFieldGroup }
     * 
     * 
     */
    public List<ServiceFieldGroup> getGroups() {
        if (groups == null) {
            groups = new ArrayList<ServiceFieldGroup>();
        }
        return this.groups;
    }

    /**
     * Gets the value of the isMandatorySubServiceValue property.
     * 
     */
    public boolean isIsMandatorySubServiceValue() {
        return isMandatorySubServiceValue;
    }

    /**
     * Sets the value of the isMandatorySubServiceValue property.
     * 
     */
    public void setIsMandatorySubServiceValue(boolean value) {
        this.isMandatorySubServiceValue = value;
    }

}
