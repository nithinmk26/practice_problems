/**
 * 
 */
package com.digital.library.entity;

import java.util.List;

/**
 * @author M1056182
 *
 */
public class BookDto {
	
	private int bookId;
	
	private String bookName;
	
	private List<Library> library_list;

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

	public List<Library> getLibrary_list() {
		return library_list;
	}

	public void setLibrary_list(List<Library> library_list) {
		this.library_list = library_list;
	}

	public BookDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param bookName
	 */
	public BookDto(String bookName) {
		super();
		this.bookName = bookName;
	}
	
	

}
