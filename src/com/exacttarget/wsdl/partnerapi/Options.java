
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.exacttarget.wsdl.partnerapi.Options.SaveOptions;


/**
 * <p>Java class for Options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Options">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Client" type="{http://exacttarget.com/wsdl/partnerAPI}ClientID" minOccurs="0"/>
 *         &lt;element name="SendResponseTo" type="{http://exacttarget.com/wsdl/partnerAPI}AsyncResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SaveOptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SaveOption" type="{http://exacttarget.com/wsdl/partnerAPI}SaveOption" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *         &lt;element name="ConversationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SequenceCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CallsInConversation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScheduledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RequestType" type="{http://exacttarget.com/wsdl/partnerAPI}RequestType" minOccurs="0"/>
 *         &lt;element name="QueuePriority" type="{http://exacttarget.com/wsdl/partnerAPI}Priority" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Options", propOrder = {
    "client",
    "sendResponseTo",
    "saveOptions",
    "priority",
    "conversationID",
    "sequenceCode",
    "callsInConversation",
    "scheduledTime",
    "requestType",
    "queuePriority"
})
public abstract class Options {

    @XmlElement(name = "Client", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected ClientID client;
    @XmlElement(name = "SendResponseTo", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<AsyncResponse> sendResponseTo;
    @XmlElement(name = "SaveOptions", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected SaveOptions saveOptions;
    @XmlElement(name = "Priority", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Byte priority;
    @XmlElement(name = "ConversationID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String conversationID;
    @XmlElement(name = "SequenceCode", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer sequenceCode;
    @XmlElement(name = "CallsInConversation", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Integer callsInConversation;
    @XmlElement(name = "ScheduledTime", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected XMLGregorianCalendar scheduledTime;
    @XmlElement(name = "RequestType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected RequestType requestType;
    @XmlElement(name = "QueuePriority", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Priority queuePriority;

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link ClientID }
     *     
     */
    public ClientID getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientID }
     *     
     */
    public void setClient(ClientID value) {
        this.client = value;
    }

    /**
     * Gets the value of the sendResponseTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sendResponseTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSendResponseTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AsyncResponse }
     * 
     * 
     */
    public List<AsyncResponse> getSendResponseTo() {
        if (sendResponseTo == null) {
            sendResponseTo = new ArrayList<AsyncResponse>();
        }
        return this.sendResponseTo;
    }

    /**
     * Gets the value of the saveOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SaveOptions }
     *     
     */
    public SaveOptions getSaveOptions() {
        return saveOptions;
    }

    /**
     * Sets the value of the saveOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveOptions }
     *     
     */
    public void setSaveOptions(SaveOptions value) {
        this.saveOptions = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPriority(Byte value) {
        this.priority = value;
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

    /**
     * Gets the value of the scheduledTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledTime() {
        return scheduledTime;
    }

    /**
     * Sets the value of the scheduledTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledTime(XMLGregorianCalendar value) {
        this.scheduledTime = value;
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
     * Gets the value of the queuePriority property.
     * 
     * @return
     *     possible object is
     *     {@link Priority }
     *     
     */
    public Priority getQueuePriority() {
        return queuePriority;
    }

    /**
     * Sets the value of the queuePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority }
     *     
     */
    public void setQueuePriority(Priority value) {
        this.queuePriority = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SaveOption" type="{http://exacttarget.com/wsdl/partnerAPI}SaveOption" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "saveOption"
    })
    public static class SaveOptions {

        @XmlElement(name = "SaveOption", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
        protected List<SaveOption> saveOption;

        /**
         * Gets the value of the saveOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the saveOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSaveOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SaveOption }
         * 
         * 
         */
        public List<SaveOption> getSaveOption() {
            if (saveOption == null) {
                saveOption = new ArrayList<SaveOption>();
            }
            return this.saveOption;
        }

    }

}
