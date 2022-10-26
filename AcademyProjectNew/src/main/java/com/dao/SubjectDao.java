package com.dao;

import java.util.List;

import com.entity.Subject;
import com.repo.SubjectRepo;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@SuppressWarnings("deprecation")
public class SubjectDao implements SubjectRepo{

	
	@Override
	public void createSubject(Subject subject) {
		SessionFactory sf=DbUtil.getConn();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(subject);
		t.commit();
		s.close();
		sf.close();
		
	}
	@Override
	public List<Subject> showAllSubject() {
		SessionFactory sf=DbUtil.getConn();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<Subject> q=s.createQuery("From Subject");
		List<Subject> subjectList =q.list();
		t.commit();
		return subjectList;
	}
	@Override
	public void updateSubject(int id, String SubName) {
		SessionFactory sf=DbUtil.getConn();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
		Subject subjectDetails =s.load(Subject.class, id);
		subjectDetails.setSubName(SubName);
		s.update(subjectDetails);
		t.commit();
		s.close();
	}
	@Override
	public void deleteSubject(Subject subject) {
		SessionFactory sf=DbUtil.getConn();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
		s.delete(subject);
		t.commit();
		s.close();
		
	}
}
