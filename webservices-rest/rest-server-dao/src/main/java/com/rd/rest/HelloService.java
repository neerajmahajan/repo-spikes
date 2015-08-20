package com.rd.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rd.dao.AddressDao;
import com.rd.pojo.entity.Area;


@Service
@Path("/pin")
@Produces(MediaType.APPLICATION_JSON)
public class HelloService{

	@Autowired
	@Qualifier("addressDao")
	AddressDao addressDao;

	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

	@GET
	@Path("/{param}")
	public List<Area> getRole(@PathParam("param") String msg) {
		//		String output = "Jersey say : " + msg;
		List<Area> listByPincode = addressDao.listByPincode(msg);
		System.out.println(listByPincode);
		return listByPincode;
	}

}
