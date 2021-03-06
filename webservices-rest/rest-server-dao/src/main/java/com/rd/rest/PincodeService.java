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
public class PincodeService{

	@Autowired
	@Qualifier("addressDao")
	AddressDao addressDao;

	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

	@GET
	@Path("/{pin}")
	public List<Area> getAreaList(@PathParam("pin") String pin) {

		System.out.println(addressDao + "-------Dao");
		System.out.println("@@@@@@@@@@@@@Jersey say : " + pin);

		List<Area> listByPincode = addressDao.listByPincode(pin);
		System.out.println(listByPincode);
		return listByPincode;
	}
	
	@GET
	@Path("/login/{param}")
	public List<Area> getSecureAreaDetailByPincode(@PathParam("param") String msg) {
		//		String output = "Jersey say : " + msg;
		List<Area> listByPincode = addressDao.listByPincode(msg);
		System.out.println(listByPincode);
		return listByPincode;
	}

}
