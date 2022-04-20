package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.entity.Customer;
import com.ibm.repo.CustomerRepository;

public class TestCustomer {
	private static CustomerRepository repo;
	
	@BeforeAll
	public static void inint() {
		repo = new CustomerRepository();
	}
	
	@Test
	public void testSave() {
		Customer c = new Customer(101,"Polo",3000);
		assertTrue(repo.save(c));
	}
	
	@Test
	public void testFetch() {
		Customer c = repo.fetch(101);
		assertNotNull(c);
		System.out.println(c);
	}
	
	@Test
	public void testList() {
		List<Customer> customers = repo.list();
		assertFalse(customers.isEmpty());
		customers.forEach(System.out::println);
	}
	
	@Test
	public void testDelete() {
		assertTrue(repo.delete(101));
	}
}
