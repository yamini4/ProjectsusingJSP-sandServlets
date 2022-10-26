package com.repo;

import java.util.List;

import com.entity.Teacher;

public interface TeacherRepo {
void createTeacher(Teacher teacher);
	
	List<Teacher> showAllTeachers();
	
	void deleteTeacher(Teacher teacher);

	void updateTeacher(int id, String F_Name, String L_Name, long PhoneNumber, String Designation, String Address);
}
