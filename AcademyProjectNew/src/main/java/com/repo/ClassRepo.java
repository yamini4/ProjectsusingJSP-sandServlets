package com.repo;

import java.util.List;
import java.util.Set;

import com.entity.Class1;
import com.entity.Subject;
import com.entity.Teacher;

public interface ClassRepo {
	
	List<Class1> showAllClasses();
	
	void createClass(Class1 classes);
	
	void updateClass(int id, String c_name);
	
	void deleteClass(Class1 classes);
	
	List<Teacher> selSub_Tea(int id);

	void add_Subject_Teacher(int id,String cname, Set<Subject> subject, Set<Teacher> teacher);
}
