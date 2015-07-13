package com.java6.examples.jax_ws.style.rpc;

import javax.jws.WebService;

@WebService(endpointInterface = "com.java6.examples.jax_ws.style.rpc.GreetingService")  
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String sayHello(String name) {
		return "Hello "+ name +" !!";
	}

}