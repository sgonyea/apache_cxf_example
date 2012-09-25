
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for SimpleOperators.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SimpleOperators">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="equals"/>
 *     &lt;enumeration value="notEquals"/>
 *     &lt;enumeration value="greaterThan"/>
 *     &lt;enumeration value="lessThan"/>
 *     &lt;enumeration value="isNull"/>
 *     &lt;enumeration value="isNotNull"/>
 *     &lt;enumeration value="greaterThanOrEqual"/>
 *     &lt;enumeration value="lessThanOrEqual"/>
 *     &lt;enumeration value="between"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="like"/>
 *     &lt;enumeration value="existsInString"/>
 *     &lt;enumeration value="existsInStringAsAWord"/>
 *     &lt;enumeration value="notExistsInString"/>
 *     &lt;enumeration value="beginsWith"/>
 *     &lt;enumeration value="endsWith"/>
 *     &lt;enumeration value="contains"/>
 *     &lt;enumeration value="notContains"/>
 *     &lt;enumeration value="isAnniversary"/>
 *     &lt;enumeration value="isNotAnniversary"/>
 *     &lt;enumeration value="greaterThanAnniversary"/>
 *     &lt;enumeration value="lessThanAnniversary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum SimpleOperators {

    @XmlEnumValue("beginsWith")
    BEGINS_WITH("beginsWith"),
    @XmlEnumValue("between")
    BETWEEN("between"),
    @XmlEnumValue("contains")
    CONTAINS("contains"),
    @XmlEnumValue("endsWith")
    ENDS_WITH("endsWith"),
    @XmlEnumValue("equals")
    EQUALS("equals"),
    @XmlEnumValue("existsInString")
    EXISTS_IN_STRING("existsInString"),
    @XmlEnumValue("existsInStringAsAWord")
    EXISTS_IN_STRING_AS_A_WORD("existsInStringAsAWord"),
    @XmlEnumValue("greaterThan")
    GREATER_THAN("greaterThan"),
    @XmlEnumValue("greaterThanAnniversary")
    GREATER_THAN_ANNIVERSARY("greaterThanAnniversary"),
    @XmlEnumValue("greaterThanOrEqual")
    GREATER_THAN_OR_EQUAL("greaterThanOrEqual"),
    IN("IN"),
    @XmlEnumValue("isAnniversary")
    IS_ANNIVERSARY("isAnniversary"),
    @XmlEnumValue("isNotAnniversary")
    IS_NOT_ANNIVERSARY("isNotAnniversary"),
    @XmlEnumValue("isNotNull")
    IS_NOT_NULL("isNotNull"),
    @XmlEnumValue("isNull")
    IS_NULL("isNull"),
    @XmlEnumValue("lessThan")
    LESS_THAN("lessThan"),
    @XmlEnumValue("lessThanAnniversary")
    LESS_THAN_ANNIVERSARY("lessThanAnniversary"),
    @XmlEnumValue("lessThanOrEqual")
    LESS_THAN_OR_EQUAL("lessThanOrEqual"),
    @XmlEnumValue("like")
    LIKE("like"),
    @XmlEnumValue("notContains")
    NOT_CONTAINS("notContains"),
    @XmlEnumValue("notEquals")
    NOT_EQUALS("notEquals"),
    @XmlEnumValue("notExistsInString")
    NOT_EXISTS_IN_STRING("notExistsInString");
    private final String value;

    SimpleOperators(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SimpleOperators fromValue(String v) {
        for (SimpleOperators c: SimpleOperators.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
