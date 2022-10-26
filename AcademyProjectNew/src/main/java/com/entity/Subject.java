package com.entity;

import javax.persistence.*;

@Entity
@Table
public class Subject {

	@Id
	@GeneratedValue
	private int suid;
	private String SubName;

	public Subject(int id, String subName) {
		super();
		this.suid = id;
		SubName = subName;
	}
	public Subject( String subName) {
		super();
		SubName = subName;
	}
	public int getId() {
		return suid;
	}
	public void setId(int id) {
		this.suid = id;
	}
	public String getSubName() {
		return SubName;
	}
	public void setSubName(String subName) {
		SubName = subName;
	}
	public Subject() {
		
	}
}
