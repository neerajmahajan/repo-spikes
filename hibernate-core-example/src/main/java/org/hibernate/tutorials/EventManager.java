package org.hibernate.tutorials;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.tutorials.domain.Address;
import org.hibernate.tutorials.domain.Department;
import org.hibernate.tutorials.domain.Laptop;
import org.hibernate.tutorials.domain.Person;
import org.hibernate.tutorials.domain.PersonDetails;
import org.hibernate.tutorials.util.HibernateUtil;


public class EventManager {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		
		Address ad1 = createAddress("jkt", "del");
		Address ad2 = createAddress("mall", "asr");
		
		Laptop laptop1 = createLaptop("Sony");
		Laptop laptop2 = createLaptop("Dell");
		
		PersonDetails pd1 = createPersonDetails(ad1, ad2, "jan", "aa@gmail.com");
		PersonDetails pd2 = createPersonDetails(ad2, ad1, "feb", "bb@gmail.com");
		
		Department department = createDepartment("JAVA");
		
		Person person1 = createPerson(pd1, 30, "Rahul", "Kumar", laptop1, department);
		Person person2 = createPerson(pd2, 50, "Atul", "Sharma", laptop2, department);
		
		
		Set<Person> persons = new HashSet<Person>();
		persons.add(person1);
		persons.add(person2);
		
		s.save(person1);
		s.save(person2);
		
		Department dd = (Department) s.get(Department.class, new Integer(1));
		
		tx.commit();
		s.close();
		
	}

	private static Department createDepartment(String name) {
		Department d = new Department(); 
		d.setName(name);
		return d;
	}

	private static Laptop createLaptop(String model) {
		Laptop laptop = new Laptop();
		laptop.setModel(model);
		return laptop;
	}

	private static Person createPerson(PersonDetails pd, Integer age, String firstName, String lastName, Laptop laptop, Department department) {
		Person person = new Person();
		person.setAge(age);
		person.setFirstname(firstName);
		person.setLastname(lastName);
		person.addPersonDetails(pd);
		person.setLaptop(laptop);
		person.addDepartment(department);
		return person;
	}

	private static PersonDetails createPersonDetails(Address ad1, Address ad2, String dob, String mail) {
		PersonDetails pd = new PersonDetails();
		pd.setDob(dob);
		pd.setMail(mail);
		pd.setPermanent(ad1);
		pd.setTemporary(ad2);
		return pd;
	}

	private static Address createAddress(String street, String city) {
		Address ad1 = new Address();
		ad1.setCity(city);
		ad1.setStreet(street);
		return ad1;
	}

}
