package com.ibm.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {
	@Id
	@Column(name = "movie_id")
	private int movieId;
	@Column(length = 30)
	private String title;
	
	@ManyToMany
	@JoinTable(name= "shows",
				joinColumns = {@JoinColumn(name = "movie_id")},
				inverseJoinColumns = {@JoinColumn(name= "mpx_id")})
	private Set<Multiplex> multiplexes = new HashSet<Multiplex>();
	
	public Movie() {
	}

	public Movie(int movieId, String title) {
		this.movieId = movieId;
		this.title = title;
	}


	public int getMovieId() {
		return movieId;
	}


	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Set<Multiplex> getMultiplexes() {
		return multiplexes;
	}


	public void setMultiplexes(Set<Multiplex> multiplexes) {
		this.multiplexes = multiplexes;
	}


	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + "]";
	}

	
}

