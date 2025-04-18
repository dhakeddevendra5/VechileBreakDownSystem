package com.app.Entity;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Users {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String name;
private String number;
private String email;
private String password;

@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
private List<Breakdown> breakdowns;

public Users(Long id, String name, String number, String email, String password, List<Breakdown> breakdowns) {
	super();
	this.id = id;
	this.name = name;
	this.number = number;
	this.email = email;
	this.password = password;
	this.breakdowns = breakdowns;
}

public Users(Long id, String name, String number, String email, String password) {
	super();
	this.id = id;
	this.name = name;
	this.number = number;
	this.email = email;
	this.password = password;
}

public Users() {
	super();
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public List<Breakdown> getBreakdowns() {
	return breakdowns;
}

public void setBreakdowns(List<Breakdown> breakdowns) {
	this.breakdowns = breakdowns;
}



}
