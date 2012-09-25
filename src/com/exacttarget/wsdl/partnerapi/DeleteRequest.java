
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteRequest element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="DeleteRequest">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="Options" type="{http://exacttarget.com/wsdl/partnerAPI}DeleteOptions"/>
 *           &lt;element name="Objects" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject" maxOccurs="unbounded"/>
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
    "options",
    "objects"
})
@XmlRootElement(name = "DeleteRequest")
public class DeleteRequest {

    @XmlElement(name = "Options", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected DeleteOptions options;
    @XmlElement(name = "Objects", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<APIObject> objects;

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteOptions }
     *     
     */
    public DeleteOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteOptions }
     *     
     */
    public void setOptions(DeleteOptions value) {
        this.options = value;
    }

    /**
     * Gets the value of the objects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIObject }
     * 
     * 
     */
    public List<APIObject> getObjects() {
        if (objects == null) {
            objects = new ArrayList<APIObject>();
        }
        return this.objects;
    }

}
