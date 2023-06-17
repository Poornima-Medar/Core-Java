package com.jpa;

import java.sql.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.controller.PersonRepository;
import com.jpa.model.Person;

@SpringBootApplication
public class JpacrudApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpacrudApplication.class, args);

		PersonRepository personRepository = context.getBean(PersonRepository.class);

		// create and insert
		Person p1 = new Person();
		p1.setId(13);
		p1.setFirstName("Sakshi");
		p1.setSecondName("V");
		p1.setLastName("U");
		p1.setAddress("Gadag");
		p1.setPhoneNumber("353811323");
		p1.setBirthDate(LocalDate.of(2000, 11, 30));

		Person p2 = new Person();
		p2.setId(9);
		p2.setFirstName("Pratiksha");
		p2.setSecondName("V");
		p2.setLastName("U");
		p2.setAddress("Gadag");
		p2.setPhoneNumber("9843811323");
		p2.setBirthDate(LocalDate.of(2000, 11, 30));

		Person p3 = new Person();
		p3.setId(2);
		p3.setFirstName("Nanda");
		p3.setSecondName("R");
		p3.setLastName("N");
		p3.setAddress("Gadag");
		p3.setPhoneNumber("874433323");
		p3.setBirthDate(LocalDate.of(2000, 04, 2));

		List<Person> p = Arrays.asList(p1, p2, p3);

		// Iterable<Person> person = personRepository.saveAll(p);

		// person.forEach(u ->System.out.println(u));

		// Update
//		Optional<Person> o = personRepository.findById(9);
//		Person op = o.get();

		// op.setBirthDate(LocalDate.of(2000, 10, 28));

		// personRepository.save(op);

		// System.out.println(op);

		// delete
		// personRepository.deleteById(9);
//
//		Iterable<Person> l = personRepository.findAll();
//		
//		Iterator<Person> iterator = l.iterator();
//		
//		while(iterator.hasNext()) {
//			Person person = iterator.next();
//			System.out.println(person);
//		}

//		List<Person> list = personRepository.findByBirthDateLessThan(LocalDate.of(2000, 10, 11));
//
//		list.forEach(ll -> System.out.println(ll));

		List<Person> list = personRepository.findByPhoneNumberLike("3%");

		list.forEach(ll -> System.out.println(ll));
		
		int s = personRepository.getSumOfId();
		System.out.println(s);
		
		int c = personRepository.getCountOfPersons();
		System.out.println(c);
		
		List<Person> listof = personRepository.getPersonByLastName("U");

		listof.forEach(ll -> System.out.println(ll));
		System.out.println("_________________________________________");
		
		List<Person> llll = personRepository.getPerson();
		
		llll.forEach(e->System.out.println(e));

	}

}
