
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.exacttarget.wsdl.partnerapi.ValidationAction.ValidationOptions;


/**
 * <p>Java class for ValidationAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidationOptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ValidationOption" type="{http://exacttarget.com/wsdl/partnerAPI}APIProperty" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationAction", propOrder = {
    "validationType",
    "validationOptions"
})
public class ValidationAction {

    @XmlElement(name = "ValidationType", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String validationType;
    @XmlElement(name = "ValidationOptions", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected ValidationOptions validationOptions;

    /**
     * Gets the value of the validationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationType() {
        return validationType;
    }

    /**
     * Sets the value of the validationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationType(String value) {
        this.validationType = value;
    }

    /**
     * Gets the value of the validationOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationOptions }
     *     
     */
    public ValidationOptions getValidationOptions() {
        return validationOptions;
    }

    /**
     * Sets the value of the validationOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationOptions }
     *     
     */
    public void setValidationOptions(ValidationOptions value) {
        this.validationOptions = value;
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
     *         &lt;element name="ValidationOption" type="{http://exacttarget.com/wsdl/partnerAPI}APIProperty" maxOccurs="unbounded" minOccurs="0"/>
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
        "validationOption"
    })
    public static class ValidationOptions {

        @XmlElement(name = "ValidationOption", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
        protected List<APIProperty> validationOption;

        /**
         * Gets the value of the validationOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the validationOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValidationOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APIProperty }
         * 
         * 
         */
        public List<APIProperty> getValidationOption() {
            if (validationOption == null) {
                validationOption = new ArrayList<APIProperty>();
            }
            return this.validationOption;
        }

    }

}
