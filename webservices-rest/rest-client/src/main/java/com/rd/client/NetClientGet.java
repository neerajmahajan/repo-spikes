package com.rd.client;

import sun.misc.BASE64Encoder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
 
public class NetClientGet {
 
	public static void main(String[] args) {
 
	//  try {
		String url = "http://localhost:8080/rest-server/rest/hello/kam";
		
		String name = "admin";
		String password = "admin";
		String authString = name + ":" + password;
		String authStringEnc = new BASE64Encoder().encode(authString.getBytes());
		System.out.println("Base64 encoded auth string: " + authStringEnc);
		
		Client restClient = Client.create();
		WebResource webResource = restClient.resource(url);
		ClientResponse resp = webResource.accept("application/json")
		                                 .header("Authorization", "Basic " + authStringEnc)
		                                 .get(ClientResponse.class);
		if(resp.getStatus() != 200){
	    System.err.println("Unable to connect to the server");
	}
	String output = resp.getEntity(String.class);
	System.out.println("response: "+output);
	
	}
 
}
