package com.ibm.shoppingcart;

public class ShoppingCart {
//	private int max_items = 5;
	private Product[] cart = new Product[5];
	private int ind;
	private double total;
	
	public void addToCart(Product p,int qty) {
		if(cart[0]==null && qty<=p.getStock()) {
			if(qty>1) {
				for(int i = 0;i<qty;i++)
					cart[ind++] = p;
			}
			else
				cart[ind++] = p;
			p.setStock(p.getStock()-qty);
			total+= p.getPrice()*qty;
			System.out.println(qty +" "+p.getName()+" has been added to your cart");
		}
//		else if(cart[0]==null && qty>p.getStock())
//			System.out.println("Quantity exceeds the stock.");
//		
//		else if(cart[0]!=null && qty<=p.getStock() && ind<max_items && qty<=max_items-ind){
//			if(qty>1) {
//				for(int i = 0;i<qty;i++)
//					cart[ind++] = p;
//			}
//			else
//				cart[ind++] = p;
//			p.setStock(p.getStock()-qty);
//			total+= p.getPrice()*qty;
//			System.out.println(qty +" "+p.getName()+" has been added to your cart");
//		}
//		
//		else if(cart[0]!=null && qty<=p.getStock() && ind<max_items && qty>max_items-ind) {
//			System.out.println("Does not have enough space in shopping cart");
//		}
//		
//		else
//			System.out.println("Can't have more than "+max_items+" items in your cart");
	}

	public void checkout() {
		if(cart[0]==null)
			System.out.println("Nothing to checkout");
		else
			System.out.println("Total amount: "+total);
	}
}
