package com.ibm.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ibm.entity.Movie;
import com.ibm.entity.Multiplex;

public class MovieRepository {
	private EntityManagerFactory factory;
	
	public MovieRepository() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public void addMultiplex(Multiplex m) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(m);
		txn.commit();
		em.close();
	}
	
	public void addMovie(Movie m) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(m);
		txn.commit();
		em.close();
	}
	
	public void addMovieToMultiplex(int movieId,int mpexId) {
		EntityManager em = null;
		EntityTransaction txn = null;
		
		try {
			em = factory.createEntityManager();
			txn = em.getTransaction();
			txn.begin();
			Movie mov = em.find(Movie.class, movieId);
			Multiplex mpex = em.find(Multiplex.class, mpexId);
			mov.getMultiplexes().add(mpex);
			txn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			txn.rollback();
		} finally {
			em.close();
		}
	}
	
	public void addMultiplexToMovie(int movieId,int mpexId) {
		EntityManager em = null;
		EntityTransaction txn = null;
		
		try {
			em = factory.createEntityManager();
			txn = em.getTransaction();
			txn.begin();
			Movie mov = em.find(Movie.class, movieId);
			Multiplex mpex = em.find(Multiplex.class, mpexId);
			mpex.getMovies().add(mov);
			txn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			txn.rollback();
		} finally {
			em.close();
		}
	}
	
	public Movie findMovie(int movieId) {
		EntityManager em = factory.createEntityManager();
		Movie m = em.find(Movie.class, movieId);
		return m;
	}
	
	public Multiplex findMultiplex(int mpexId) {
		EntityManager em = factory.createEntityManager();
		Multiplex mp = em.find(Multiplex.class, mpexId);
		return mp;
	}
	
	public List<Movie> listMovie() {
		EntityManager em = factory.createEntityManager();
		Query que = em.createQuery("from Movie");
		return que.getResultList();
	}

	public List<Multiplex> listMultiplex() {
		EntityManager em = factory.createEntityManager();
		Query que = em.createQuery("from Multiplex");
		return que.getResultList();
	}

}
