package com.jpa.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer>{
	
	public List<Person> findByFirstName(String firstName);
	
	public List<Person> findByBirthDateLessThan(LocalDate birthDate);
	
	public List<Person> findByPhoneNumberLike(String phoneNumber);
	
	@Query("select SUM(Id) FROM Person")
	public Integer getSumOfId();
	
	@Query("select COUNT(*) FROM Person")
	public Integer getCountOfPersons();
	
	@Query("select p from Person p WHERE p.lastName=:n")
	public List<Person> getPersonByLastName(@Param("n") String lastName);
	
	@Query(value = "select * from Person", nativeQuery = true)
	public List<Person> getPerson();

}
