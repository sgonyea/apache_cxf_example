
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoiceTriggeredSend complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoiceTriggeredSend">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="VoiceTriggeredSendDefinition" type="{http://exacttarget.com/wsdl/partnerAPI}VoiceTriggeredSendDefinition" minOccurs="0"/>
 *         &lt;element name="Subscriber" type="{http://exacttarget.com/wsdl/partnerAPI}Subscriber" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransferMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransferNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoiceTriggeredSend", propOrder = {
    "voiceTriggeredSendDefinition",
    "subscriber",
    "message",
    "number",
    "transferMessage",
    "transferNumber"
})
public class VoiceTriggeredSend
    extends APIObject
{

    @XmlElement(name = "VoiceTriggeredSendDefinition", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected VoiceTriggeredSendDefinition voiceTriggeredSendDefinition;
    @XmlElement(name = "Subscriber", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Subscriber subscriber;
    @XmlElement(name = "Message", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String message;
    @XmlElement(name = "Number", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String number;
    @XmlElement(name = "TransferMessage", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String transferMessage;
    @XmlElement(name = "TransferNumber", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String transferNumber;

    /**
     * Gets the value of the voiceTriggeredSendDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link VoiceTriggeredSendDefinition }
     *     
     */
    public VoiceTriggeredSendDefinition getVoiceTriggeredSendDefinition() {
        return voiceTriggeredSendDefinition;
    }

    /**
     * Sets the value of the voiceTriggeredSendDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceTriggeredSendDefinition }
     *     
     */
    public void setVoiceTriggeredSendDefinition(VoiceTriggeredSendDefinition value) {
        this.voiceTriggeredSendDefinition = value;
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

    /**
     * Gets the value of the transferMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferMessage() {
        return transferMessage;
    }

    /**
     * Sets the value of the transferMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferMessage(String value) {
        this.transferMessage = value;
    }

    /**
     * Gets the value of the transferNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferNumber() {
        return transferNumber;
    }

    /**
     * Sets the value of the transferNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferNumber(String value) {
        this.transferNumber = value;
    }

}
