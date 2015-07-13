package com.java6.examples.jax_ws.style.document;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)  
public interface GreetingService {

	@WebMethod
	String sayHello(String name);
}
