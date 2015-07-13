package com.java6.examples.jax_ws.style.rpc;

import javax.xml.ws.Endpoint;

public class Publisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7779/ws/hello",
				new GreetingServiceImpl());
	}
}
