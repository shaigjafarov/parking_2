
package com.ibam.lib.epul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceFieldEnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceFieldEnum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceFieldEnum" type="{http://quetzalcoatlus/EpulPaymentService}ServiceFieldEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceFieldEnum", propOrder = {
    "serviceFieldEnum"
})
public class ArrayOfServiceFieldEnum {

    @XmlElement(name = "ServiceFieldEnum", nillable = true)
    protected List<ServiceFieldEnum> serviceFieldEnum;

    /**
     * Gets the value of the serviceFieldEnum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFieldEnum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFieldEnum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFieldEnum }
     * 
     * 
     */
    public List<ServiceFieldEnum> getServiceFieldEnum() {
        if (serviceFieldEnum == null) {
            serviceFieldEnum = new ArrayList<ServiceFieldEnum>();
        }
        return this.serviceFieldEnum;
    }

}
