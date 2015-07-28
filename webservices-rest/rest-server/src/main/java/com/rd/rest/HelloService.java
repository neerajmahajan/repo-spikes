package com.rd.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rd.pojo.Car;
import com.rd.pojo.Enquiry;
import com.rd.pojo.Owner;
 
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloService {
 
	@GET
	@Path("/{param}")
	public Enquiry getEnquiry(@PathParam("param") String msg) {
 		String output = "Jersey say : " + msg;
 		
 		Car car1 = new Car();
 		car1.setOwner(createOwner("Arv","1","Del"));
 		car1.setBrandName("Dezire");
 		
 		Car car2 = new Car();
 		car2.setOwner(createOwner("Vishal","2","Asr"));
 		car2.setBrandName("Swift");
 		
 		ArrayList<Car> carList= new ArrayList<Car>();
 		carList.add(car1);
 		carList.add(car2);
 		
 		
 		Enquiry enquiry = new Enquiry();
 		enquiry.setEnquiryType("Rent");
 		enquiry.setOutletId("33");
 		enquiry.setCarList(carList);
 		return enquiry;
 
	}
	
	public Owner createOwner(String name, String id, String address) {
		Owner owner = new Owner();
 		owner.setName(name);
 		owner.setId(id);
 		owner.setAddress(address);
 		return owner;
	}
 
}
