package com.ibm.shoppingcart;

public class Product {
	private String name;
	private double price;
	private int stock;
	
	public Product(String name, double price,int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	public int getStock() {
		return stock;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void print() {
		System.out.println("Product name: "+name);
		System.out.println("Product price: "+price);
		System.out.println("Product stock: "+stock+"\n\n");
	}
}
