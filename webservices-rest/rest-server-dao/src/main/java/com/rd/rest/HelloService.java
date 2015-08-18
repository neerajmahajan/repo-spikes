package com.rd.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rd.pojo.Customer;
import com.rd.pojo.Role;


@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloService {

	@GET
	@Path("/{param}")
	public Customer getRole(@PathParam("param") String msg) {
		String output = "Jersey say : " + msg;

		Customer customer = new Customer();
		customer.setUname(msg);
		customer.setValid(true);
		customer.setRole(Role.ADMIN);
		return customer;
	}

}
