package service;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import pojo.Customer;
import rest.client.UserServiceClient;

public class CustomerService extends UserServiceClient {

	public void createCustomer(Customer command) {
			String response = null;
			try {
				response = callPostReqest(command, "save");
			} catch (JsonGenerationException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(response);
	}

}
