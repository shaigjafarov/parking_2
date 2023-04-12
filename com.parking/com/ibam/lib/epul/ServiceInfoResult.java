
package com.ibam.lib.epul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInfoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://quetzalcoatlus/EpulPaymentService}StandardResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Info" type="{http://quetzalcoatlus/EpulPaymentService}ServicesInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInfoResult", propOrder = {
    "info"
})
public class ServiceInfoResult
    extends StandardResult
{

    @XmlElement(name = "Info")
    protected ServicesInfo info;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link ServicesInfo }
     *     
     */
    public ServicesInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicesInfo }
     *     
     */
    public void setInfo(ServicesInfo value) {
        this.info = value;
    }

}
