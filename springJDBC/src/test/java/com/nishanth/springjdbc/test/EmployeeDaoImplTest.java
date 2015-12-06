package com.nishanth.springjdbc.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.nishanth.springjdbc.Employee;
import com.nishanth.springjdbc.dao.EmployeeDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-test.xml")
public class EmployeeDaoImplTest {

	@Autowired
    EmployeeDao dao;
	
	@Test
	public void daoTest()
	{
		System.out.println("DAO TEST");
		System.out.println("dao = "+dao);
		assertNotNull(dao);
	}

	@Test
	public void create() {

		System.out.println("CREATE TEST");
		Employee employee = new Employee();
		employee.setEmployeeFirstName("first110");
		employee.setEmployeeLastName("last110");
		employee.setEmployeeAge(50L);
		employee.setEmployeeAddress("address110");
		dao.create(employee);
		System.out.println(dao.findById(110L).getEmployeeFirstName());
	}
	@Test
	public void testFindById() {
		System.out.println("FIND BY ID TEST");
		Employee employee = dao.findById(100L);
		System.out.println("FirstName = "+employee.getEmployeeFirstName());
		System.out.println("Active Ind = "+employee.getActiveInd());

	}
	@Test
	public void update() {
		System.out.println("UPDATE TEST");
		Employee employee = new Employee();
		employee.setEmployeeId(109L);
		employee.setEmployeeAge(90L);
		employee.setEmployeeAddress("address110");
		dao.update(employee);
		System.out.println(dao.findById(109L).getEmployeeFirstName());
		assertEquals(dao.findById(109L).getEmployeeAge().longValue(), 90L);
	}

	public void delete() {
		System.out.println("DELETE TEST");
		Employee employee = new Employee();
		employee.setEmployeeId(106L);
		employee.setActiveInd(0L);
		dao.delete(employee);
		System.out.println(dao.findById(106L).getEmployeeFirstName());
		assertEquals(dao.findById(106L).getActiveInd().longValue(),0L);
	}

}
