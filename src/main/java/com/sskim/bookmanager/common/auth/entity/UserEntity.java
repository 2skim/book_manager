package com.sskim.bookmanager.common.auth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_TBL")
public class UserEntity {

	@Id
	@GeneratedValue
	@Column(name = "UID")
	private Long id;

	@Column(name = "USERNAME", unique = true)
	// @Size(max = 20, min = 3, message = "{user.name.invalid}")
	private String username;

	@Column(name = "PASSWORD")
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}