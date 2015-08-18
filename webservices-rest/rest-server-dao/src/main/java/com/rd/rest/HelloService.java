package com.rd.rest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import com.rd.dao.AddressDao;
import com.rd.pojo.entity.Area;


@Service
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloService implements ApplicationContextAware{
	
	@Autowired
	AddressDao addressDao;
	ApplicationContext applicationContext;
	
	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

	@GET
	@Path("/{param}")
	public List<Area> getRole(@PathParam("param") String msg) {
//		String output = "Jersey say : " + msg;
		
		System.out.println(addressDao);
		System.out.println(Arrays.asList(applicationContext.getBeanDefinitionNames()));
		
		
		List<Area> listByPincode = addressDao.listByPincode(msg);
		System.out.println(listByPincode);

//		Customer customer = new Customer();
//		customer.setUname(msg);
//		customer.setValid(true);
//		customer.setRole(Role.ADMIN);
//		List<Customer> customers = new ArrayList<Customer>();
//		customers.add(customer);
//		customers.add(customer);
//		customers.add(customer);
//		customers.add(customer);
		return listByPincode;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
		
	}

}
