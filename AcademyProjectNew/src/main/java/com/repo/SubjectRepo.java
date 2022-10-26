package com.repo;

import java.util.List;

import com.entity.Subject;

public interface SubjectRepo {
void createSubject(Subject subject);
	
	List<Subject> showAllSubject();
	
	void updateSubject(int id, String SubName);
	
	void deleteSubject(Subject subject);
}
