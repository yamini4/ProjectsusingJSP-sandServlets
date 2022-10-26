package com.entity;

import javax.persistence.*;

@Entity
public class Teacher {

	@Id
	@GeneratedValue
	private int tid;
	private String FirstName;
	private String LastName;
	private long PhoneNumber;
	private String Address;
	private String Designation;
	

	public Teacher(String firstName, String lastName, long phoneNumber, String address, String designation) {
		super();
		FirstName = firstName;
		LastName = lastName;
		PhoneNumber = phoneNumber;
		Address = address;
		Designation = designation;
	}
	public Teacher(int tid, String firstName, String lastName, int PhoneNumber, String address, String designation) {
		super();
		this.tid = tid;
		FirstName = firstName;
		LastName = lastName;
		this.PhoneNumber = PhoneNumber;
		Address = address;
		Designation = designation;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public Teacher() {
		
	}
	
}
