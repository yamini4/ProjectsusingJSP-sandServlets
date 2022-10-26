package com.dao;
import java.util.List;


import com.entity.Employee;
import com.DbUtil.DbUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@SuppressWarnings("deprecation")
public class Employee_Dao implements EmployeeDAO {

	/*
	 * public static void main(String[] args) { Employee_Dao dao = new
	 * Employee_Dao(); List<Employee> l1=dao.showAllEmployees();
	 * System.out.println(l1); }
	 */
	@Override
	public void saveEmployee(Employee employee) {
		SessionFactory sf=DbUtil.getConn();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(employee);
		t.commit();
		s.close();
		DbUtil.getConn().close();

	}

	
	@Override
	public List<Employee> showAllEmployees() {
		SessionFactory sf=DbUtil.getConn();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		
		@SuppressWarnings("unchecked")
		Query<Employee> q = s.createQuery("From Employee");
		List<Employee> empList =q.list();
		t.commit();
		s.close();
		DbUtil.getConn().close();
		return empList;
	}

	@Override
	public void updateEmployee(int id, String name, String email) {

		Session session = DbUtil.getConn().openSession();
        Transaction transaction = session.beginTransaction();
        Employee empdetails = session.load(Employee.class, id);
        empdetails.setName(name);
        empdetails.setEmail(email);
        session.update(empdetails);
        transaction.commit();
        session.close();
	}

	@Override
	public void deleteEmployee(Employee employee) {
		Session session = DbUtil.getConn().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(employee);
        transaction.commit();
        session.close();

	}
}