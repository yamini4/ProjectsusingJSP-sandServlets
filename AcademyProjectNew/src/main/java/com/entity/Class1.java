package com.entity;

import java.util.*;

import javax.persistence.*;

@Entity
@Table
public class Class1 {
	@Override
	public String toString() {
		return "Class1 [id=" + id + ", c_Name=" + c_Name + "]";
	}

	@Id
	@GeneratedValue
	private int id;
	private String c_Name;
	
	
	public Class1(String c_Name) {
		super();
		this.c_Name = c_Name;
	}
	public Class1(int id, String c_Name, Set<Subject> subjects, Set<Teacher> teachers) {
		super();
		this.id = id;
		this.c_Name = c_Name;
		this.subjects = subjects;
		this.teachers = teachers;
	}
	public Class1() {
	}
	public Class1(int id, String c_Name) {
		super();
		this.id = id;
		this.c_Name = c_Name;
	}
	
	
	public Class1(int id) {
		super();
		this.id = id;
	}


	public Class1(int id,Set<Subject> subjects, Set<Teacher> teachers) {
		super();
		this.subjects = subjects;
		this.teachers = teachers;
	}

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="suid")
	private Set<Subject> subjects = new HashSet<>();
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="tid")
	private Set<Teacher> teachers = new HashSet<>();
	
	
	public int getId() {
		return id;
	}
	
	public Set<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
	public Set<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getC_Name() {
		return c_Name;
	}
	public void setC_Name(String c_Name) {
		this.c_Name = c_Name;
	}
}
