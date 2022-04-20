package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.entity.Portfolio;
import com.ibm.entity.Share;
import com.ibm.repo.SharePortfolioRepository;

public class TestSharePortfolio {
	private static SharePortfolioRepository repo;
	
	@BeforeAll
	public static void init() {
		repo = new SharePortfolioRepository();
	}
	
	@Test
	public void testAddPortfolio() {
		Portfolio p1 = new Portfolio();
		p1.setPid(1);
		p1.setHolder("Jack");
		
		repo.addPortfolio(p1);
		
		Portfolio p2 = new Portfolio(2,"HDFC");
		repo.addPortfolio(p2);
	}
	
	@Test
	public void testAddShare() {
		Share s1 = new Share();
		s1.setSid(101);
		s1.setStock("IG");
		s1.setPrice(1000);
		
		repo.addShare(s1,1);
		
		Share s2 = new Share(105,"BG",1500);
		repo.addShare(s2, 1);
		
		Share s3 = new Share();
		s3.setSid(108);
		s3.setStock("LK");
		s3.setPrice(2300);
		
		repo.addShare(s3,2);
		
		Share s4 = new Share(109,"OG",5000);
		repo.addShare(s4, 2);
	}
	
	@Test
	public void testFindPortfolio() {
		Portfolio p = repo.findPortfolio(1);
		System.out.println(p);
		p.getSh().forEach(System.out::println);
	}
	
	@Test
	public void testFindShare() {
		Share s = repo.findShare(101);
		System.out.println(s);
	}
	
	@Test
	public void testListShare() {
		List<Share> s = repo.listShare();
		assertFalse(s.isEmpty());
		s.forEach(System.out::println);
	}
	
	@Test
	public void testListPortfolio() {
		List<Portfolio> p = repo.listPortfolio();
		assertFalse(p.isEmpty());
		p.forEach(System.out::println);
		p.forEach(x-> x.getSh().forEach(System.out::println));
	}
	
	@Test
	public void testRemoveShare() {
		
		repo.removeShare(101);
		repo.removeShare(105);
		repo.removeShare(108);
		repo.removeShare(109);
		
	}
	
	@Test
	public void testRemovePortfolio() {
		
		repo.removePortfolio(1);
		repo.removePortfolio(2);
	}
}
