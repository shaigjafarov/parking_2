
package com.ibam.lib.epul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultCodes" type="{http://quetzalcoatlus/EpulPaymentService}ResultCodes"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardResult", propOrder = {
    "resultCodes",
    "description"
})
@XmlSeeAlso({
    ListServicesResult.class,
    ServiceInfoResult.class,
    PayResult.class,
    EpulCheckTransactionResult.class,
    EpulPaymentHistoryResult.class,
    ListPlainCategoriesResult.class,
    FeeResult.class
})
public class StandardResult {

    @XmlElement(name = "ResultCodes", required = true)
    @XmlSchemaType(name = "string")
    protected ResultCodes resultCodes;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the resultCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ResultCodes }
     *     
     */
    public ResultCodes getResultCodes() {
        return resultCodes;
    }

    /**
     * Sets the value of the resultCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultCodes }
     *     
     */
    public void setResultCodes(ResultCodes value) {
        this.resultCodes = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
