
/*
 * JBoss, a division of Red Hat
 * Copyright 2010, Red Hat Middleware, LLC, and individual
 * contributors as indicated by the @authors tag. See the
 * copyright.txt in the distribution for a full listing of
 * individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.oasis.wsrp.v1;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "WSRP_v1_Registration_PortType", targetNamespace = "urn:oasis:names:tc:wsrp:v1:intf")
public interface WSRPV1RegistrationPortType {


    /**
     * 
     * @param registrationProperties
     * @param consumerAgent
     * @param consumerName
     * @param consumerModes
     * @param customUserProfileData
     * @param consumerUserScopes
     * @param registrationHandle
     * @param consumerWindowStates
     * @param registrationState
     * @param extensions
     * @param methodGetSupported
     * @throws V1OperationFailed
     * @throws V1MissingParameters
     */
    @WebMethod(action = "urn:oasis:names:tc:wsrp:v1:register")
    @RequestWrapper(localName = "register", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types", className = "org.oasis.wsrp.v1.V1RegistrationData")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types", className = "org.oasis.wsrp.v1.V1RegistrationContext")
    public void register(
        @WebParam(name = "consumerName", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types")
        String consumerName,
        @WebParam(name = "consumerAgent", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types")
        String consumerAgent,
        @WebParam(name = "methodGetSupported", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types")
        boolean methodGetSupported,
        @WebParam(name = "consumerModes", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types")
        List<String> consumerModes,
        @WebParam(name = "consumerWindowStates", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types")
        List<String> consumerWindowStates,
        @WebParam(name = "consumerUserScopes", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types")
        List<String> consumerUserScopes,
        @WebParam(name = "customUserProfileData", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types")
        List<String> customUserProfileData,
        @WebParam(name = "registrationProperties", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types")
        List<V1Property> registrationProperties,
        @WebParam(name = "extensions", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types", mode = WebParam.Mode.INOUT)
        Holder<List<V1Extension>> extensions,
        @WebParam(name = "registrationHandle", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types", mode = WebParam.Mode.OUT)
        Holder<String> registrationHandle,
        @WebParam(name = "registrationState", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types", mode = WebParam.Mode.OUT)
        Holder<byte[]> registrationState)
        throws V1MissingParameters, V1OperationFailed
    ;

    /**
     * 
     * @param registrationHandle
     * @param extensions
     * @param registrationState
     * @throws V1OperationFailed
     * @throws V1InvalidRegistration
     */
    @WebMethod(action = "urn:oasis:names:tc:wsrp:v1:deregister")
    @RequestWrapper(localName = "deregister", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types", className = "org.oasis.wsrp.v1.V1RegistrationContext")
    @ResponseWrapper(localName = "deregisterResponse", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types", className = "org.oasis.wsrp.v1.V1ReturnAny")
    public void deregister(
        @WebParam(name = "registrationHandle", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types")
        String registrationHandle,
        @WebParam(name = "registrationState", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types")
        byte[] registrationState,
        @WebParam(name = "extensions", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types", mode = WebParam.Mode.INOUT)
        Holder<List<V1Extension>> extensions)
        throws V1InvalidRegistration, V1OperationFailed
    ;

    /**
     * 
     * @param registrationContext
     * @param registrationData
     * @param extensions
     * @param registrationState
     * @throws V1OperationFailed
     * @throws V1InvalidRegistration
     * @throws V1MissingParameters
     */
    @WebMethod(action = "urn:oasis:names:tc:wsrp:v1:modifyRegistration")
    @RequestWrapper(localName = "modifyRegistration", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types", className = "org.oasis.wsrp.v1.V1ModifyRegistration")
    @ResponseWrapper(localName = "modifyRegistrationResponse", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types", className = "org.oasis.wsrp.v1.V1RegistrationState")
    public void modifyRegistration(
        @WebParam(name = "registrationContext", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types")
        V1RegistrationContext registrationContext,
        @WebParam(name = "registrationData", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types")
        V1RegistrationData registrationData,
        @WebParam(name = "registrationState", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types", mode = WebParam.Mode.OUT)
        Holder<byte[]> registrationState,
        @WebParam(name = "extensions", targetNamespace = "urn:oasis:names:tc:wsrp:v1:types", mode = WebParam.Mode.OUT)
        Holder<List<V1Extension>> extensions)
        throws V1InvalidRegistration, V1MissingParameters, V1OperationFailed
    ;

}
