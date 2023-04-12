
package com.ibam.lib.epul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubServiceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Standart"/&gt;
 *     &lt;enumeration value="LinkPayment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubServiceType")
@XmlEnum
public enum SubServiceType {

    @XmlEnumValue("Standart")
    STANDART("Standart"),
    @XmlEnumValue("LinkPayment")
    LINK_PAYMENT("LinkPayment");
    private final String value;

    SubServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubServiceType fromValue(String v) {
        for (SubServiceType c: SubServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
