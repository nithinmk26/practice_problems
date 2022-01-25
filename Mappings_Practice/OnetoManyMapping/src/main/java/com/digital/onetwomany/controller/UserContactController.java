/**
 * 
 */
package com.digital.onetwomany.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digital.onetwomany.entity.User;
import com.digital.onetwomany.entity.UserContact;
import com.digital.onetwomany.entity.UserRepository;

/**
 * @author M1056182
 *
 */
@RestController
public class UserContactController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserContactRepository userContactRepository;
	
	@PostMapping("/register")
	public ResponseEntity<List<UserContact>> registerPerson(@RequestBody List<UserContact> personList){
		for (UserContact iterable_element : personList) {
			userContactRepository.save(iterable_element);
		}
//		User userSaved = userRepository.save(person);
		
		
		return new ResponseEntity<>(personList,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<User>> registerPerson(){
		
		
		return new ResponseEntity<>(userRepository.findAll(),HttpStatus.CREATED);
	}

}
