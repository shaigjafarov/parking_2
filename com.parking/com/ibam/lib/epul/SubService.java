
package com.ibam.lib.epul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocaleName" type="{http://quetzalcoatlus/EpulPaymentService}MultiLangString" minOccurs="0"/&gt;
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CantPayWithoutDebt" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SubServiceType" type="{http://quetzalcoatlus/EpulPaymentService}SubServiceType"/&gt;
 *         &lt;element name="LinkToService" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubService", propOrder = {
    "id",
    "name",
    "value",
    "localeName",
    "defaultValue",
    "cantPayWithoutDebt",
    "subServiceType",
    "linkToService"
})
public class SubService {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "LocaleName")
    protected MultiLangString localeName;
    @XmlElement(name = "DefaultValue")
    protected String defaultValue;
    @XmlElement(name = "CantPayWithoutDebt")
    protected boolean cantPayWithoutDebt;
    @XmlElement(name = "SubServiceType", required = true)
    @XmlSchemaType(name = "string")
    protected SubServiceType subServiceType;
    @XmlElement(name = "LinkToService")
    protected int linkToService;

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

}
