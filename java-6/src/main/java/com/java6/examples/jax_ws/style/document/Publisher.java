package com.java6.examples.jax_ws.style.document;

import javax.xml.ws.Endpoint;

public class Publisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7780/ws/hello",
				new GreetingServiceImpl());
	}
}
