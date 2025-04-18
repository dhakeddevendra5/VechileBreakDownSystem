package com.app.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; 
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Breakdown {
	@Id // Use the JPA @Id annotation
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String location;
	private String vehicleType;
	private String issue;
	private String status ="Pending";

	@ManyToOne
	@JoinColumn(name="user_uid")
	private Users user;

	public Breakdown() {
		super();
	}

	public Breakdown(Long id, String location, String vehicleType, String issue, String status) {
		super();
		this.id = id;
		this.location = location;
		this.vehicleType = vehicleType;
		this.issue = issue;
		this.status = status;
	}

	public Breakdown(Long id, String location, String vehicleType, String issue, String status, Users user) {
		super();
		this.id = id;
		this.location = location;
		this.vehicleType = vehicleType;
		this.issue = issue;
		this.status = status;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

}