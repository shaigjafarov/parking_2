
package com.ibam.lib.epul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LocalName" type="{http://quetzalcoatlus/EpulPaymentService}MultiLangString" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegExp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="NormalizeRegExp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NormalizePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListEnums" type="{http://quetzalcoatlus/EpulPaymentService}ArrayOfServiceFieldEnum" minOccurs="0"/&gt;
 *         &lt;element name="LocalShortName" type="{http://quetzalcoatlus/EpulPaymentService}MultiLangString" minOccurs="0"/&gt;
 *         &lt;element name="LocalPlaceHolder" type="{http://quetzalcoatlus/EpulPaymentService}MultiLangString" minOccurs="0"/&gt;
 *         &lt;element name="ValueIsAmount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ValueMustBeExcluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FilterFieldIdAfterSelect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceField", propOrder = {
    "id",
    "serviceId",
    "localName",
    "name",
    "serviceName",
    "type",
    "regExp",
    "defaultValue",
    "orderNum",
    "normalizeRegExp",
    "normalizePattern",
    "listEnums",
    "localShortName",
    "localPlaceHolder",
    "valueIsAmount",
    "valueMustBeExcluded",
    "isHidden",
    "filterFieldIdAfterSelect",
    "groupId"
})
public class ServiceField {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "ServiceId")
    protected int serviceId;
    @XmlElement(name = "LocalName")
    protected MultiLangString localName;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ServiceName")
    protected String serviceName;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "RegExp")
    protected String regExp;
    @XmlElement(name = "DefaultValue")
    protected String defaultValue;
    @XmlElement(name = "OrderNum")
    protected short orderNum;
    @XmlElement(name = "NormalizeRegExp")
    protected String normalizeRegExp;
    @XmlElement(name = "NormalizePattern")
    protected String normalizePattern;
    @XmlElement(name = "ListEnums")
    protected ArrayOfServiceFieldEnum listEnums;
    @XmlElement(name = "LocalShortName")
    protected MultiLangString localShortName;
    @XmlElement(name = "LocalPlaceHolder")
    protected MultiLangString localPlaceHolder;
    @XmlElement(name = "ValueIsAmount")
    protected boolean valueIsAmount;
    @XmlElement(name = "ValueMustBeExcluded")
    protected boolean valueMustBeExcluded;
    @XmlElement(name = "IsHidden")
    protected boolean isHidden;
    @XmlElement(name = "FilterFieldIdAfterSelect")
    protected String filterFieldIdAfterSelect;
    @XmlElement(name = "GroupId")
    protected int groupId;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the regExp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegExp() {
        return regExp;
    }

    /**
     * Sets the value of the regExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegExp(String value) {
        this.regExp = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the orderNum property.
     * 
     */
    public short getOrderNum() {
        return orderNum;
    }

    /**
     * Sets the value of the orderNum property.
     * 
     */
    public void setOrderNum(short value) {
        this.orderNum = value;
    }

    /**
     * Gets the value of the normalizeRegExp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalizeRegExp() {
        return normalizeRegExp;
    }

    /**
     * Sets the value of the normalizeRegExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalizeRegExp(String value) {
        this.normalizeRegExp = value;
    }

    /**
     * Gets the value of the normalizePattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalizePattern() {
        return normalizePattern;
    }

    /**
     * Sets the value of the normalizePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalizePattern(String value) {
        this.normalizePattern = value;
    }

    /**
     * Gets the value of the listEnums property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceFieldEnum }
     *     
     */
    public ArrayOfServiceFieldEnum getListEnums() {
        return listEnums;
    }

    /**
     * Sets the value of the listEnums property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceFieldEnum }
     *     
     */
    public void setListEnums(ArrayOfServiceFieldEnum value) {
        this.listEnums = value;
    }

    /**
     * Gets the value of the localShortName property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangString }
     *     
     */
    public MultiLangString getLocalShortName() {
        return localShortName;
    }

    /**
     * Sets the value of the localShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangString }
     *     
     */
    public void setLocalShortName(MultiLangString value) {
        this.localShortName = value;
    }

    /**
     * Gets the value of the localPlaceHolder property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangString }
     *     
     */
    public MultiLangString getLocalPlaceHolder() {
        return localPlaceHolder;
    }

    /**
     * Sets the value of the localPlaceHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangString }
     *     
     */
    public void setLocalPlaceHolder(MultiLangString value) {
        this.localPlaceHolder = value;
    }

    /**
     * Gets the value of the valueIsAmount property.
     * 
     */
    public boolean isValueIsAmount() {
        return valueIsAmount;
    }

    /**
     * Sets the value of the valueIsAmount property.
     * 
     */
    public void setValueIsAmount(boolean value) {
        this.valueIsAmount = value;
    }

    /**
     * Gets the value of the valueMustBeExcluded property.
     * 
     */
    public boolean isValueMustBeExcluded() {
        return valueMustBeExcluded;
    }

    /**
     * Sets the value of the valueMustBeExcluded property.
     * 
     */
    public void setValueMustBeExcluded(boolean value) {
        this.valueMustBeExcluded = value;
    }

    /**
     * Gets the value of the isHidden property.
     * 
     */
    public boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Sets the value of the isHidden property.
     * 
     */
    public void setIsHidden(boolean value) {
        this.isHidden = value;
    }

    /**
     * Gets the value of the filterFieldIdAfterSelect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterFieldIdAfterSelect() {
        return filterFieldIdAfterSelect;
    }

    /**
     * Sets the value of the filterFieldIdAfterSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterFieldIdAfterSelect(String value) {
        this.filterFieldIdAfterSelect = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     */
    public int getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     */
    public void setGroupId(int value) {
        this.groupId = value;
    }

}
