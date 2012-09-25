
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}Result">
 *       &lt;sequence>
 *         &lt;element name="NewID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NewObjectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Object" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject" minOccurs="0"/>
 *         &lt;element name="CreateResults" type="{http://exacttarget.com/wsdl/partnerAPI}CreateResult" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CreateResult", propOrder = {
    "newID",
    "newObjectID",
    "partnerKey",
    "object",
    "createResults",
    "parentPropertyName"
})
public class CreateResult
    extends Result
{

    @XmlElement(name = "NewID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected int newID;
    @XmlElement(name = "NewObjectID", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String newObjectID;
    @XmlElement(name = "PartnerKey", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String partnerKey;
    @XmlElement(name = "Object", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected APIObject object;
    @XmlElement(name = "CreateResults", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<CreateResult> createResults;
    @XmlElement(name = "ParentPropertyName", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String parentPropertyName;

    /**
     * Gets the value of the newID property.
     * 
     */
    public int getNewID() {
        return newID;
    }

    /**
     * Sets the value of the newID property.
     * 
     */
    public void setNewID(int value) {
        this.newID = value;
    }

    /**
     * Gets the value of the newObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewObjectID() {
        return newObjectID;
    }

    /**
     * Sets the value of the newObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewObjectID(String value) {
        this.newObjectID = value;
    }

    /**
     * Gets the value of the partnerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerKey() {
        return partnerKey;
    }

    /**
     * Sets the value of the partnerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerKey(String value) {
        this.partnerKey = value;
    }

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
     * Gets the value of the createResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreateResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateResult }
     * 
     * 
     */
    public List<CreateResult> getCreateResults() {
        if (createResults == null) {
            createResults = new ArrayList<CreateResult>();
        }
        return this.createResults;
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
