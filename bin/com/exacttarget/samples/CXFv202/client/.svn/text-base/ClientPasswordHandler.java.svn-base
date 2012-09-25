package com.exacttarget.samples.CXFv202.client;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

/**
 * WSS4J callback handler to accept user and password information from properties file via ClientTest. This class 
 * may be further modified for production usage so that this information is fetched from any external store, such 
 * as a database.
 * 
 * @author Erik Gfesser
 */
public class ClientPasswordHandler implements CallbackHandler {
    public void handle( Callback[] callbacks ) throws IOException, UnsupportedCallbackException {
        WSPasswordCallback wsPasswordCallback = (WSPasswordCallback) callbacks[0];        
        wsPasswordCallback.setPassword(ClientTest.getProperties().getProperty("password"));
    } //end method handle
} //end class ClientPasswordHandler
