package com.dao;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;

import com.entity.Class1;
import com.entity.Subject;
import com.entity.Teacher;
import com.repo.ClassRepo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@SuppressWarnings("deprecation")
public class ClassDao implements ClassRepo {

	@Override
	public void createClass(Class1 classes) {
		SessionFactory sf = DbUtil.getConn();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(classes);
		t.commit();
		s.close();
		sf.close();

	}

	@Override
	public List<Class1> showAllClasses() {
		SessionFactory sf = DbUtil.getConn();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<Class1> q = s.createQuery("From Class1");
		List<Class1> classList = q.list();
		t.commit();
		s.close();
		DbUtil.getConn().close();
		return classList;
	}

	@Override
	public void updateClass(int id, String c_name) {
		SessionFactory sf = DbUtil.getConn();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Class1 classDetails = s.load(Class1.class, id);
		classDetails.setC_Name(c_name);
		s.update(classDetails);
		t.commit();
		s.close();

	}

	@Override
	public void deleteClass(Class1 classes) {
		SessionFactory sf = DbUtil.getConn();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.delete(classes);
		t.commit();
		s.close();

	}

	@Override
	public void add_Subject_Teacher(int id,String cname, Set<Subject> subject, Set<Teacher> teacher) {
		SessionFactory sf = DbUtil.getConn();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Class1 c = new Class1(id,cname,subject, teacher);
		s.saveOrUpdate(c);
		t.commit();
		s.close();
	}

	@Override
	public List<Teacher> selSub_Tea(int id) {
		SessionFactory sf = DbUtil.getConn();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		//String s1=""+id;
		@SuppressWarnings("rawtypes")
		Query q=s.createQuery("FROM Teacher inner join class1_Teacher where Teacher.tid=Class1_Teacher.teachers_tid and Teacher.tid= "
				+ ":cid");
		q.setParameter("cid",id);
		@SuppressWarnings("unchecked")
		List<Teacher> l=q.list();
		t.commit();
		return l;
	}
	
	public static void main(String[] args) {
		ClassDao d=new ClassDao();
		List<Teacher> l=new ArrayList<Teacher>();
		l=d.selSub_Tea(1);
		System.out.println(l);
	}

}
