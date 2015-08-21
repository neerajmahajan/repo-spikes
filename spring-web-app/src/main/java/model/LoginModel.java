package model;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import sun.misc.BASE64Encoder;
import vo.Area;

public class LoginModel {

//	private HibernateTemplate 
	
	public Customer validate(String uname, String password) {
		
		//  try {
		String url = "http://localhost:8081/rest-server-dao/rest/pin/login/102";

		//url = url + uname;
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
		
		System.out.println(resp.getClass()+"777777777777777777");
		String list = resp.getEntity(String.class);
		System.out.println("response: "+ list);

//		if(uname.equals(pass)) {
//			return "admin";
//		}
//		if(uname.equals("vishal")) {
//			return "vishal";
//		}
		return new Customer();
	}
	
}
