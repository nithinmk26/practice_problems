/**
 * 
 */
package com.digital.library.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author M1056182
 *
 */
@Entity
public class Library {
	
	@Id
	@Column(name = "library_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String libraryName;
	
	private String city;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "library_books", joinColumns = @JoinColumn(name = "library_id"),
//	inverseJoinColumns = @JoinColumn(name = "book_id"))
	
	@JsonIgnore
	@ManyToMany(mappedBy = "library_list", cascade =CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Book> books;
	
	

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}
