package com.exacttarget.samples.CXFv202.client;

import java.io.FileInputStream;
import java.util.Arrays;
//import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.cxf.binding.soap.saaj.SAAJOutInterceptor;   //used with bug CXF-922 workaround
import org.apache.cxf.configuration.jsse.TLSClientParameters; //used with bug CXF-922 workaround
import org.apache.cxf.configuration.security.FiltersType;     //used with bug CXF-922 workaround
import org.apache.cxf.endpoint.Client;                        //used with bug CXF-922 workaround
import org.apache.cxf.endpoint.Endpoint;                      //used with bug CXF-922 workaround
import org.apache.cxf.frontend.ClientProxy;                   //used with bug CXF-922 workaround
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.transport.http.HTTPConduit;             //used with bug CXF-922 workaround
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;  //used with bug CXF-922 workaround

import org.apache.ws.security.handler.WSHandlerConstants;
import org.apache.ws.security.WSConstants;

import com.exacttarget.wsdl.partnerapi.APIObject;
import com.exacttarget.wsdl.partnerapi.CreateOptions;
import com.exacttarget.wsdl.partnerapi.CreateRequest;
import com.exacttarget.wsdl.partnerapi.CreateResponse;
import com.exacttarget.wsdl.partnerapi.CreateResult;
import com.exacttarget.wsdl.partnerapi.Email;
import com.exacttarget.wsdl.partnerapi.List;
import com.exacttarget.wsdl.partnerapi.Owner;
import com.exacttarget.wsdl.partnerapi.PartnerAPI;
import com.exacttarget.wsdl.partnerapi.RetrieveRequest;
import com.exacttarget.wsdl.partnerapi.RetrieveRequestMsg;
import com.exacttarget.wsdl.partnerapi.RetrieveResponseMsg;
import com.exacttarget.wsdl.partnerapi.SimpleOperators;
import com.exacttarget.wsdl.partnerapi.Soap;
import com.exacttarget.wsdl.partnerapi.Subscriber;
import com.exacttarget.wsdl.partnerapi.TriggeredSend;
import com.exacttarget.wsdl.partnerapi.TriggeredSendCreateResult;
import com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition;
import com.exacttarget.wsdl.partnerapi.SimpleFilterPart;
import com.exacttarget.wsdl.partnerapi.SentEvent;
import com.exacttarget.wsdl.partnerapi.*;

/**
 * Example to show CXF 2.0.2 usage pattern as a client to invoke services from 
 * ExactTarget Integration Framework Web Service API endpoint.
 * 
 * @author Erik Gfesser
 */
public class ClientTest {
	static String user = null;
	static String password = null;
	static String customerKey = null;
	static String validEmailAddress = null;
	static String validSubscriberKey = null;
	static String validFromAddress = null;
	static String validFromName = null;
	static String invalidEmailAddress = null;
	static String invalidSubscriberKey = null;
	static String invalidFromAddress = null;
	static String invalidFromName = null;
	
