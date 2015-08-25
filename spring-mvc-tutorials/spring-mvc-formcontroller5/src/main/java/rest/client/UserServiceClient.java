package rest.client;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import pojo.Customer;

public abstract class UserServiceClient {

	Client client = Client.create();
	String url = "http://localhost:8081/rest-server-dao/rest/user";
	//			String inputUname = "raj6";
	//
	//			String input = "{\"fname\":\"vish\",\"lname\":\"mahajan\",\"password\":\"asasasas\",\"uname\":\""
	//					+ inputUname+ "\",\"userDetail\":{\"dob\":\"2015-08-22T18:54:31+05:30\"}}";

	public String callPostReqest(Customer obj, String action) throws JsonGenerationException, JsonMappingException, IOException {
		WebResource webResource = client
				.resource("http://localhost:8081/rest-server-dao/rest/user/"+action);
		String customerJson = null;
		ObjectMapper objectMapper = new ObjectMapper();
		customerJson = objectMapper.writeValueAsString(obj);

		System.out.println(obj.getCutomerDetail().getDob());
		System.out.println(customerJson);
		ClientResponse response = webResource.type("application/json")
				.post(ClientResponse.class, customerJson);
		return response.getEntity(String.class);
	}

	//			if (response.getStatus() != 201) {
	//				throw new RuntimeException("Failed : HTTP error code : "
	//						+ response.getStatus());
	//			}
	//
	//			System.out.println("Output from Server .... \n");
	//			String output = response.getEntity(String.class);
	//			System.out.println(output);
	//
	//			// Data from DB via rest service
	//			webResource = client
	//					.resource("http://localhost:8081/rest-server-dao/rest/user/uname/"
	//							+ inputUname);
	//			response = webResource.type("application/json").get(
	//					ClientResponse.class);
	//
	//			System.out.println("Output from Server .... \n");
	//			output = response.getEntity(String.class);
	//
	//			User user = new ObjectMapper().readValue(output, User.class);
	//
	//			System.out.println("User Information from Rest Service --- ");
	//			System.out.println(user.getFname());
	//			System.out.println(user.getLname());
	//			System.out.println(user.getPassword());
	//			System.out.println(user);
	//			// System.out.println(output);
	//
	//		} catch (Exception e) {
	//
	//			e.printStackTrace();
	//
	//		}
	//
	//	}

}
