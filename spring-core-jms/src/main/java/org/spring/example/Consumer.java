package org.spring.example;


import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.jms.core.JmsTemplate;

public class Consumer {

	JmsTemplate jmsTemplate;
	Destination destination;
	
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
	
	public void reiceveMessage() {
		Message message = jmsTemplate.receive(destination);
		try {
			System.out.println("message receive - " + ((TextMessage)message).getText());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
