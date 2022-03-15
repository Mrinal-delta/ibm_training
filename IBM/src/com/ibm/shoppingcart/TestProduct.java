package com.ibm.shoppingcart;

public class TestProduct {

	public static void main(String[] args) {
		Product p1 = ShoppingFactory.createProduct("Cake", 125, 5);
		Product p2 = ShoppingFactory.createProduct("Bulb", 40, 5);
		Product p3 = ShoppingFactory.createProduct("Rope", 20, 5);
		
		ShoppingCart s = ShoppingFactory.newCart();
		
		System.out.println("Details of products before purchasing: ");
		p1.print();
		p2.print();
		p3.print();
		
		//shopping cart
		System.out.println("Actions of shopping cart: ");
//		s.addToCart(p1, 1);
//		s.addToCart(p2, 1);
//		s.addToCart(p3, 1);
//		s.addToCart(p2, 1);
//		s.addToCart(p1, 1);
		
		
		s.addToCart(p1, 2);
		s.addToCart(p3, 1);
//		s.addToCart(p3, 6);
		
		
//		s.addToCart(p2, 2);
//		s.addToCart(p2, 2);
//		s.addToCart(p1, 1);
		System.out.println();
		
		System.out.println("Details of products after purchasing: ");
		p1.print();
		p2.print();
		p3.print();

		s.checkout();
	}

}
