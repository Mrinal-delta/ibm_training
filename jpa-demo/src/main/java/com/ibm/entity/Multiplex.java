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
@Table(name = "multiplex")
public class Multiplex {
	@Id
	@Column(name = "mpx_id")
	private int mpexId;
	@Column(length = 30)
	private String name;
	
	@ManyToMany
	@JoinTable(name = "shows",
				joinColumns = {@JoinColumn(name = "mpx_id")},
				inverseJoinColumns = {@JoinColumn(name = "movie_id")})
	private Set<Movie> movies = new HashSet<Movie>();
	
	public Multiplex() {
	}

	public Multiplex(int mpexId, String name) {
		this.mpexId = mpexId;
		this.name = name;
	}

	public int getMpexId() {
		return mpexId;
	}

	public void setMpexId(int mpexId) {
		this.mpexId = mpexId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Multiplex [mpexId=" + mpexId + ", name=" + name + "]";
	}
	
	
}
