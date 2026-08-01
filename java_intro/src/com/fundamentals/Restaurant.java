package com.fundamentals;
import java.util.*;
public class Restaurant {
	static String res_name="MEHFIL";
	int table_num;
	int seats;
	boolean reserved;
	static Scanner sc= new Scanner(System.in);
	void table() {
		System.out.println("********************");
		System.out.println("enter table no: ");
		table_num=Integer.parseInt(sc.nextLine());
		System.out.println("enter no of seats: ");
		seats=Integer.parseInt(sc.nextLine());
		

		
		
	}
	void reserve_table() {
		
		reserved =true;
	}
	void cancel_reserve() {
		reserved = false;
	}
	void display() {
		System.out.println("**************welcome to"+res_name+"********************");
		System.out.println(" the table no is:"+table_num);
		System.out.println("no of seats in table are :"+seats);
		System.out.println("the table is reserved :"+reserved);
		
	}
	void change_res() {
		System.out.println(" which you want to give to restaurant:");
		res_name=sc.nextLine();
		
	}
	

	public static void main(String[] args) {
		Restaurant r=new Restaurant();
		r.table();
		r.reserve_table();
		r.display();
		r.change_res();
		r.cancel_reserve();
		r.display();
		
		
		

	}

}
