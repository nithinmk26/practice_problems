/**
 * 
 */
package com.digital.onetwoone.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author M1056182
 *
 */
@Entity
@Table(name = "person_info", catalog = "mappings_practice")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "person_id")
	private int personId;
	
	private String personName;
	
	private String personCity;
	
	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "passport_id", referencedColumnName = "id")
//	@JoinColumn(name = "person_id", referencedColumnName = "id")
	@JoinColumn(name = "passport_id")
	private Passport passport;
 
	      

//	public Passport getPassport() {
//		return passport;
//	}
//
//	public void setPassport(Passport passport) {
//		this.passport = passport;
//	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonCity() {
		return personCity;
	}

	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}
	

	
	
}
