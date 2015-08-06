package org.spring.example;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring-module.xml");
		
		Producer producer = (Producer) applicationContext.getBean("producer",
				Producer.class);
		producer.sendMessage("hello");
		

		// Second way to initialise spring container 
		DefaultListableBeanFactory bean = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(bean);
		reader.loadBeanDefinitions(new ClassPathResource("spring-module.xml"));

		Consumer consumer = (Consumer) bean.getBean("consumer",
				Consumer.class);
		consumer.reiceveMessage();
	}
}
