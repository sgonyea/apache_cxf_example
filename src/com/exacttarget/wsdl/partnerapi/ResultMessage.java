
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConversationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverallStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RequestType" type="{http://exacttarget.com/wsdl/partnerAPI}RequestType" minOccurs="0"/>
 *         &lt;element name="ResultType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultDetailXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SequenceCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CallsInConversation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultMessage", propOrder = {
    "requestID",
    "conversationID",
    "overallStatusCode",
    "statusCode",
    "statusMessage",
    "errorCode",
    "requestType",
    "resultType",
    "resultDetailXML",
    "sequenceCode",
    "callsInConversation"
})
public class ResultMessage
    extends APIObject
{

    @XmlElement(name = "RequestID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String requestID;
    @XmlElement(name = "ConversationID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String conversationID;
    @XmlElement(name = "OverallStatusCode", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String overallStatusCode;
    @XmlElement(name = "StatusCode", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String statusCode;
    @XmlElement(name = "StatusMessage", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String statusMessage;
    @XmlElement(name = "ErrorCode", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer errorCode;
    @XmlElement(name = "RequestType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected RequestType requestType;
    @XmlElement(name = "ResultType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String resultType;
    @XmlElement(name = "ResultDetailXML", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String resultDetailXML;
    @XmlElement(name = "SequenceCode", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer sequenceCode;
    @XmlElement(name = "CallsInConversation", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer callsInConversation;

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the conversationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversationID() {
        return conversationID;
    }

    /**
     * Sets the value of the conversationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversationID(String value) {
        this.conversationID = value;
    }

    /**
     * Gets the value of the overallStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverallStatusCode() {
        return overallStatusCode;
    }

    /**
     * Sets the value of the overallStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallStatusCode(String value) {
        this.overallStatusCode = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Sets the value of the statusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorCode(Integer value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequestType(RequestType value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the resultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultType() {
        return resultType;
    }

    /**
     * Sets the value of the resultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultType(String value) {
        this.resultType = value;
    }

    /**
     * Gets the value of the resultDetailXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDetailXML() {
        return resultDetailXML;
    }

    /**
     * Sets the value of the resultDetailXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDetailXML(String value) {
        this.resultDetailXML = value;
    }

    /**
     * Gets the value of the sequenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceCode() {
        return sequenceCode;
    }

    /**
     * Sets the value of the sequenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceCode(Integer value) {
        this.sequenceCode = value;
    }

    /**
     * Gets the value of the callsInConversation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCallsInConversation() {
        return callsInConversation;
    }

    /**
     * Sets the value of the callsInConversation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCallsInConversation(Integer value) {
        this.callsInConversation = value;
    }

}
