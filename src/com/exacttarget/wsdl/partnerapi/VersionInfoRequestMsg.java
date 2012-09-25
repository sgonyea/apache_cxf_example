
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VersionInfoRequestMsg element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="VersionInfoRequestMsg">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="IncludeVersionHistory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "includeVersionHistory"
})
@XmlRootElement(name = "VersionInfoRequestMsg")
public class VersionInfoRequestMsg {

    @XmlElement(name = "IncludeVersionHistory", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected boolean includeVersionHistory;

    /**
     * Gets the value of the includeVersionHistory property.
     * 
     */
    public boolean isIncludeVersionHistory() {
        return includeVersionHistory;
    }

    /**
     * Sets the value of the includeVersionHistory property.
     * 
     */
    public void setIncludeVersionHistory(boolean value) {
        this.includeVersionHistory = value;
    }

}
