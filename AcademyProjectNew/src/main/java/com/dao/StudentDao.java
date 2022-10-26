package com.dao;

import java.util.List;

import com.entity.Student;
import com.repo.StudentRepo;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@SuppressWarnings("deprecation")
public class StudentDao implements StudentRepo{

	//public static SessionFactory sf=DbUtil.getConn();
	//public static Session s= sf.openSession();
	//public static Transaction t=s.beginTransaction();
	@Override
	public void createStudent(Student student) {
		SessionFactory sf=DbUtil.getConn();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(student);
		t.commit();
		s.close();
		sf.close();
	}
	@Override
	public List<Student> showAllStudent() {
		SessionFactory sf=DbUtil.getConn();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<Student> q=s.createQuery("From Student");
		List<Student> studentList =q.list();
		t.commit();
		s.close();
		DbUtil.getConn().close();
		return studentList;
	}
	@Override
	public void updateStudent(int id, String F_name, String L_name, long pnumber, String Address) {
		SessionFactory sf=DbUtil.getConn();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		Student studentDetails = s.load(Student.class, id);
		studentDetails.setFirstName(F_name);
		studentDetails.setFirstName(L_name);
		studentDetails.setPhoneNumber(pnumber);;
		studentDetails.setAddress(Address);
		s.update(studentDetails);
		t.commit();
		s.close();
		
	}
	@Override
	public void deleteStudent(Student student) {
		SessionFactory sf=DbUtil.getConn();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		s.delete(student);
		t.commit();
		s.close();
		
	}
	
	
	public List<Student> studentForClass(int id){
		SessionFactory sf=DbUtil.getConn();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		@SuppressWarnings("rawtypes")
		Query q=s.createQuery("from Student where cid="+id);
		@SuppressWarnings("unchecked")
		List<Student> s1=q.list();
		t.commit();
		s.close();
		return s1;
	}
}
