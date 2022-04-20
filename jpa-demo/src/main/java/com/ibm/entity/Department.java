package com.ibm.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dept")
public class Department {
	@Id
	@Column(name = "dept_id")
	private int deptID;
	@Column(name = "dept_name", length = 10)
	private String deptName;
	
	//to make associations of 1 - M
	@OneToMany(mappedBy = "dept", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	private List<Employee> emps;
	
	public Department() {
	}
	
	public Department(int deptID, String deptName) {
		this.deptID = deptID;
		this.deptName = deptName;
	}

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptNo) {
		this.deptID = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emp) {
		this.emps = emp;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptID + ", deptName=" + deptName + "]";
	}
	
	
}
