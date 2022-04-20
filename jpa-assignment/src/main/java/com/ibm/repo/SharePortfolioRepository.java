package com.ibm.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ibm.entity.Portfolio;
import com.ibm.entity.Share;

public class SharePortfolioRepository {
	private EntityManagerFactory factory;
	
	public SharePortfolioRepository() {
		factory = Persistence.createEntityManagerFactory("JPAasg");
	}
	
	public void addPortfolio(Portfolio p) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(p);
		txn.commit();
		em.close();
	}
	
	public void addShare(Share s,int pfid) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		Portfolio p = em.find(Portfolio.class, pfid);
		s.setP(p);
		em.persist(s);
		txn.commit();
		em.close();
	}
	
	public void removeShare(int sid) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.remove(em.find(Share.class, sid));
		txn.commit();
		em.close();
	}
	
	public void removePortfolio(int pfid) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.remove(em.find(Portfolio.class, pfid));
		txn.commit();
		em.close();
	}
	
	public Portfolio findPortfolio(int pfid) {
		EntityManager em = factory.createEntityManager();
		Portfolio p = em.find(Portfolio.class, pfid);
		return p;
	}
	
	public Share findShare(int sid) {
		EntityManager em = factory.createEntityManager();
		Share s = em.find(Share.class, sid);
		return s;
	}
	
	public List<Share> listShare(){
		EntityManager em = factory.createEntityManager();
		Query que = em.createQuery("from Share");
		return que.getResultList();
	}
	
	public List<Portfolio> listPortfolio(){
		EntityManager em = factory.createEntityManager();
		Query que = em.createQuery("from Portfolio");
		return que.getResultList();
	}
}
