
package com.exacttarget.partner.fault;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.exacttarget.partner.fault.APIFault.Params;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.exacttarget.partner.fault package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Apifault_QNAME = new QName("urn:fault.partner.exacttarget.com", "apifault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.exacttarget.partner.fault
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link APIFault }
     * 
     */
    public APIFault createAPIFault() {
        return new APIFault();
    }

    /**
     * Create an instance of {@link Params }
     * 
     */
    public Params createAPIFaultParams() {
        return new Params();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fault.partner.exacttarget.com", name = "apifault")
    public JAXBElement<APIFault> createApifault(APIFault value) {
        return new JAXBElement<APIFault>(_Apifault_QNAME, APIFault.class, null, value);
    }

}
