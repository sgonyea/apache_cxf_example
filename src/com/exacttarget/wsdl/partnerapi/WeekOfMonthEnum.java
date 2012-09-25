
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for WeekOfMonthEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WeekOfMonthEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="first"/>
 *     &lt;enumeration value="second"/>
 *     &lt;enumeration value="third"/>
 *     &lt;enumeration value="fourth"/>
 *     &lt;enumeration value="last"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum WeekOfMonthEnum {

    @XmlEnumValue("first")
    FIRST("first"),
    @XmlEnumValue("fourth")
    FOURTH("fourth"),
    @XmlEnumValue("last")
    LAST("last"),
    @XmlEnumValue("second")
    SECOND("second"),
    @XmlEnumValue("third")
    THIRD("third");
    private final String value;

    WeekOfMonthEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeekOfMonthEnum fromValue(String v) {
        for (WeekOfMonthEnum c: WeekOfMonthEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
