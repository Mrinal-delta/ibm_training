package com.ibm.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ibm.entity.Department;
import com.ibm.entity.Employee;

public class EmpDeptRepository {
	private EntityManagerFactory factory;
	
	public EmpDeptRepository() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public int addDept(Department d) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(d);
		txn.commit();
		em.close();
		
		return d.getDeptID();
	}
	
	public int addEmp(Employee e, int deptId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		Department d = em.find(Department.class, deptId);
		e.setDept(d);//specify to which department the employee will belong
		em.persist(e);
		txn.commit();
		em.close();
		
		return e.getEmpID();
	}

	public void removeDept(int deptId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		Department d = em.find(Department.class, deptId);
		em.remove(d);
		txn.commit();
		em.close();
		
	}
	
	public Department findDept(int deptId) {
		EntityManager em = factory.createEntityManager();
		Department d = em.find(Department.class, deptId);
		return d;
	}
	
	public Employee findEmp(int empId) {
		EntityManager em = factory.createEntityManager();
		Employee e = em.find(Employee.class, empId);
		return e;
	}
	
	public List<Employee> listEmp() {
		EntityManager em = factory.createEntityManager();
		Query que = em.createQuery("from Employee");
		
		return que.getResultList();
	}
}

