
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for SystemStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SystemStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="UnplannedOutage"/>
 *     &lt;enumeration value="InMaintenance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum SystemStatusType {

    @XmlEnumValue("InMaintenance")
    IN_MAINTENANCE("InMaintenance"),
    OK("OK"),
    @XmlEnumValue("UnplannedOutage")
    UNPLANNED_OUTAGE("UnplannedOutage");
    private final String value;

    SystemStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemStatusType fromValue(String v) {
        for (SystemStatusType c: SystemStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