    public static void main(String[] args) {

    	//Retrieve settings from properties file
    	Properties properties = getProperties();
    	user = properties.getProperty( "user" );
    	password = properties.getProperty( "password" );
    	customerKey = properties.getProperty( "customerKey" );
    	validEmailAddress = properties.getProperty( "validEmailAddress" );
    	validSubscriberKey = properties.getProperty( "validSubscriberKey" );
    	validFromAddress = properties.getProperty( "validFromAddress" );
    	validFromName = properties.getProperty( "validFromName" );
    	invalidEmailAddress = properties.getProperty( "invalidEmailAddress" );
    	invalidSubscriberKey = properties.getProperty( "invalidSubscriberKey" );
    	invalidFromAddress = properties.getProperty( "invalidFromAddress" );
    	invalidFromName = properties.getProperty( "invalidFromName" );
    	
    	System.out.println( "user==> " + user );
    	System.out.println( "password==> " + password );
    	System.out.println( "customerKey==> " + customerKey );
    	System.out.println( "validEmailAddress==> " + validEmailAddress );
    	System.out.println( "validSubscriberKey==> " + validSubscriberKey );
    	System.out.println( "validFromAddress==> " + validFromAddress );
    	System.out.println( "validFromName==> " + validFromName );
    	System.out.println( "invalidEmailAddress==> " + invalidEmailAddress );
    	System.out.println( "invalidSubscriberKey==> " + invalidSubscriberKey );
    	System.out.println( "invalidFromAddress==> " + invalidFromAddress );
    	System.out.println( "invalidFromName==> " + invalidFromName );
    	
        //Create PartnerAPI stub.
    	PartnerAPI service = new PartnerAPI();
    	Soap stub = service.getSoap();
    	
    	//Begin programmatic workaround for bug CXF-922 associated with transport via HTTPS.
    	//CXF 2.0.2 does not load the http conduit XML configuration as designed using Spring.
    	Map<String, Object> outProperties = new HashMap<String, Object>();
    	Client client = ClientProxy.getClient( stub );
    	Endpoint endPoint = client.getEndpoint();
        WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor( outProperties );
        endPoint.getOutInterceptors().add( wssOut );
        endPoint.getOutInterceptors().add( new SAAJOutInterceptor() );
        //endPoint.getInInterceptors().add( new LoggingInInterceptor() );
        //endPoint.getOutInterceptors().add( new LoggingOutInterceptor() );
        outProperties.put( WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN );
        outProperties.put( WSHandlerConstants.USER, getProperties().getProperty("user") );
        outProperties.put( WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT );
        outProperties.put( WSHandlerConstants.PW_CALLBACK_CLASS, ClientPasswordHandler.class.getName() );
        HTTPConduit conduit = ( HTTPConduit )client.getConduit();
        TLSClientParameters tlsClientParameters = new TLSClientParameters();
        tlsClientParameters.setSecureSocketProtocol( "SSL" );
        conduit.setTlsClientParameters( tlsClientParameters );
        FiltersType filters = new FiltersType();
        //filters.getInclude().add( ".*_EXPORT_.*" );             //add all ".*_EXPORT_.*" cipher suites
        //filters.getInclude().add( ".*_EXPORT1024_.*" );         //add all ".*_EXPORT1024_.*" cipher suites
        //filters.getInclude().add( ".*_WITH_DES_.*" );           //add all ".*_WITH_DES_.*" cipher suites
        //filters.getInclude().add( ".*_WITH_NULL_.*" );          //add all ".*_WITH_NULL_.*" cipher suites
        //filters.getInclude().add( ".*_DH_anon_.*" );            //add all ".*_DH_anon_.*" cipher suites
        //filters.getInclude().add( "SSL_RSA_WITH_RC4_128_MD5" ); //add all "SSL_RSA_WITH_RC4_128_MD5" cipher suites
        filters.getInclude().add( "SSL_RSA_WITH_RC4_128_SHA" ); //add all "SSL_RSA_WITH_RC4_128_SHA" cipher suites
        tlsClientParameters.setCipherSuitesFilter( filters );   //sets filter to include added cipher suites
        //End workaround for bug CXF-922.
        
        //Three separate tests; see method notes for more information
        CreateDataExtensionObject( stub );
        EmailRetrieve(stub);
        CreateTriggeredSend(stub);
        SentEventRetrieve(stub);
        ListRetrieve(stub);

    } 
    
    /**
     * The first test retrieves list of email names and folders.
     * 
     */
    
