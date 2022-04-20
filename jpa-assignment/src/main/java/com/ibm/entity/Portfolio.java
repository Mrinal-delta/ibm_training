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
@Table(name = "portfolio")
public class Portfolio {
	@Id
	@Column(name = "pfid")
	private int pid;
	@Column(name = "holder",length = 15)
	private String holder;
	
	@OneToMany(mappedBy = "p",fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
	private List<Share> sh;
	
	public Portfolio() {
	}

	public Portfolio(int pid, String holder) {
		this.pid = pid;
		this.holder = holder;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public List<Share> getSh() {
		return sh;
	}

	public void setSh(List<Share> sh) {
		this.sh = sh;
	}

	@Override
	public String toString() {
		return "Portfolio [pid=" + pid + ", holder=" + holder + "]";
	}	
	
	
}
