package com.nishanth.springjdbc;

import java.sql.Timestamp;

public class Employee {

	private Long employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private Long employeeAge;
	private String employeeAddress;
	private Long activeInd;
	private Timestamp createDtTm;
	private Timestamp updtDtTm;
	
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	public Long getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(Long employeeAge) {
		this.employeeAge = employeeAge;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public Long getActiveInd() {
		return activeInd;
	}
	public void setActiveInd(Long activeInd) {
		this.activeInd = activeInd;
	}
	public Timestamp getCreateDtTm() {
		return createDtTm;
	}
	public void setCreateDtTm(Timestamp createDtTm) {
		this.createDtTm = createDtTm;
	}
	public Timestamp getUpdtDtTm() {
		return updtDtTm;
	}
	public void setUpdtDtTm(Timestamp updtDtTm) {
		this.updtDtTm = updtDtTm;
	}


}

