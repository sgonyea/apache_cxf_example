
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}Result">
 *       &lt;sequence>
 *         &lt;element name="Object" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject"/>
 *         &lt;element name="UpdateResults" type="{http://exacttarget.com/wsdl/partnerAPI}UpdateResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ParentPropertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateResult", propOrder = {
    "object",
    "updateResults",
    "parentPropertyName"
})
public class UpdateResult
    extends Result
{

    @XmlElement(name = "Object", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected APIObject object;
    @XmlElement(name = "UpdateResults", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<UpdateResult> updateResults;
    @XmlElement(name = "ParentPropertyName", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String parentPropertyName;

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link APIObject }
     *     
     */
    public APIObject getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIObject }
     *     
     */
    public void setObject(APIObject value) {
        this.object = value;
    }

    /**
     * Gets the value of the updateResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateResult }
     * 
     * 
     */
    public List<UpdateResult> getUpdateResults() {
        if (updateResults == null) {
            updateResults = new ArrayList<UpdateResult>();
        }
        return this.updateResults;
    }

    /**
     * Gets the value of the parentPropertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPropertyName() {
        return parentPropertyName;
    }

    /**
     * Sets the value of the parentPropertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPropertyName(String value) {
        this.parentPropertyName = value;
    }

}
