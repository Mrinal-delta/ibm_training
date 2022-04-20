package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.entity.Department;
import com.ibm.entity.Employee;
import com.ibm.repo.EmpDeptRepository;

public class TestEmpDept {
	private static EmpDeptRepository repo;
	
	@BeforeAll
	public static void init() {
		repo = new EmpDeptRepository();
	}
	
	@Test
	public void testSaveDept() {
//		Department dept = new Department();
//		dept.setDeptID(10);
//		dept.setDeptName("Sales");
		
		Department dept = new Department(20,"Finance");
		repo.addDept(dept);
	}
	
	@Test
	public void testSaveEmp() {
//		Employee emp = new Employee();
//		emp.setEmpName("Samantha");
//		emp.setSalaray(2300);
//		repo.addEmp(emp, 10);
//		Employee emp = new Employee("Mac",5000);
		Employee emp = new Employee("Darek",15000);
		repo.addEmp(emp, 20);
	}
	
	@Test
	public void testRemoveDept() {
		repo.removeDept(20);
	}
	
	@Test
	public void testFindDept() {
		Department dept = repo.findDept(10);
		System.out.println(dept);
		System.out.println(dept.getDeptName());
//		System.out.println(dept.getEmps());
		dept.getEmps().forEach(System.out::println);
	}
	
	@Test
	public void testFindEmp() {
		Employee emp = repo.findEmp(1);
		System.out.println(emp);
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalaray());
		System.out.println(emp.getDept().getDeptName());
	}
	
	@Test
	public void testList() {
		List<Employee> employees = repo.listEmp();
		assertFalse(employees.isEmpty());
		employees.forEach(System.out::println);
	}
}
