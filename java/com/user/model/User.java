package com.user.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(	name = "users", 
		uniqueConstraints = { 
			@UniqueConstraint(columnNames = "email") 
		})
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private long primaryMobile;
	private long secondaryMobile;
	private String secondaryEmail; 
	private Date addDate;
	private Date registeredAt ;
	private Date lastLogin ; 							
	private byte failureCount;
	private Date lastPwdChngDt;
	private String status;

	@NotBlank
	@Size(max = 50)
	@Email
	private String email;

	@NotBlank
	@Size(max = 120)
	private String password;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(	name = "user_roles", 
				joinColumns = @JoinColumn(name = "user_id"), 
				inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	public User() {
	}

	public User( String email, String password) {
		this.email = email;
		this.password = password;
	}

	public User(String email, String password,long primaryMobile, String status) {
		this.primaryMobile = primaryMobile;
		this.status = status;
		this.email = email;
		this.password = password;
	}


}
