package com.rd.pojo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "user")
@XmlRootElement(namespace = "com.rd.pojo.entity")
public class User {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String uname;
	private String fname;
	private String lname;
	private String password;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = UserDetail.class)
	@JoinColumn(name = "user_detail_id")
	private UserDetail userDetail;

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUname() {
		return uname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
