package org.spring.example;

import org.spring.example.annotation.services.MessagePrintService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
	private String message;
	private MessagePrintService messagePrintService;
	
	@Autowired
	public void setMessagePrintService(MessagePrintService messagePrintService) {
		this.messagePrintService = messagePrintService;
	}
	
	public MessagePrintService getMessagePrintService() {
		return messagePrintService;
	}
	
	public void setName(String name) {
		this.message = name;
	}
	
	public void printMessage() {
		getMessagePrintService().displayMessage(message);
	}
	
}
