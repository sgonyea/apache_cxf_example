
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for ExtractParameterDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtractParameterDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="datetime"/>
 *     &lt;enumeration value="bool"/>
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="integer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ExtractParameterDataType {

    @XmlEnumValue("bool")
    BOOL("bool"),
    @XmlEnumValue("datetime")
    DATETIME("datetime"),
    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("string")
    STRING("string");
    private final String value;

    ExtractParameterDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtractParameterDataType fromValue(String v) {
        for (ExtractParameterDataType c: ExtractParameterDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
