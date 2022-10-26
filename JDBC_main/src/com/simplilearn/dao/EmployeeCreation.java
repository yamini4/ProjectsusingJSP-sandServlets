package com.simplilearn.dao;

import java.util.Scanner;

import com.simplilearn.bean.Employee;

public class EmployeeCreation {

	public Employee createEmp() {
		try (Scanner sc = new Scanner(System.in)) {
			Employee e=new Employee();
			System.out.println("enter the value of eid");
			e.setEid(sc.nextInt());
			System.out.println("enter the value of the ename");	
			e.setEname(sc.next());
			System.out.println("enter the value of email");
			e.setEmail(sc.next());
			System.out.println("enter the value of gender m/f");
			e.setGender(sc.next().charAt(0));
			return e;
		}
	}

}
