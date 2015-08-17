package com.rd.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import main.java.com.rd.pojo.Customer;
 
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloService {
 
	@GET
	@Path("/{param}")
	public Customer getRole(@PathParam("param") String msg) {
 		String output = "Jersey say : " + msg;

 		Customer customer = new Customer();
 		customer.setName(msg);
// 		customer.setValid(true);
// 		customer.setType("Admin");
 		return customer;
 
	}
	
}
