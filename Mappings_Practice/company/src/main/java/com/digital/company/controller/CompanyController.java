/**
 * 
 */
package com.digital.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digital.company.entity.Employee;
import com.digital.company.repository.EmployeeRepository;

/**
 * @author M1056182
 *
 */
@RestController
public class CompanyController {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/register")
	public ResponseEntity<Employee> registerPerson(@RequestBody Employee employee){
		
		Employee emp = employeeRepository.save(employee);
		
		return new ResponseEntity<>(emp,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> registerPerson(){
		
		return new ResponseEntity<>(employeeRepository.findAll(),HttpStatus.CREATED);
	}
	
	
	

}
