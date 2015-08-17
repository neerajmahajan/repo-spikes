package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (namespace = "main.java.com.rd.pojo")
public class Customer {

	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
