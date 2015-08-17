package model;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import sun.misc.BASE64Encoder;

public class LoginModel {

//	private HibernateTemplate 
	
	public Customer validate(String uname, String password) {
		
		//  try {
		String url = "http://localhost:8181/rest-server-dao/rest/hello/";

		url = url + uname;
		String authString = password;
		String authStringEnc = new BASE64Encoder().encode(authString.getBytes());
		System.out.println("Base64 encoded auth string: " + authStringEnc);

		Client restClient = Client.create();
		WebResource webResource = restClient.resource(url);
		ClientResponse resp = webResource.accept("application/json")
				.header("Uname", uname)
				.header("Authorization", "Basic " + authStringEnc)
				.get(ClientResponse.class);
		
		if(resp.getStatus() != 200){
			System.err.println("Unable to connect to the server");
		}
		Customer customer = resp.getEntity(Customer.class);
		System.out.println("response: "+customer);

//		if(uname.equals(pass)) {
//			return "admin";
//		}
//		if(uname.equals("vishal")) {
//			return "vishal";
//		}
		return customer;
	}
	
}
