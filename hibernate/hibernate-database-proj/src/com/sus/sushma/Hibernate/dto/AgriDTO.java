package com.sus.sushma.Hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agri_table")
public class AgriDTO implements Serializable {
	
	@Id
	@Column(name="agri_id")
	private int agriId;
	@Column(name="agri_department")
	private String department;
	@Column(name="agri_location")
	private String location;
	@Column(name="agri_state")
	private String state;
	
	public AgriDTO() {
		System.out.println(this.getClass().getSimpleName()+" Created...");
	}
	public int getAgriId() {
		return agriId;
	}
	public void setAgriId(int agriId) {
		this.agriId = agriId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "AgriDTO [agriId=" + agriId + ", department=" + department + ", location=" + location + ", state="
				+ state + "]";
	}
	
	
		
}
