package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "share")
public class Share {
	@Id
	@Column(name = "srl")
	private int  sid;
	@Column(name = "stock")
	private String stock;
	@Column(name = "price")
	private double price;
	
	@ManyToOne
	@JoinColumn(name = "pfid")
	private Portfolio p;

	public Share() {
	}	
	
	public Share(int sid, String stock, double price) {
		this.sid = sid;
		this.stock = stock;
		this.price = price;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Portfolio getP() {
		return p;
	}

	public void setP(Portfolio p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Share [sid=" + sid + ", stock=" + stock + ", price=" + price + ", p=" + p + "]";
	}
	
	
	
}
