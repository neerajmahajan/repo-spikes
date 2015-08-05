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

		HelloWorld obj = (HelloWorld) applicationContext.getBean("helloBean",
				HelloWorld.class);
		obj.printMessage();
		
		// Second way to initialise spring container 
//		DefaultListableBeanFactory bean = new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(bean);
//		reader.loadBeanDefinitions(new ClassPathResource("spring-module.xml"));
//
//		HelloWorld obj2 = (HelloWorld) bean.getBean("helloBean",
//				HelloWorld.class);
//		obj2.printMessage();

	}
}
