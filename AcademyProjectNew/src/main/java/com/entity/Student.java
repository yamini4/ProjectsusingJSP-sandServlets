package com.entity;


import javax.persistence.*;

@Entity
@Table
public class Student {

	@Id
	@GeneratedValue
	private int stid;
	private String FirstName;
	private String LastNAme;
	private long PhoneNumber;
	private String Address;
	
	public Student(String firstName, String lastNAme, long phoneNumber, String address, Class1 classes) {
		super();
		FirstName = firstName;
		LastNAme = lastNAme;
		PhoneNumber = phoneNumber;
		Address = address;
		this.classes = classes;
	}
	public Student(String firstName, String lastNAme, long phoneNumber, String address) {
		super();
		FirstName = firstName;
		LastNAme = lastNAme;
		PhoneNumber = phoneNumber;
		Address = address;
	}
	public Student(int id, String firstName, String lastNAme, long PhoneNumber, String address) {
		super();
		this.stid = id;
		FirstName = firstName;
		LastNAme = lastNAme;
		Address = address;
		this.PhoneNumber=PhoneNumber;
	}
    public Student() {
    	
    }
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="cid")
    private Class1 classes;
    
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastNAme() {
		return LastNAme;
	}
	public void setLastNAme(String lastNAme) {
		LastNAme = lastNAme;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	@Override
	public String toString() {
		return "Student [stid=" + stid + ", FirstName=" + FirstName + ", LastNAme=" + LastNAme + ", PhoneNumber="
				+ PhoneNumber + ", Address=" + Address + ", classes=" + classes + "]";
	}
	public void setPhoneNumber(long pnumber) {
		PhoneNumber = pnumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Class1 getClasses() {
		return classes;
	}
	public void setClasses(Class1 class1) {
		this.classes = class1;
	}

	
	
}
