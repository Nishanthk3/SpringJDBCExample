package com.nishanth.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

		Employee employee = new Employee();
		employee.setEmployeeId(rs.getLong("EMPLOYEE_ID"));
		employee.setEmployeeFirstName(rs.getString("EMPLOYEE_FIRST_NAME"));
		employee.setEmployeeLastName(rs.getString("EMPLOYEE_LAST_NAME"));
		employee.setEmployeeAge(rs.getLong("EMPLOYEE_AGE"));
		employee.setEmployeeAddress(rs.getString("EMPLOYEE_ADDRESS"));
		employee.setActiveInd(rs.getLong("ACTIVE_IND"));
		employee.setCreateDtTm(rs.getTimestamp("CREATE_DT_TM"));
		employee.setUpdtDtTm(rs.getTimestamp("UPDT_DT_TM"));
		return employee;
	}

}
