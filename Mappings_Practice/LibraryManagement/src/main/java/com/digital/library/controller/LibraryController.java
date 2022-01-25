/**
 * 
 */
package com.digital.library.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digital.library.entity.Book;
import com.digital.library.entity.BookDto;
import com.digital.library.entity.BookRepository;
import com.digital.library.entity.Library;
import com.digital.library.entity.LibraryRepository;

/**
 * @author M1056182
 *
 */
@RestController
public class LibraryController {

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private LibraryRepository libraryRepository;
	

	
	@PostMapping("/register")
	public ResponseEntity<Book> registerPerson(@RequestBody BookDto book){
		Book bookToBe = new Book(book.getBookName());
		
		bookToBe.setLibraries(book.getLibrary_list());
		
		for (Library iterable_element : bookToBe.getLibraries()) {
			iterable_element.setBooks(Arrays.asList(bookToBe));
		}
		
		Book bookSaved = bookRepository.save(bookToBe);
//		bookSaved.getLibraries().addAll(book.getLibraries());
//		bookSaved.setLibraries(book.getLibraries());
		return new ResponseEntity<>(bookSaved,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Book>> registerPerson(){
		
		
		return new ResponseEntity<>(bookRepository.findAll(),HttpStatus.CREATED);
	}
	
}
