README - Apache CXF v2.0.2 Proof-of-Concept / ExactTarget Integration Framework Web Service API
===============================================================================================
@author Erik Gfesser



***Setup***
-----------
**Install Java 5 (JDK 1.5)** 

This project was tested with Update 13 of Java 5, but the latest update of Java 5 should be installed 
since every update always includes bug fixes. Note that, according to the Glassfish Metro installation 
guide, a JDK of 1.5 or later is to be used, which indicates that later versions of Java will work as well, 
although these other versions have not been tested as part of this project. Special care needs to be
given to installations of Java 6 or higher - see additional note below.

JDK 1.5 can be downloaded from: http://java.sun.com/javase/downloads/index_jdk5.jsp

While a Windows installation is assumed here, installation notes for Solaris, Linux, and Windows can
be found at: http://java.sun.com/j2se/1.5.0/install.html


**Install "Eclipse IDE for Java EE Developers" (current release is v3.3.0)**

Eclipse can be downloaded from: http://www.eclipse.org/downloads/


***Apache CXF v2.0.2 Example***
-------------------------------
The contents of the ${lib.dir} folder are as follows:

NOTE: The current release, v2.0.2, contains a number of bugs including CXF-922, "HTTP Conduit configuration 
is not loaded". See https://issues.apache.org/jira/si/jira.issueviews:issue-html/CXF-922/CXF-922.html for
a description of this bug. The example ClientTest.java class includes a programmatic workaround for this
bug, which prevents XML configuration for HTTPS transport.

As of October 10, 2007, the following is the CXF release map. It is recommended that upcoming releases be
checked for a CXF-922 bug fix. Typically, XML configuration is recommended rather than programmatic 
configuration when it is available.

    Apache CXF v2.0.3 ==> October 31, 2007
    Apache CXF v2.1   ==> December 15, 2007

    Apache CXF v2.0.2 binary distribution
    -------------------------------------
        aopalliance-1.0.jar
        commons-lang-2.1.jar
        commons-logging-1.1.jar
        cxf-2.0.2-incubator.jar
        cxf-manifest-incubator.jar
        geronimo-activation_1.1_spec-1.0-M1.jar
        geronimo-annotation_1.0_spec-1.1.jar
        geronimo-javamail_1.4_spec-1.0-M1.jar
        geronimo-jms_1.1_spec-1.1.jar
        geronimo-servlet_2.5_spec-1.1-M1.jar
        geronimo-ws-metadata_2.0_spec-1.1.1.jar
        jaxb-api-2.0.jar
        jaxb-impl-2.0.5.jar
        jaxb-xjc-2.0.jar
        jaxen-1.1.jar
        jaxws-api-2.0.jar
        jdom-1.0.jar
        jettison-1.0-RC2.jar
        jetty-6.1.5.jar
        jetty-util-6.1.5.jar
        jra-1.0-alpha-4.jar
        js-1.6R5.jar
        neethi-2.0.2.jar
        saaj-api-1.3.jar
        saaj-impl-1.3.jar
        servlet-api-2.5-6.1.5.jar
        slf4j-api-1.3.1.jar
        slf4j-jdk14-1.3.1.jar
        spring-beans-2.0.4.jar
        spring-context-2.0.4.jar
        spring-core-2.0.4.jar
        spring-web-2.0.4.jar
        stax-api-1.0.1.jar
        stax-utils-20060502.jar
        velocity-1.4.jar
        velocity-dep-1.4.jar
        wsdl4j-1.6.1.jar
        wss4j-1.5.1.jar
        wstx-asl-3.2.1.jar
        xalan-2.7.0.jar
        xbean-2.2.0.jar
        xml-apis-1.3.02.jar
        xml-resolver-1.2.jar
        XmlSchema-1.2.jar
        xmlsec-1.3.0.jar

File build.xml is the Ant build script. Use the Eclipse outline view to execute targets within this file. 
Execute target "generate.client" to generate Java source code from the WSDL. Execute target "compile.client" 
to compile the Java client source code. Execute target "generate.compile.client" to execute both the 
"generate.client" and "compile.client" targets. Execute target "run.client" to run the Java client example.

File ${resources.dir}/META-INF/etframework.wsdl is the WSDL for the ExactTarget Integration Framework Web
Service API endpoint.

File cxfv202-client-test-properties.xml is used to set values for Java client source code fields 
to avoid inclusion of hard-coded values. Prior to running this example, be sure to modify all of these values
as required for your tests. Descriptions of these fields are included in the XML.

File logging.properties is used in conjunction with Java SE Logging. The logging level is set to FINE for 
messages but the granularity may be changed by modifying this file.
