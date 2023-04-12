
package com.ibam.lib.epul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListServicesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListServicesResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://quetzalcoatlus/EpulPaymentService}StandardResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="List" type="{http://quetzalcoatlus/EpulPaymentService}ArrayOfService" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListServicesResult", propOrder = {
    "list"
})
public class ListServicesResult
    extends StandardResult
{

    @XmlElement(name = "List")
    protected ArrayOfService list;

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfService }
     *     
     */
    public ArrayOfService getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfService }
     *     
     */
    public void setList(ArrayOfService value) {
        this.list = value;
    }

}
