
package com.ibam.lib.epul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceFieldEnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceFieldEnum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LocaleName" type="{http://quetzalcoatlus/EpulPaymentService}MultiLangString" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FilteredFieldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFieldEnum", propOrder = {
    "fieldId",
    "localeName",
    "name",
    "value",
    "filteredFieldValue"
})
public class ServiceFieldEnum {

    @XmlElement(name = "FieldId")
    protected int fieldId;
    @XmlElement(name = "LocaleName")
    protected MultiLangString localeName;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "FilteredFieldValue")
    protected String filteredFieldValue;

    /**
     * Gets the value of the fieldId property.
     * 
     */
    public int getFieldId() {
        return fieldId;
    }

    /**
     * Sets the value of the fieldId property.
     * 
     */
    public void setFieldId(int value) {
        this.fieldId = value;
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
     * Gets the value of the filteredFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilteredFieldValue() {
        return filteredFieldValue;
    }

    /**
     * Sets the value of the filteredFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilteredFieldValue(String value) {
        this.filteredFieldValue = value;
    }

}
