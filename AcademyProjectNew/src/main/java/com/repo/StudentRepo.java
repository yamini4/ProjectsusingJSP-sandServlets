package com.repo;

import java.util.List;

import com.entity.Student;

public interface StudentRepo {
void createStudent(Student student);
	
	List<Student> showAllStudent();
	
	void updateStudent(int id, String F_name,String L_name,long phonenumber,String Adress);
	
	

	void deleteStudent(Student student);
}
