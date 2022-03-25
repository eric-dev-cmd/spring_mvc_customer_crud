/**
 * 
 */
package com.zing.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * @author 48 - Tran Trung Vinh - 18079461
 *
 */
@Entity
@Table(name="customer")
public class Customer {
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull(message = "First name is required")
	@Size(min=3, message = "First name must be more than 3 characters")
	@Column(name="first_name")
	private String firstName;
	
	@NotNull(message = "Last name is required")
	@Size(min=2, message = "Last name must be more than 2 characters")
	@Column(name="last_name")
	private String lastName;
	
	@NotNull(message = "Email is required")
	@Column(name="email")
	private String email;
	
	public Customer() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

}
