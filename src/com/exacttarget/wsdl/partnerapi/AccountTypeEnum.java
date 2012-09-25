
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for AccountTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="EXACTTARGET"/>
 *     &lt;enumeration value="PRO_CONNECT"/>
 *     &lt;enumeration value="CHANNEL_CONNECT"/>
 *     &lt;enumeration value="CONNECT"/>
 *     &lt;enumeration value="PRO_CONNECT_CLIENT"/>
 *     &lt;enumeration value="LP_MEMBER"/>
 *     &lt;enumeration value="DOTO_MEMBER"/>
 *     &lt;enumeration value="ENTERPRISE_2"/>
 *     &lt;enumeration value="BUSINESS_UNIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum AccountTypeEnum {

    BUSINESS_UNIT("BUSINESS_UNIT"),
    CHANNEL_CONNECT("CHANNEL_CONNECT"),
    CONNECT("CONNECT"),
    DOTO_MEMBER("DOTO_MEMBER"),
    ENTERPRISE_2("ENTERPRISE_2"),
    EXACTTARGET("EXACTTARGET"),
    LP_MEMBER("LP_MEMBER"),
    @XmlEnumValue("None")
    NONE("None"),
    PRO_CONNECT("PRO_CONNECT"),
    PRO_CONNECT_CLIENT("PRO_CONNECT_CLIENT");
    private final String value;

    AccountTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountTypeEnum fromValue(String v) {
        for (AccountTypeEnum c: AccountTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
