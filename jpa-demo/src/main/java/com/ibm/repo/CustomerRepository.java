package com.ibm.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ibm.entity.Customer;

public class CustomerRepository {
	private EntityManagerFactory factory;
	
	public CustomerRepository() {
		//it will call the persistent unit named MyJPA
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public boolean save(Customer c) {
		//for dml we have to perform transaction
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		//persistence rule that insertion will be commited in a transaction so transaction object is created
		txn.begin();
		em.persist(c);
		txn.commit();
		em.close();
		
		return true;
	}
	
	public Customer fetch(int id) {
		EntityManager em = factory.createEntityManager();
		//automatically fetches the data and creates a object and returns it
		Customer c = em.find(Customer.class, id);
		
		return c;
	}
	
	public List<Customer> list(){
		EntityManager em = factory.createEntityManager();
		Query que = em.createQuery("from Customer");//JPAQL - (select * is optional)(just specify the entity (from customer))
		//as we are in jpa we will not use sql table name but the class name
		return que.getResultList();
	}
	
	public boolean update(Customer c) {
		//for dml we have to perform transaction
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.merge(c);
		txn.commit();
		em.close();
		
		return true;
	}
	
	public boolean delete(int id) {
		//for dml we have to perform transaction
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		Customer c = em.find(Customer.class, id);
		em.remove(c);
		txn.commit();
		em.close();
		
		return true;
	}
}
