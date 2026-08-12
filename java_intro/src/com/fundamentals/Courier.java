package com.fundamentals;

public class Courier {
	String CustomerName;
	int CourierId;
	int no_ofCourier;
	String source;
	String destination;
	double weight;
	// double price_customer;
	double DeliveryAmount;
	static int TotalCouriers;
	static double TotalWeight;
	static int TotalAmountCollected;
	static int priceperkg = 100;
	static {
		System.out.println(" WELCOME TO QUICKSHIP COURIER");
	}

	void Bookcourier() {

		DeliveryAmount = weight * priceperkg;
		TotalCouriers += no_ofCourier;
		TotalWeight += weight;
		TotalAmountCollected += DeliveryAmount;

	}

	void DisplayCourierDetails() {
		System.out.println("customer " + CustomerName + " " + "couriers");
		System.out.println("courier id :" + CourierId);
		System.out.println("customer name is :" + CustomerName);
		System.out.println(" no of couriers are :" + no_ofCourier);
		System.out.println(" source :" + source);
		System.out.println(" destination :" + destination);
		System.out.println(" weight of courier :" + weight);
		System.out.println("Delivery amount  of courier: " + DeliveryAmount);
		System.out.println("succesfully booked");

	}

	static void DisplayTodaysCollection() {
		System.out.println("*******************************");
		System.out.println(" total couries booked : " + TotalCouriers);
		System.out.println(" total weight :" + TotalWeight);
		System.out.println("total amount collected :" + TotalAmountCollected);

	}

	public static void main(String[] args) {
		Courier c = new Courier();
		Courier c1 = new Courier();

		c.CourierId = 1;
		c.CustomerName = "sai";
		c.no_ofCourier = 2;
		c.source = "hyd";
		;
		c.destination = "up";
		c.weight = 2;
		c.Bookcourier();
		c.DisplayCourierDetails();
		System.out.println("****************** customer 2******** ");

		c1.CourierId = 2;
		c1.CustomerName = "shiva";
		c1.no_ofCourier = 3;
		c1.source = "up";
		;
		c1.destination = "hyd";
		c1.weight = 3;
		c1.Bookcourier();
		c1.DisplayCourierDetails();
		DisplayTodaysCollection();

	}

}
