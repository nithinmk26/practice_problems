/**
 * 
 */
package com.digital.movie.entity;

import javax.persistence.Entity;

/**
 * @author M1056182
 *
 */
@Entity
public class BookData extends Product{
	
	private String genre;
	
	private String author;

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @param id
	 * @param name
	 * @param genre
	 * @param author
	 */
	public BookData(int id, String name, String genre, String author) {
		super(id, name);
		this.genre = genre;
		this.author = author;
	}

	/**
	 * 
	 */
	public BookData() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 */
	public BookData(int id, String name) {
		super(id, name);
	}
	
	
	
	
 
}
