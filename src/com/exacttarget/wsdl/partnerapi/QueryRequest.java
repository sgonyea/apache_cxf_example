
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientIDs" type="{http://exacttarget.com/wsdl/partnerAPI}ClientID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Query" type="{http://exacttarget.com/wsdl/partnerAPI}Query"/>
 *         &lt;element name="RespondTo" type="{http://exacttarget.com/wsdl/partnerAPI}AsyncResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartnerProperties" type="{http://exacttarget.com/wsdl/partnerAPI}APIProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContinueRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QueryAllAccounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RetrieveAllSinceLastBatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryRequest", propOrder = {
    "clientIDs",
    "query",
    "respondTo",
    "partnerProperties",
    "continueRequest",
    "queryAllAccounts",
    "retrieveAllSinceLastBatch"
})
public class QueryRequest {

    @XmlElement(name = "ClientIDs", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<ClientID> clientIDs;
    @XmlElement(name = "Query", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected Query query;
    @XmlElement(name = "RespondTo", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<AsyncResponse> respondTo;
    @XmlElement(name = "PartnerProperties", namespace = "http://exacttarget.com/wsdl/partnerAPI", required = true)
    protected List<APIProperty> partnerProperties;
    @XmlElement(name = "ContinueRequest", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected String continueRequest;
    @XmlElement(name = "QueryAllAccounts", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean queryAllAccounts;
    @XmlElement(name = "RetrieveAllSinceLastBatch", namespace = "http://exacttarget.com/wsdl/partnerAPI")
    protected Boolean retrieveAllSinceLastBatch;

    /**
     * Gets the value of the clientIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientID }
     * 
     * 
     */
    public List<ClientID> getClientIDs() {
        if (clientIDs == null) {
            clientIDs = new ArrayList<ClientID>();
        }
        return this.clientIDs;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link Query }
     *     
     */
    public Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link Query }
     *     
     */
    public void setQuery(Query value) {
        this.query = value;
    }

    /**
     * Gets the value of the respondTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respondTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespondTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AsyncResponse }
     * 
     * 
     */
    public List<AsyncResponse> getRespondTo() {
        if (respondTo == null) {
            respondTo = new ArrayList<AsyncResponse>();
        }
        return this.respondTo;
    }

    /**
     * Gets the value of the partnerProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIProperty }
     * 
     * 
     */
    public List<APIProperty> getPartnerProperties() {
        if (partnerProperties == null) {
            partnerProperties = new ArrayList<APIProperty>();
        }
        return this.partnerProperties;
    }

    /**
     * Gets the value of the continueRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContinueRequest() {
        return continueRequest;
    }

    /**
     * Sets the value of the continueRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContinueRequest(String value) {
        this.continueRequest = value;
    }

    /**
     * Gets the value of the queryAllAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQueryAllAccounts() {
        return queryAllAccounts;
    }

    /**
     * Sets the value of the queryAllAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueryAllAccounts(Boolean value) {
        this.queryAllAccounts = value;
    }

    /**
     * Gets the value of the retrieveAllSinceLastBatch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetrieveAllSinceLastBatch() {
        return retrieveAllSinceLastBatch;
    }

    /**
     * Sets the value of the retrieveAllSinceLastBatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetrieveAllSinceLastBatch(Boolean value) {
        this.retrieveAllSinceLastBatch = value;
    }

}
