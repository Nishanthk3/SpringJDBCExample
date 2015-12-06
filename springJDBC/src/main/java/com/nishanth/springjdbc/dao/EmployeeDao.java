package com.nishanth.springjdbc.dao;

import com.nishanth.springjdbc.Employee;

public interface EmployeeDao {
	
	public boolean create(Employee employee);

	public boolean update(Employee employee);
	
	public boolean delete(Employee employee);

	public Employee findById(final Long id);
}
