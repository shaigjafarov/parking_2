
package com.ibam.lib.epul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceInfoItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceInfoItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceInfoItem" type="{http://quetzalcoatlus/EpulPaymentService}ServiceInfoItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceInfoItem", propOrder = {
    "serviceInfoItem"
})
public class ArrayOfServiceInfoItem {

    @XmlElement(name = "ServiceInfoItem", nillable = true)
    protected List<ServiceInfoItem> serviceInfoItem;

    /**
     * Gets the value of the serviceInfoItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceInfoItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceInfoItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceInfoItem }
     * 
     * 
     */
    public List<ServiceInfoItem> getServiceInfoItem() {
        if (serviceInfoItem == null) {
            serviceInfoItem = new ArrayList<ServiceInfoItem>();
        }
        return this.serviceInfoItem;
    }

}
