
package com.ibam.lib.epul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceAmountTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceAmountTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotSet"/&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Fixed"/&gt;
 *     &lt;enumeration value="Option"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceAmountTypes")
@XmlEnum
public enum ServiceAmountTypes {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Fixed")
    FIXED("Fixed"),
    @XmlEnumValue("Option")
    OPTION("Option");
    private final String value;

    ServiceAmountTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceAmountTypes fromValue(String v) {
        for (ServiceAmountTypes c: ServiceAmountTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
