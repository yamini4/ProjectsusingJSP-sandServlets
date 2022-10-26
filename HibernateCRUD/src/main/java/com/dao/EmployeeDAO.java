package com.dao;

import java.util.List;

import com.entity.Employee;

public interface EmployeeDAO {

	void saveEmployee(Employee employee);

	List<Employee> showAllEmployees();

	void updateEmployee(int id, String name, String email);

	void deleteEmployee(Employee employee);

}
