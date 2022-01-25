/**
 * 
 */
package com.digital.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digital.movie.entity.BookData;
import com.digital.movie.entity.Product;
import com.digital.movie.repo.ProductRepository;
import com.digital.movie.repo.TheaterRepository;

/**
 * @author M1056182
 *
 */
@RestController
public class MovieController {

	@Autowired
	private ProductRepository movieRepository;
	
	@Autowired TheaterRepository theaterRepository;
	
	@PostMapping("/register")
	public ResponseEntity<Product> registerPerson(@RequestBody BookData product){
		return new ResponseEntity<>(theaterRepository.save(product),HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Product>> registerPerson(){
	
		return new ResponseEntity<>(movieRepository.findAll(),HttpStatus.CREATED);
	}
	
}
