
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for LogicalOperators.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LogicalOperators">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="AND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum LogicalOperators {

    AND,
    OR;

    public String value() {
        return name();
    }

    public static LogicalOperators fromValue(String v) {
        return valueOf(v);
    }

}
