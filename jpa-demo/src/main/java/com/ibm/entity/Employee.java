package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {
	@Id
	@Column(name = "emp_no")
	@GeneratedValue //to generate automatically
	private int empId;
	
	@Column(name = "emp_name", length = 30)
	private String empName;
	
//	@Column(name = "emp_no")//as it is not specific it will be taken by default
	private double salaray;
	
	//to make association of M - 1
	@ManyToOne
	@JoinColumn(name = "dept_id" ) // Foreign key to dept's primary key dept_id
	private Department dept;
	
	public Employee() {
	}
	
	public Employee(String empName, double salaray) {
		this.empName = empName;
		this.salaray = salaray;
	}

	public int getEmpID() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalaray() {
		return salaray;
	}

	public void setSalaray(double salaray) {
		this.salaray = salaray;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empId + ", empName=" + empName + ", salaray=" + salaray + ", dept=" + dept + "]";
	}
	
	
}
