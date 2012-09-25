
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForwardedEmailOptInEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForwardedEmailOptInEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}TrackingEvent">
 *       &lt;sequence>
 *         &lt;element name="OptInSubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForwardedEmailOptInEvent", propOrder = {
    "optInSubscriberKey"
})
public class ForwardedEmailOptInEvent
    extends TrackingEvent
{

    @XmlElement(name = "OptInSubscriberKey", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String optInSubscriberKey;

    /**
     * Gets the value of the optInSubscriberKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptInSubscriberKey() {
        return optInSubscriberKey;
    }

    /**
     * Sets the value of the optInSubscriberKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptInSubscriberKey(String value) {
        this.optInSubscriberKey = value;
    }

}
