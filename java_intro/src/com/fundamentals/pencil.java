package com.fundamentals;

public class pencil {
int amount=100;
int no_pencils;
int pencil_cost=7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pencil p = new pencil();
		System.out.println("the initial amount is : "+p.amount);
		p.no_pencils=p.amount/p.pencil_cost;
		p.amount=p.amount%p.pencil_cost;
		System.out.println("no of pencils buyed :"+p.no_pencils);

		System.out.println("the amount available is :"+p.amount);


	}

}
