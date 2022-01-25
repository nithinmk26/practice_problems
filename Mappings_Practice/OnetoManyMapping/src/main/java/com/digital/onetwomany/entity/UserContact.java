/**
 * 
 */
package com.digital.onetwomany.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author M1056182
 *
 */
@Entity
@Table(name = "user_contact")
public class UserContact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contact_id")
	private int contactId;
	
	private Long contactNumber;
	
	@ManyToOne(cascade = CascadeType.ALL)
//	@JsonIgnore
//	@JoinColumn(name = "user_id")
	@JoinColumn(name = "user_id",referencedColumnName = "user_id")
	private User user;
	



	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	

}
