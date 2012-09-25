
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtractResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtractResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}Result">
 *       &lt;sequence>
 *         &lt;element name="Request" type="{http://exacttarget.com/wsdl/partnerAPI}ExtractRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtractResult", propOrder = {
    "request"
})
public class ExtractResult
    extends Result
{

    @XmlElement(name = "Request", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected ExtractRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractRequest }
     *     
     */
    public ExtractRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractRequest }
     *     
     */
    public void setRequest(ExtractRequest value) {
        this.request = value;
    }

}
