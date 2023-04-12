
package com.ibam.lib.epul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EpulByIdRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EpulByIdRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://quetzalcoatlus/EpulPaymentService}EpulPaymentStandardRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EpulByIdRequest", propOrder = {
    "id"
})
public class EpulByIdRequest
    extends EpulPaymentStandardRequest
{

    @XmlElement(name = "Id")
    protected long id;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

}
