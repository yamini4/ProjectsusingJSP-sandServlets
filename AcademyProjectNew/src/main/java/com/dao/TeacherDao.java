package com.dao;

import java.util.List;

import com.entity.Teacher;
import com.repo.TeacherRepo;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@SuppressWarnings("deprecation")
public class TeacherDao implements TeacherRepo{

	
	@Override
	public void createTeacher(Teacher teacher) {
		SessionFactory sf=DbUtil.getConn();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(teacher);
		t.commit();
		s.close();
		sf.close();
		
	}
	@Override
	public List<Teacher> showAllTeachers() {
		SessionFactory sf=DbUtil.getConn();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<Teacher> q=s.createQuery("From Teacher");
		List<Teacher> teacherList =q.list();
		t.commit();
		return teacherList;
	}
	@Override
	public void updateTeacher(int id, String F_Name, String L_Name, long PhoneNumber, String Designation, String Address) {
		SessionFactory sf=DbUtil.getConn();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
		Teacher teacherDetails = s.load(Teacher.class, id);
		teacherDetails.setFirstName(F_Name);
		teacherDetails.setLastName(L_Name);
		teacherDetails.setPhoneNumber(PhoneNumber);
		teacherDetails.setDesignation(Designation);
		teacherDetails.setAddress(Address);
		s.update(teacherDetails);
		t.commit();
		s.close();
		
	}
	@Override
	public void deleteTeacher(Teacher teacher) {
		SessionFactory sf=DbUtil.getConn();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
		s.delete(teacher);
		t.commit();
		s.close();
	}
}
