package com.demo.ContactManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ContactManagementSystem.Model.Person;
import com.demo.ContactManagementSystem.Repository.ContactRepo;
@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	ContactRepo contactRepo;
	
	@Override
	public List<Person> findAll() {
		return contactRepo.findAll();
	}

	@Override
	public Person save(Person person) {
		contactRepo.save(person);
		return person;
	}

	
	  @Override public Person findById(Long id) {
	  if(contactRepo.findById(id).isPresent())
	  { return contactRepo.findById((long)
	  Integer.parseInt(String.valueOf(id))).get(); 
	  }
	  return new Person();
	}

	@Override
	public void delete(Long id) {
		Person person = findById(id);
		contactRepo.delete(person);
		System.out.println("Contact deleted successfully");
		
	}

}
