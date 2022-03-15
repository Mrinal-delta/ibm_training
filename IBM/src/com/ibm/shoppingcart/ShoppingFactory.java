package com.ibm.shoppingcart;

public final class ShoppingFactory {
	private ShoppingFactory() {}
	
	public static Product createProduct(String name, double price,int stock) {
		return new Product(name,price,stock);
	}
	
	public static ShoppingCart newCart() {
		return new ShoppingCart();
	}
}
