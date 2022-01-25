/**
 * 
 */
package com.digital.library.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author M1056182
 *
 */
@Entity
public class Book {
	
	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int bookId;
	
	private String bookName;
	
	@ManyToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST},fetch = FetchType.LAZY)
	@JoinTable(name = "library_books", joinColumns = { @JoinColumn(name = "book_id")},
	inverseJoinColumns = {@JoinColumn(name = "library_id")})
	private List<Library> library_list;
	
	

	public List<Library> getLibraries() {
		return library_list;
	}

	public void setLibraries(List<Library> libraries) {
		this.library_list = libraries;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	/**
	 * @param bookName
	 */
	public Book(String bookName) {
		super();
		this.bookName = bookName;
	}
	
	
	
	
	

}
