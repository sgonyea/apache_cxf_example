
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaveOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SaveAction" type="{http://exacttarget.com/wsdl/partnerAPI}SaveAction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveOption", propOrder = {
    "propertyName",
    "saveAction"
})
public class SaveOption {

    @XmlElement(name = "PropertyName", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected String propertyName;
    @XmlElement(name = "SaveAction", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected SaveAction saveAction;

    /**
     * Gets the value of the propertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Gets the value of the saveAction property.
     * 
     * @return
     *     possible object is
     *     {@link SaveAction }
     *     
     */
    public SaveAction getSaveAction() {
        return saveAction;
    }

    /**
     * Sets the value of the saveAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveAction }
     *     
     */
    public void setSaveAction(SaveAction value) {
        this.saveAction = value;
    }

}
