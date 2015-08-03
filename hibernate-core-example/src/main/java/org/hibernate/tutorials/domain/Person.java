package org.hibernate.tutorials.domain;

import java.util.HashSet;
import java.util.Set;


public class Person {

	private Integer id;
	private int age;
	private String firstname;
	private String lastname;
	private PersonDetails personDetails;		//bidirectional one-to-one relationship
	private Department department;  			// bidirectional many-to-one relationship
	private Laptop laptop;						//unidirectional one-to-one relationship


	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Department getDepartment() {
		return department;
	}

	protected void setDepartment(Department department) {
		this.department = department;
	}

	public void addDepartment(Department department) {
		setDepartment(department);
		Set<Person> persons = getDepartment().getPersons();
		if(persons == null){
			persons = new HashSet<Person>();
		}
		persons.add(this);
	}

	public Person() {
	}

	public int getAge() {
		return age;
	}

	public String getFirstname() {
		return firstname;
	}

	public Integer getId() {
		return id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@SuppressWarnings("unused")
	private void setId(Integer id) {
		this.id = id;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	protected void setPersonDetails(PersonDetails personDetails) {
		this.personDetails = personDetails;
	}

	public PersonDetails getPersonDetails() {
		return personDetails;
	}

	public void addPersonDetails(PersonDetails personDetails) {
		setPersonDetails(personDetails);
		getPersonDetails().setPerson(this);
	}

}