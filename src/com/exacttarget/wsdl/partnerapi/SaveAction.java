
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for SaveAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SaveAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AddOnly"/>
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Nothing"/>
 *     &lt;enumeration value="UpdateAdd"/>
 *     &lt;enumeration value="UpdateOnly"/>
 *     &lt;enumeration value="Delete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum SaveAction {

    @XmlEnumValue("AddOnly")
    ADD_ONLY("AddOnly"),
    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Nothing")
    NOTHING("Nothing"),
    @XmlEnumValue("UpdateAdd")
    UPDATE_ADD("UpdateAdd"),
    @XmlEnumValue("UpdateOnly")
    UPDATE_ONLY("UpdateOnly");
    private final String value;

    SaveAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SaveAction fromValue(String v) {
        for (SaveAction c: SaveAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
