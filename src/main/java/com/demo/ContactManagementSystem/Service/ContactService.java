package com.demo.ContactManagementSystem.Service;

import java.util.List;

import com.demo.ContactManagementSystem.Model.Person;

public interface ContactService {

	List<Person> findAll();
	
	Person save(Person person);
	
	 Person findById(Long id);
	 
	void delete(Long id);
	
}
