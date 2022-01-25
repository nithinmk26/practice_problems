/**
 * 
 */
package com.digital.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.cache.CacheType;

/**
 * @author M1056182
 *
 */

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	private int id;
	private String name;
	private double salary;

	//One - one 
	
//	@OneToOne(cascade = CascadeType.ALL)
////	@JoinColumn(name = "id", referencedColumnName = "d_id")
//	private Department department;
	
//	@ManyToOne
//	private Department department;

	
	
	
}

