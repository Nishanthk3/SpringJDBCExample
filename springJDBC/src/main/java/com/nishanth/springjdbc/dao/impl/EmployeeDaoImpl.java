package com.nishanth.springjdbc.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.nishanth.springjdbc.Employee;
import com.nishanth.springjdbc.EmployeeRowMapper;
import com.nishanth.springjdbc.dao.EmployeeDao;

@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

	public boolean create(Employee employee) {
		String sql = "INSERT INTO EMPLOYEE"
				+ "(EMPLOYEE_ID, EMPLOYEE_FIRST_NAME, EMPLOYEE_LAST_NAME, EMPLOYEE_AGE, EMPLOYEE_ADDRESS, ACTIVE_IND, CREATE_DT_TM, UPDT_DT_TM) VALUES"
				+ "(employee_seq.nextval,?,?,?,?,?,?,?)";
		try {
			getJdbcTemplate().update(sql,new Object[] { employee.getEmployeeFirstName(),
														employee.getEmployeeLastName(),
														employee.getEmployeeAge(),
														employee.getEmployeeAddress(),
														employee.getActiveInd(),
														employee.getCreateDtTm(),
														employee.getUpdtDtTm() });
		} catch (Exception sqlException) {
			return false;
		}
		return true;
	}
	public boolean update(Employee employee) {
		String sql = "UPDATE EMPLOYEE SET "
				+ "EMPLOYEE_AGE = ?, EMPLOYEE_ADDRESS= ?, ACTIVE_IND = ?, UPDT_DT_TM =?"
				+ "WHERE EMPLOYEE_ID = ?";
		try {
			getJdbcTemplate().update(sql,new Object[] { employee.getEmployeeAge(),
														employee.getEmployeeAddress(),
														employee.getActiveInd(),
														employee.getUpdtDtTm(),
														employee.getEmployeeId() });
		} catch (Exception sqlException) {
			return false;
		}
		return true;
	}

	public boolean delete(Employee employee) {
		String sql = "UPDATE EMPLOYEE SET ACTIVE_IND = ?, UPDT_DT_TM = ? WHERE EMPLOYEE_ID = ?";
		try {
			getJdbcTemplate().update(sql,new Object[] { employee.getActiveInd(),
														employee.getUpdtDtTm(), 
														employee.getEmployeeId() });
		} catch (Exception sqlException) {
			return false;
		}
		return true;
	}
	
	public Employee findById(Long id) {
		String sql = "SELECT * FROM EMPLOYEE WHERE EMPLOYEE_ID = ?";
		Employee employee = (Employee) getJdbcTemplate().queryForObject(sql,new Object[] { id }, new EmployeeRowMapper());
		return employee;
	}
}
