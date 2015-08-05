package org.spring.example.annotation.services.impl;

import org.spring.example.annotation.services.MessagePrintService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("messagePrintService")
@Scope(value="singleton")
public class MessagePrintServiceImpl implements MessagePrintService {

	public void displayMessage(String message) {
		System.out.println("printing message unsing - MessagePrintServiceImpl " + message);
	}

}
