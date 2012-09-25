
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.KeyErrors;
import com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.ValueErrors;


/**
 * <p>Java class for DataExtensionUpdateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataExtensionUpdateResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}UpdateResult">
 *       &lt;sequence>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeyErrors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="KeyError" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtensionError" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ValueErrors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ValueError" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtensionError" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataExtensionUpdateResult", propOrder = {
    "errorMessage",
    "keyErrors",
    "valueErrors"
})
public class DataExtensionUpdateResult
    extends UpdateResult
{

    @XmlElement(name = "ErrorMessage", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String errorMessage;
    @XmlElement(name = "KeyErrors", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected KeyErrors keyErrors;
    @XmlElement(name = "ValueErrors", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected ValueErrors valueErrors;

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the keyErrors property.
     * 
     * @return
     *     possible object is
     *     {@link KeyErrors }
     *     
     */
    public KeyErrors getKeyErrors() {
        return keyErrors;
    }

    /**
     * Sets the value of the keyErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyErrors }
     *     
     */
    public void setKeyErrors(KeyErrors value) {
        this.keyErrors = value;
    }

    /**
     * Gets the value of the valueErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ValueErrors }
     *     
     */
    public ValueErrors getValueErrors() {
        return valueErrors;
    }

    /**
     * Sets the value of the valueErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueErrors }
     *     
     */
    public void setValueErrors(ValueErrors value) {
        this.valueErrors = value;
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
     *         &lt;element name="KeyError" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtensionError" maxOccurs="unbounded" minOccurs="0"/>
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
        "keyError"
    })
    public static class KeyErrors {

        @XmlElement(name = "KeyError", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
        protected List<DataExtensionError> keyError;

        /**
         * Gets the value of the keyError property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the keyError property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKeyError().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DataExtensionError }
         * 
         * 
         */
        public List<DataExtensionError> getKeyError() {
            if (keyError == null) {
                keyError = new ArrayList<DataExtensionError>();
            }
            return this.keyError;
        }

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
     *         &lt;element name="ValueError" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtensionError" maxOccurs="unbounded" minOccurs="0"/>
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
        "valueError"
    })
    public static class ValueErrors {

        @XmlElement(name = "ValueError", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
        protected List<DataExtensionError> valueError;

        /**
         * Gets the value of the valueError property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the valueError property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValueError().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DataExtensionError }
         * 
         * 
         */
        public List<DataExtensionError> getValueError() {
            if (valueError == null) {
                valueError = new ArrayList<DataExtensionError>();
            }
            return this.valueError;
        }

    }

}
