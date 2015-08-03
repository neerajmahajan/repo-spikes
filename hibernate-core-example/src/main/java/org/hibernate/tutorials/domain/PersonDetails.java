package org.hibernate.tutorials.domain;

public class PersonDetails {
	
	Integer id;
	Address permanent;			//used as Component
	Address temporary;			//used as Component
	String mail;
	String dob;
	Person person;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Address getPermanent() {
		return permanent;
	}
	public void setPermanent(Address permanent) {
		this.permanent = permanent;
	}
	public Address getTemporary() {
		return temporary;
	}
	public void setTemporary(Address temporary) {
		this.temporary = temporary;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	protected void setPerson(Person person) {
		this.person = person;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public void addPerson(Person person) {
		setPerson(person);
		getPerson().setPersonDetails(this);
	}
	
}
