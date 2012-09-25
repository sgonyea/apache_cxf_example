
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefinitionResponseMsg element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="DefinitionResponseMsg">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="ObjectDefinition" type="{http://exacttarget.com/wsdl/partnerAPI}ObjectDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "objectDefinition",
    "requestID"
})
@XmlRootElement(name = "DefinitionResponseMsg")
public class DefinitionResponseMsg {

    @XmlElement(name = "ObjectDefinition", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<ObjectDefinition> objectDefinition;
    @XmlElement(name = "RequestID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String requestID;

    /**
     * Gets the value of the objectDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectDefinition }
     * 
     * 
     */
    public List<ObjectDefinition> getObjectDefinition() {
        if (objectDefinition == null) {
            objectDefinition = new ArrayList<ObjectDefinition>();
        }
        return this.objectDefinition;
    }

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

}
