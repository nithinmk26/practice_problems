/**
 * 
 */
package com.digital.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.cache.CacheType;

/**
 * @author M1056182
 *
 */
@Entity
@Table(name = "department")
public class Department {

	@Id
	private int d_id;
	private String d_name;
	private boolean d_isActive;
//	bidirectional employee id
//	@OneToOne
//	private Employee employee;
	
	
	//many employees will be thre in Dept
	@OneToMany
	@JoinColumn(name = "dept_id", referencedColumnName = "d_id")
	private List<Employee> employees;
	
	
}
