package com.fundamentals;

import java.util.Scanner;

public class PizzaDelivery {
	char size;
	double price = 0;
	int quantity;
	int delivery_distance;
	static {
		System.out.println("welcome to PIZZA Shop");
	}

	double getPizzaPrice(char size) {
		switch (size) {
		case 'S' -> price = 70;
		case 'M' -> price = 100;
		case 'L' -> price = 150;
		default -> {
			System.out.println("entered wrong input");
			break;
		}

		}
		return price;

	}

	double calucaltePizaCost(double priceofpizza, int quantity) {
		double total = 0;
		if (quantity > 0) {
			total = priceofpizza * quantity;
		} else {
			System.out.println("invalid input");
			return 0.0;
		}

		return total;

	}

	double calculateDelivery(int distance) {
		double delivery_charge = 0;
		if (distance > 0) {
			if (distance >= 0 && distance <= 10) {
				delivery_charge = 70;
			} else if (distance >= 11 && distance <= 20) {
				delivery_charge = 100;
			} else if (distance > 20) {
				delivery_charge = 150;
			}

		} else {
			System.out.println("invalid input !!!");
		}
		return delivery_charge;

	}

	double calculateFinalBill(double pizzacost, double delivery_ch) {
		double total = pizzacost + delivery_ch;
		return total;

	}

	void display(char s, double pizaprice, int quant, double cost, double charge,double bill) {
		System.out.println("PIzza size is :" + s);
		System.out.println("Pizza quantity is: " + quant);
		System.out.println("PIzza price is :" + pizaprice);
		System.out.println("PIzza cost is :" + cost);
		System.out.println("PIzza delivery charges are  :" + charge);
		
		System.out.println("your bill amount is:" + bill);

	}

	void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PIzza Size: ");
		char c = sc.next().toUpperCase().charAt(0);
		double PizzaPrice = getPizzaPrice(c);
		System.out.println("Enter PIzza quantity: ");
		quantity = sc.nextInt();
		double YourPizzaCost = calucaltePizaCost(PizzaPrice, quantity);
		System.out.println("Enter distance your distance from store : ");
		delivery_distance = sc.nextInt();
		double delivery_charge = calculateDelivery(delivery_distance);

	double total_bill= calculateFinalBill(YourPizzaCost, delivery_charge);
		display(c, PizzaPrice, quantity, YourPizzaCost, delivery_charge,total_bill);

	}

}
