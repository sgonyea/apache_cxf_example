
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveSingleRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveSingleRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}Request">
 *       &lt;sequence>
 *         &lt;element name="RequestedObject" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject"/>
 *         &lt;element name="RetrieveOption" type="{http://exacttarget.com/wsdl/partnerAPI}Options" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveSingleRequest", propOrder = {
    "requestedObject",
    "retrieveOption"
})
public class RetrieveSingleRequest
    extends Request
{

    @XmlElement(name = "RequestedObject", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected APIObject requestedObject;
    @XmlElement(name = "RetrieveOption", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Options retrieveOption;

    /**
     * Gets the value of the requestedObject property.
     * 
     * @return
     *     possible object is
     *     {@link APIObject }
     *     
     */
    public APIObject getRequestedObject() {
        return requestedObject;
    }

    /**
     * Sets the value of the requestedObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIObject }
     *     
     */
    public void setRequestedObject(APIObject value) {
        this.requestedObject = value;
    }

    /**
     * Gets the value of the retrieveOption property.
     * 
     * @return
     *     possible object is
     *     {@link Options }
     *     
     */
    public Options getRetrieveOption() {
        return retrieveOption;
    }

    /**
     * Sets the value of the retrieveOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Options }
     *     
     */
    public void setRetrieveOption(Options value) {
        this.retrieveOption = value;
    }

}
