package com.model;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(nullable = false, unique = true)
 private String username;

 @Column(nullable = false)
 private String password;

 @Enumerated(EnumType.STRING)
 private Role role;

 private String name;
 private String email;
 private String phone;
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
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + ", name=" + name
			+ ", email=" + email + ", phone=" + phone + "]";
}
public User(Long id, String username, String password, Role role, String name, String email, String phone) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.role = role;
	this.name = name;
	this.email = email;
	this.phone = phone;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}

 
 
}
