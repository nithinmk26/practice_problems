/**
 * 
 */
package com.digital.company.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author M1056182
 *
 */
@Entity
@Table(name = "employee_details",catalog = "mappings_practice")
public class Employee {
	
	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "employee_name")
	private String name;
	
	private String city;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "contact")
	private ContactDetails contact;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department",referencedColumnName = "department_id")
	private Department department;
	
	
	
	public ContactDetails getContact() {
		return contact;
	}

	public void setContact(ContactDetails contact) {
		this.contact = contact;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}
