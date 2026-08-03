package com.fundamentals;
import java.util.*;
public class Theater {
	static Scanner sc=new Scanner(System.in);
	static String theater_name="INDRA";
	int SeatNumber;
	String Movie;
	boolean booked;
	void bookticket() {
		System.out.println("enter movie Name:");
		Movie=sc.nextLine();
		System.out.println("enter seat no :");
		SeatNumber =Integer.parseInt(sc.nextLine());
		booked=true;

		
	}
	void DisplayTicket() {
		System.out.println("your in "+theater_name+"now");
		System.out.println("the movie name is:"+Movie);
		System.out.println("your seat no is:"+SeatNumber);
		
	}
	void cancel() {
		System.out.println(" your"+this.Movie+" ticket with"+this.SeatNumber+"got canceled");

		 booked=false;
			
		 
	}
	static void change() {
		System.out.println("enter new theater name :");
		theater_name=sc.nextLine();
	}
	
	

	public static void main(String[] args) {		
		Theater t1 = new Theater();
		t1.bookticket();
		t1.DisplayTicket();
		change();
		t1.DisplayTicket();
		t1.cancel();
		
		

	}

}
