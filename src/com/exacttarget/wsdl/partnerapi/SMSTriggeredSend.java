
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SMSTriggeredSend complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SMSTriggeredSend">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="SMSTriggeredSendDefinition" type="{http://exacttarget.com/wsdl/partnerAPI}SMSTriggeredSendDefinition" minOccurs="0"/>
 *         &lt;element name="Subscriber" type="{http://exacttarget.com/wsdl/partnerAPI}Subscriber" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMSTriggeredSend", propOrder = {
    "smsTriggeredSendDefinition",
    "subscriber",
    "message",
    "number"
})
public class SMSTriggeredSend
    extends APIObject
{

    @XmlElement(name = "SMSTriggeredSendDefinition", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected SMSTriggeredSendDefinition smsTriggeredSendDefinition;
    @XmlElement(name = "Subscriber", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Subscriber subscriber;
    @XmlElement(name = "Message", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String message;
    @XmlElement(name = "Number", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String number;

    /**
     * Gets the value of the smsTriggeredSendDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link SMSTriggeredSendDefinition }
     *     
     */
    public SMSTriggeredSendDefinition getSMSTriggeredSendDefinition() {
        return smsTriggeredSendDefinition;
    }

    /**
     * Sets the value of the smsTriggeredSendDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMSTriggeredSendDefinition }
     *     
     */
    public void setSMSTriggeredSendDefinition(SMSTriggeredSendDefinition value) {
        this.smsTriggeredSendDefinition = value;
    }

    /**
     * Gets the value of the subscriber property.
     * 
     * @return
     *     possible object is
     *     {@link Subscriber }
     *     
     */
    public Subscriber getSubscriber() {
        return subscriber;
    }

    /**
     * Sets the value of the subscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscriber }
     *     
     */
    public void setSubscriber(Subscriber value) {
        this.subscriber = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

}
