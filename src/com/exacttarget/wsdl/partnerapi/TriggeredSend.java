
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggeredSend complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriggeredSend">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="TriggeredSendDefinition" type="{http://exacttarget.com/wsdl/partnerAPI}TriggeredSendDefinition"/>
 *         &lt;element name="Subscribers" type="{http://exacttarget.com/wsdl/partnerAPI}Subscriber" maxOccurs="unbounded"/>
 *         &lt;element name="Attributes" type="{http://exacttarget.com/wsdl/partnerAPI}Attribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggeredSend", propOrder = {
    "triggeredSendDefinition",
    "subscribers",
    "attributes"
})
public class TriggeredSend
    extends APIObject
{

    @XmlElement(name = "TriggeredSendDefinition", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected TriggeredSendDefinition triggeredSendDefinition;
    @XmlElement(name = "Subscribers", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<Subscriber> subscribers;
    @XmlElement(name = "Attributes", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<Attribute> attributes;

    /**
     * Gets the value of the triggeredSendDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeredSendDefinition }
     *     
     */
    public TriggeredSendDefinition getTriggeredSendDefinition() {
        return triggeredSendDefinition;
    }

    /**
     * Sets the value of the triggeredSendDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeredSendDefinition }
     *     
     */
    public void setTriggeredSendDefinition(TriggeredSendDefinition value) {
        this.triggeredSendDefinition = value;
    }

    /**
     * Gets the value of the subscribers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscribers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscribers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscriber }
     * 
     * 
     */
    public List<Subscriber> getSubscribers() {
        if (subscribers == null) {
            subscribers = new ArrayList<Subscriber>();
        }
        return this.subscribers;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute }
     * 
     * 
     */
    public List<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<Attribute>();
        }
        return this.attributes;
    }

}
