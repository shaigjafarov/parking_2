
package com.ibam.lib.epul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListPlainCategoriesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListPlainCategoriesResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://quetzalcoatlus/EpulPaymentService}StandardResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="List" type="{http://quetzalcoatlus/EpulPaymentService}PlainCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListPlainCategoriesResult", propOrder = {
    "list"
})
public class ListPlainCategoriesResult
    extends StandardResult
{

    @XmlElement(name = "List")
    protected List<PlainCategory> list;

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlainCategory }
     * 
     * 
     */
    public List<PlainCategory> getList() {
        if (list == null) {
            list = new ArrayList<PlainCategory>();
        }
        return this.list;
    }

}
