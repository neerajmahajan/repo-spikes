package com.java6.examples.clone;


public class TestClonable {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address asr = new Address("ASR");
		Integer age = 22;
		String name = "vikas";
		DOB dob = new DOB(7, 1989);
		Person person = new Person(age, asr, name, dob);

		Person clonedPerson = person.clone();

		
		System.out.println(person == clonedPerson);			//false - comparing cloned object
		System.out.println(person.address == clonedPerson.address); 	//false - used deep cloning for address - copied actual object
		System.out.println(person.dob == clonedPerson.dob);			//true - used shallow cloning for dob - copied reference
		System.out.println(person.age == clonedPerson.age);
		System.out.println(person.name == clonedPerson.name);
		System.out.println(person);
		System.out.println(clonedPerson);
	}

}
