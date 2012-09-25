
package com.exacttarget.wsdl.partnerapi;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import com.exacttarget.wsdl.partnerapi.Soap;

/**
 * This class was generated by the CXF 2.0.2-incubator
 * Mon Oct 26 11:20:43 EDT 2009
 * Generated source version: 2.0.2-incubator
 * 
 */

@WebServiceClient(name = "PartnerAPI", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", wsdlLocation = "https://webservice.exacttarget.com/etframework.wsdl")
public class PartnerAPI extends Service {

    private final static URL WSDL_LOCATION;
    private final static QName SERVICE = new QName("http://exacttarget.com/wsdl/partnerAPI", "PartnerAPI");
    private final static QName Soap = new QName("http://exacttarget.com/wsdl/partnerAPI", "Soap");
    static {
        URL url = null;
        try {
            url = new URL("https://webservice.exacttarget.com/etframework.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from https://webservice.exacttarget.com/etframework.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public PartnerAPI(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PartnerAPI() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns Soap
     */
    @WebEndpoint(name = "Soap")
    public Soap getSoap() {
        return (Soap)super.getPort(Soap, Soap.class);
    }

}