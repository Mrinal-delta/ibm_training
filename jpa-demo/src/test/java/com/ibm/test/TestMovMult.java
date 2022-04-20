package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.entity.Movie;
import com.ibm.entity.Multiplex;
import com.ibm.repo.MovieRepository;

public class TestMovMult {
	private static MovieRepository repo;
	
	@BeforeAll
	public static void init() {
		repo = new MovieRepository();
	}
	
	@Test
	public void testAddMultiplex() {
		Multiplex mp1 = new Multiplex();
		mp1.setMpexId(10);
		mp1.setName("IMax");
		repo.addMultiplex(mp1);
		
		Multiplex mp2 = new Multiplex(20,"INox");
		repo.addMultiplex(mp2);
	}
	
	@Test
	public void testAddMovie() {
		Movie m1 = new Movie();
		m1.setMovieId(1);
		m1.setTitle("Tarzan");
		repo.addMovie(m1);
		
		Movie m2 = new Movie(2,"Inception");
		repo.addMovie(m2);
	}
	
	@Test
	public void testAddMovieToMultiplex() {
//		repo.addMovieToMultiplex(1, 10);
//		repo.addMovieToMultiplex(2, 10);
		repo.addMovieToMultiplex(1, 20);
		
	}
	
	@Test
	public void testAddMultiplexToMovie() {
//		repo.addMultiplexToMovie(1, 10);
		repo.addMultiplexToMovie(2, 20);
	}
	
	@Test
	public void testFindMovie() {
		Movie m = repo.findMovie(1);
		System.out.println(m);
		System.out.println(m.getMovieId()+"  "+m.getTitle());
		m.getMultiplexes().forEach(System.out::println);
	}
	
	@Test
	public void testFindMultiplex() {
		Multiplex mp = repo.findMultiplex(10);
		System.out.println(mp);
		System.out.println(mp.getMpexId()+"  "+mp.getName());
		mp.getMovies().forEach(System.out::println);
	}
	
	@Test
	public void testFetchMovie() {
		List<Movie> mov = repo.listMovie();
		assertFalse(mov.isEmpty());
		mov.forEach(System.out::println);
	}
	
	@Test
	public void testFetchMultiplex() {
		List<Multiplex> mpex = repo.listMultiplex();
		assertFalse(mpex.isEmpty());
		mpex.forEach(System.out::println);
	}
}
