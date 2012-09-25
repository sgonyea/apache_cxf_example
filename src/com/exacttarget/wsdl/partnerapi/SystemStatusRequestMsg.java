
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemStatusRequestMsg element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="SystemStatusRequestMsg">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="Options" type="{http://exacttarget.com/wsdl/partnerAPI}SystemStatusOptions" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "options"
})
@XmlRootElement(name = "SystemStatusRequestMsg")
public class SystemStatusRequestMsg {

    @XmlElement(name = "Options", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected SystemStatusOptions options;

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link SystemStatusOptions }
     *     
     */
    public SystemStatusOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemStatusOptions }
     *     
     */
    public void setOptions(SystemStatusOptions value) {
        this.options = value;
    }

}
