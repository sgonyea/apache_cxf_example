
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for SubscriberAddressStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriberAddressStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OptedIn"/>
 *     &lt;enumeration value="OptedOut"/>
 *     &lt;enumeration value="InActive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum SubscriberAddressStatus {

    @XmlEnumValue("InActive")
    IN_ACTIVE("InActive"),
    @XmlEnumValue("OptedIn")
    OPTED_IN("OptedIn"),
    @XmlEnumValue("OptedOut")
    OPTED_OUT("OptedOut");
    private final String value;

    SubscriberAddressStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubscriberAddressStatus fromValue(String v) {
        for (SubscriberAddressStatus c: SubscriberAddressStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
