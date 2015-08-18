package com.rd.pojo;

import javax.xml.bind.annotation.XmlRootElement;

import com.rd.pojo.Role;

@XmlRootElement (namespace = "main.java.com.rd.pojo")
public class Customer {

	String uname;
	boolean valid;
	Role role;
	
	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String getUname() {
		return uname;
	}
}