    private static void CreateDataExtensionObject(Soap stub)  {
        CreateRequest createRequest = new CreateRequest();
        DataExtensionObject dataExtensionObject = new DataExtensionObject();
        dataExtensionObject.setCustomerKey("Bademails");

        // Column values
        APIProperty apiProperty1 = new APIProperty();
        apiProperty1.setName("Email");
        apiProperty1.setValue("testsdsdsd@test.com");

        APIProperty apiProperty2 = new APIProperty();
        apiProperty2.setName("Reason");
        apiProperty2.setValue("Not Good");

      
        ObjectExtension.Properties properties = new ObjectExtension.Properties();
        properties.getProperty().add(apiProperty1);
        properties.getProperty().add(apiProperty2);
       
        dataExtensionObject.setProperties(properties);

        createRequest.setOptions(new CreateOptions());
        java.util.List<APIObject> lAPIObjects = Arrays.asList( new APIObject[] {dataExtensionObject} );
        createRequest.getObjects().addAll( lAPIObjects);
        
        
        CreateResponse createResponse = stub.create(createRequest);
        if (createResponse != null)
              System.out.println("Response ::: " + createResponse.getOverallStatus());

  }

    
    private static void SentEventRetrieve( Soap stub ) {
    	String[] testArray = { "Client.ID", "TriggeredSendDefinitionObjectID",
				"SendID", "SubscriberKey", "EventDate", "EventType", "BatchID",
				"ListID", "PartnerKey", "SubscriberID" };
    	

		try {
			RetrieveRequest retrieveRequest = new RetrieveRequest();
			retrieveRequest.setObjectType("SentEvent");
			java.util.List<String> list = Arrays.asList( testArray );
			retrieveRequest.getProperties().addAll(list);
			SimpleFilterPart simple = new SimpleFilterPart();
			simple.setProperty("TriggeredSendDefinitionObjectID");
			simple.setSimpleOperator(SimpleOperators.EQUALS);
			
			String[] valueArray = { "bd52a488-2f5c-de11-92ee-001cc494ae9e" };
            java.util.List<String> values = Arrays.asList( valueArray );
			simple.getValue().addAll(values);

			retrieveRequest.setFilter(simple);

			RetrieveRequestMsg retrieveRequestMsg = new RetrieveRequestMsg();
            retrieveRequestMsg.setRetrieveRequest( retrieveRequest );
			RetrieveResponseMsg retrieveResponseMsg = stub
					.retrieve(retrieveRequestMsg);
			System.out.println("[overall status message] "
					+ retrieveResponseMsg.getOverallStatus());
            java.util.List <APIObject> apiObjectArray = retrieveResponseMsg.getResults();
			
			String currentStatus = "";	
			currentStatus = retrieveResponseMsg.getOverallStatus();

			boolean cont = true;
			while (cont) {
				for (APIObject dumpStepThrough : apiObjectArray) {
					if (dumpStepThrough instanceof SentEvent) {
						SentEvent result = (SentEvent) dumpStepThrough;
						System.out.println("[Output] "
								+ result.getTriggeredSendDefinitionObjectID()
								+ " " + result.getSubscriberKey());

					}
				}

				if (currentStatus.equals("MoreDataAvailable") ) {
					RetrieveRequest retrieveRequestCont = new RetrieveRequest();
					retrieveRequestCont.setContinueRequest(retrieveResponseMsg
							.getRequestID());
					RetrieveRequestMsg retrieveRequestMsgCont = new RetrieveRequestMsg();
					retrieveRequestMsgCont.setRetrieveRequest(retrieveRequestCont) ;									
					
					RetrieveResponseMsg retrieveResponseMsgCont = stub
							.retrieve(retrieveRequestMsgCont);
					System.out.println("[overall status message] "
							+ retrieveResponseMsgCont.getOverallStatus());
					apiObjectArray = retrieveResponseMsgCont.getResults();
					currentStatus = retrieveResponseMsgCont.getOverallStatus();
					
				} else {
					cont = false;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

    	
    	
    }
    private static void EmailRetrieve( Soap stub ) {
        String[] testArray = { "Name","Folder" };
        
        try{
            System.out.println( "****************** STARTING EMAIL RETRIEVAL TEST ******************" );          	
            RetrieveRequest retrieveRequest = new RetrieveRequest();
            retrieveRequest.setObjectType( "Email" );
            java.util.List<String> list = Arrays.asList( testArray );
            retrieveRequest.getProperties().addAll( list );
            RetrieveRequestMsg retrieveRequestMsg = new RetrieveRequestMsg();
            retrieveRequestMsg.setRetrieveRequest( retrieveRequest );
            RetrieveResponseMsg retrieveResponseMsg = stub.retrieve( retrieveRequestMsg );
            System.out.println( "[overall status message] " + retrieveResponseMsg.getOverallStatus() );
            java.util.List <APIObject> apiObjectArray = retrieveResponseMsg.getResults();

            for ( APIObject dumpStepThrough : apiObjectArray )
            {
                if ( dumpStepThrough instanceof Email )
                {
                    Email result = ( Email )dumpStepThrough;
                    System.out.println( "[email name]   " + result.getName() );
                    System.out.println( "[email folder] " + result.getFolder() );
                }
            }
            System.out.println( "****************** ENDING EMAIL RETRIEVAL TEST ******************" );
        } catch ( Exception e ){ 
        	e.printStackTrace();
        }
    } //end method test1      

    /**
     * The second test retrieves list of email groups.
     * 
     */
    private static void ListRetrieve( Soap stub ) {
        String[] testArray = { "ListName" };    	
    	
        try{
            System.out.println( "****************** STARTING LIST RETRIEVAL TEST ******************" );
            RetrieveRequest retrieveRequest = new RetrieveRequest();
            retrieveRequest.setObjectType( "List" );
            java.util.List<String> list = Arrays.asList( testArray );
            retrieveRequest.getProperties().addAll( list );
            RetrieveRequestMsg retrieveRequestMsg = new RetrieveRequestMsg();
            retrieveRequestMsg.setRetrieveRequest( retrieveRequest );
            RetrieveResponseMsg retrieveResponseMsg = stub.retrieve( retrieveRequestMsg );
            System.out.println( "[overall status message] " + retrieveResponseMsg.getOverallStatus() );
            java.util.List<APIObject> apiObjectList = retrieveResponseMsg.getResults();
            Object[] objectArray = apiObjectList.toArray();   //retrieveResponseMsg..getResultsArray();
            
            for ( Object dumpStepThrough : objectArray )
            {
                if ( dumpStepThrough instanceof List )
                {
                	List result = ( com.exacttarget.wsdl.partnerapi.List ) dumpStepThrough;    
                    System.out.println( "[list name] " + result.getListName());
                }
            }
            System.out.println( "****************** ENDING LIST RETRIEVAL TEST ******************" );
        } catch ( Exception e ){ 
        	e.printStackTrace(); 
        }
    }


    private static void CreateTriggeredSend( Soap stub ) {
    	Subscriber[] testArray = new Subscriber[1];
    	Owner ownerSubscriberValid = new Owner();
    	Owner ownerSubscriberInvalid = new Owner();
    	
        System.out.println( "****************** STARTING MULTIPLE SEND TEST ******************" );

        //Specify TriggeredSendDefinition and initialize the TriggeredSend
        TriggeredSendDefinition triggeredSendDefinition = new TriggeredSendDefinition();
    	triggeredSendDefinition.setCustomerKey( customerKey );
    	TriggeredSend triggeredSend = new TriggeredSend();
    	triggeredSend.setTriggeredSendDefinition(triggeredSendDefinition);
    	
    	//Create a valid Subscriber
    	Subscriber subscriberValid = new Subscriber();
    	subscriberValid.setEmailAddress( validEmailAddress );
    	subscriberValid.setSubscriberKey( validSubscriberKey );
    	ownerSubscriberValid.setFromAddress( validFromAddress );
    	ownerSubscriberValid.setFromName( validFromName );
    	subscriberValid.setOwner( ownerSubscriberValid );
    	 	
    	//Populate array of Subscribers
        testArray[0] = subscriberValid;
        java.util.List<Subscriber> list = Arrays.asList( testArray );        
        triggeredSend.getSubscribers().addAll( list );
        
    	//Send the TriggeredSend using Create call
    	try{
    	  CreateRequest createRequest = new CreateRequest();
    	  CreateOptions createOptions = new CreateOptions();
    	  createRequest.setOptions( createOptions );
          java.util.List<APIObject> listAPIObject = Arrays.asList( new APIObject[] {triggeredSend} );
          createRequest.getObjects().addAll( listAPIObject );
    	  CreateResponse createResponse = stub.create( createRequest );
    	  
    	  System.out.println( "[overall status message] " + createResponse.getOverallStatus() );
    	  java.util.List<CreateResult> listCreateResult = createResponse.getResults();
    	  CreateResult[] createResult = listCreateResult.toArray( new CreateResult[listCreateResult.size()] );
    	  
          for ( CreateResult dumpStepThrough : createResult )
          {
              System.out.println( "[create status message] " + dumpStepThrough.getStatusMessage() );
              System.out.println( "[create status code] " + dumpStepThrough.getStatusCode() );
          }    	  

      	  //Validate the send and get failure information
          TriggeredSendCreateResult triggeredSendCreateResult = ( TriggeredSendCreateResult )createResult[0];
      	  assert( triggeredSendCreateResult.getSubscriberFailures() != null );
      	  System.out.println( "[size of failures array] " + triggeredSendCreateResult.getSubscriberFailures().size() );
          System.out.println( "[email address]     " + triggeredSendCreateResult.getSubscriberFailures().get( 0 ).getSubscriber().getEmailAddress() );
          System.out.println( "[error description] " + triggeredSendCreateResult.getSubscriberFailures().get( 0 ).getErrorDescription() );
          System.out.println( "[error code]        " + triggeredSendCreateResult.getSubscriberFailures().get( 0 ).getErrorCode() );
          assert( createResult != null );
          assert( createResult[0].getStatusMessage().equals("OK") );
          System.out.println( "****************** ENDING MULTIPLE SEND TEST ******************" );   
    	} catch( Exception e ) {
    		e.printStackTrace();
    	}
    } 
    
    public static Properties getProperties() {
    	Properties properties = new Properties();
        try{
    	    FileInputStream fileInputStream = new FileInputStream( "cxfv202-client-test-properties.xml" );
    	    properties.loadFromXML( fileInputStream );
        } catch ( Exception e ){
        	e.printStackTrace();
        }
    	return properties;
    } //end method getProperties
} //end class ClientTest