package service;

import pojo.Customer;
import rest.client.UserServiceClient;

public class CustomerService extends UserServiceClient {

	public void createCustomer(Customer command) {
		try {
			String response = callPostReqest(command, "save");
			System.out.println(response);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("qqqqqqqqqqqqqqq");
		}
	}

}
