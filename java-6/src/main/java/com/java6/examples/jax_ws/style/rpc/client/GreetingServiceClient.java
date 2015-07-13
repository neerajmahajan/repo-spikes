package com.java6.examples.jax_ws.style.rpc.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.java6.examples.jax_ws.style.rpc.GreetingService;

public class GreetingServiceClient {

	public static void main(String[] args) throws Exception {  
		URL url = new URL("http://localhost:7779/ws/hello?wsdl");  

		//1st argument service URI, refer to wsdl document above  
		//2nd argument is service name, refer to wsdl document above  
		QName qname = new QName("http://rpc.style.jax_ws.examples.java6.com/", "GreetingServiceImplService");  
		Service service = Service.create(url, qname);  
		GreetingService hello = service.getPort(GreetingService.class);  
		System.out.println(hello.sayHello("javatpoint rpc"));  
	}  
}
