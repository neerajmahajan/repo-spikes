package com.rd.rest;

import com.rd.authentication.RestAuthenticationFilter;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import sun.misc.BASE64Encoder;
 
public class PinCodeServiceTest {
 
	// service call with authentication
	public static void main(String[] args) {
		String url = "http://localhost:8081/rest-server-dao/rest/pin/login/101";
		
		String name = "admin";
		String password = "admin";
		String authStringEnc = new BASE64Encoder().encode(password.getBytes());
		System.out.println("Base64 encoded auth string: " + authStringEnc);
		
		Client restClient = Client.create();
		WebResource webResource = restClient.resource(url);
		ClientResponse resp = webResource.accept("application/json")
		                                 .header(RestAuthenticationFilter.AUTHENTICATION_HEADER, "Basic " + authStringEnc)
		                                 .header(RestAuthenticationFilter.UNAME, name)
		                                 .get(ClientResponse.class);
		if(resp.getStatus() != 200){
	    System.err.println("Unable to connect to the server");
	}
	String output = resp.getEntity(String.class);
	System.out.println("response: "+output);
	
	}
 
}
