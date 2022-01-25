/**
 * 
 */
package com.digital.onetwoone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digital.onetwoone.entity.Passport;
import com.digital.onetwoone.entity.Person;
import com.digital.onetwoone.repository.PersonRepository;

/**
 * @author M1056182
 *
 */
@RestController
public class PersonPassportController {

	@Autowired
	private PersonRepository personRepository;
	
	@PostMapping("/register")
	public ResponseEntity<Person> registerPerson(@RequestBody Person person){
		
		
		Person personSaved = personRepository.save(person);
		return new ResponseEntity<>(personSaved,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Person>> registerPerson(){
		
		
		return new ResponseEntity<>(personRepository.findAll(),HttpStatus.CREATED);
	}
	
}
