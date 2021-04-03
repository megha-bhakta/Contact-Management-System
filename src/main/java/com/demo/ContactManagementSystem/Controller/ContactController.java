package com.demo.ContactManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ContactManagementSystem.Model.Person;
import com.demo.ContactManagementSystem.Service.ContactService;

@RestController
@RequestMapping("/api")
public class ContactController {
	
	@Autowired
	ContactService contactservice;
	
	@GetMapping("/contact/retrieve")
	public ResponseEntity<List<Person>> get(){
		List<Person> person = contactservice.findAll();
		return new ResponseEntity<List<Person>>(person, HttpStatus.OK);
	}
	
	@PostMapping("/contact/save")
	public ResponseEntity<Person> save(@RequestBody Person person){
		Person persons = contactservice.save(person);
		return new ResponseEntity<Person>(persons,HttpStatus.OK);
	}
	
	@PutMapping("/contact/retrieve/{id}")
	public ResponseEntity<Person> get(@PathVariable("id") Long id){
		Person persons = contactservice.findById(id);
		return new ResponseEntity<Person>(persons,HttpStatus.OK);
	}
	
	@DeleteMapping("/contact/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") Long id){
		contactservice.delete(id);
		return new ResponseEntity<String>("Contact is deleted",HttpStatus.OK);
	}
	
	
}
