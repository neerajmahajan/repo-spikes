package model;

import pojo.Customer;

public class LoginModel {

	//	private HibernateTemplate 

	public String validateCustomer(Customer customer) {

		String uname = customer.getUname();
		if (uname.equals("admin")) {
			return "admin";
		} else if (uname.equals("vishal")) {
			return "vishal";
		} else {
			return null;
		}

	}

}
