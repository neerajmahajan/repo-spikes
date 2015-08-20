package com.rd.rest;

import javax.ws.rs.core.MultivaluedMap;

import com.rd.pojo.entity.User;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class RestServerDaoTest {
	
	public static void main(String[] args) {
		
	String url = "http://localhost:8081/rest-server-dao/rest/user/uname/";
	String uname = "vishal";
	url = url + uname;
//	Client restClient = Client.create();
//	WebResource webResource = restClient.resource(url);
//	ClientResponse resp = webResource.accept("application/json").get(ClientResponse.class);
//	if(resp.getStatus() != 200){
//		System.err.println("Unable to connect to the server");
//	}
//	String output = resp.getEntity(String.class);
//	System.out.println("response: "+output);
	
	User user = new User();
	user.setFname("Akhil");
	user.setId(2);
	user.setLname("Sharma");
	user.setPassword("qwqwqwq");
	user.setUname("akhil");
	
	url = "http://localhost:8081/rest-server-dao/rest/user/save";
	
	MultivaluedMap queryParams = new MultivaluedMapImpl();
    queryParams.add("user", user);
	
	Client restClient = Client.create();
	WebResource webResource = restClient.resource(url);
//	ClientResponse resp = webResource.accept("application/json").entity(user).get(ClientResponse.class);
	String resp = webResource.queryParams(queryParams).get(String.class);
//	if(resp.getStatus() != 200){
//		System.err.println("Unable to connect to the server");
//	}
//	String output = resp.getEntity(String.class);
	System.out.println("response: ");
}
	
}
