package com.rd.pojo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_detail")
public class UserDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	Date dob;
	// marshling Exception is occuring
	// @OneToOne(mappedBy="userDetail",cascade=CascadeType.ALL,
	// fetch=FetchType.LAZY)
	// User user;

	// public void setUser(User user) {
	// this.user = user;
	// }
	//
	// public User getUser() {
	// return user;
	// }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
