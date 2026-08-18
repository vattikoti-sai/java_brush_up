package com.fundamentals;

public class ShoppingCart {
	static String StoreName="AMAZON";
	String CustomerName;
	String ProductName;
	double price;
	int quantity;
	double actual_price;
	double total_price;
	double actual_discount;
	void AddProducts(String name,String PName,double pr,int quant) {
		CustomerName=name;
		ProductName=PName;
		price=pr;
		quantity=quant;
		
		
	}	
	void CalculateTotal(double dis) {
		actual_price=quantity*price;
	actual_discount=actual_price*(dis/100);
	total_price=actual_price-actual_discount;
		
		
	}
void DisplayCart() {
	System.out.println("****************************************");
	System.out.println(" welcome to "+StoreName+" cart");
	System.out.println("Customer Name is :"+CustomerName);
	System.out.println(" name of the products: "+ProductName);
	System.out.println("quantity : "+quantity);
	System.out.println("price :"+price);
	
	System.out.println((quantity+"*"+price)+"="+actual_price);
	System.out.println("Discount :"+actual_discount);
	System.out.println(" Price after Discount"+total_price);
}
	public static void main(String[] args) {
		
		ShoppingCart sc=new ShoppingCart();
		ShoppingCart sc1=new ShoppingCart();

		sc.AddProducts("sai", "laptop",5000,2);
		sc.CalculateTotal(2);
		sc.DisplayCart();
		
		sc1.AddProducts("shiva", "tab",1000,3);
		sc1.CalculateTotal(3);
		sc1.DisplayCart();
		
		
	}

}
