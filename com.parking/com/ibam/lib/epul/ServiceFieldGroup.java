
package com.ibam.lib.epul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceFieldGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceFieldGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Name" type="{http://quetzalcoatlus/EpulPaymentService}MultiLangString" minOccurs="0"/&gt;
 *         &lt;element name="Fields" type="{http://quetzalcoatlus/EpulPaymentService}ServiceField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFieldGroup", propOrder = {
    "id",
    "name",
    "fields",
    "orderNumber"
})
public class ServiceFieldGroup {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Name")
    protected MultiLangString name;
    @XmlElement(name = "Fields")
    protected List<ServiceField> fields;
    @XmlElement(name = "OrderNumber")
    protected int orderNumber;

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
     *     {@link MultiLangString }
     *     
     */
    public MultiLangString getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangString }
     *     
     */
    public void setName(MultiLangString value) {
        this.name = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceField }
     * 
     * 
     */
    public List<ServiceField> getFields() {
        if (fields == null) {
            fields = new ArrayList<ServiceField>();
        }
        return this.fields;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     */
    public void setOrderNumber(int value) {
        this.orderNumber = value;
    }

}
