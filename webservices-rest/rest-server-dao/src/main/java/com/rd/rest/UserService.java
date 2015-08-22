package com.rd.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rd.dao.UserDao;
import com.rd.pojo.entity.User;


@Service
@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
public class UserService{

	@Autowired
	@Qualifier("userDao")
	UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@GET
	@Path("/uname/{uname}")
	public User getUserByUname(@PathParam("uname") String uname) {
		User user = userDao.findByUname(uname);
		System.out.println(user);
		return user;
	}

////	@Produces({ MediaType.TEXT_HTML })
//	@POST
//	@Consumes({ MediaType.APPLICATION_JSON })
//	@Path("/save")
//	public Response saveUser(User user) {
//		userDao.save(user);
//		System.out.println(user);
//		return Response.status(Response.Status.CREATED)// 201
//				.entity("A new user has been created")
//				.header("Location",
//						"http://localhost:8081/rest-server-dao/user/uname/"
//								+ user.getUname()).build();
//	}
	
	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveUser(User user) {
		userDao.save(user);
		String result = "User saved : " + user;
		return Response.status(201).entity(result).build();
	}

}
