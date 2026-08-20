package com.fundamentals;
import java.util.Scanner;
public class ZoomCarRentals {
  Scanner sc= new Scanner(System.in);


	String Cname(String c) {
		return c;
	}
	int no_of_days(int d) {
		return d;
	}
	int Fixed_rent() {
		
		return 1500;
	}
	int Fixed_insurance() {
		return 500;
	}
	int total_cost(int fr,int d,int fi) {
		int total=fr*d+fi;
		return total;
	}
	void take_input() {
	       System.out.println("enter company  name  :");

		String Cname=sc.nextLine();
		
	       String company_name=Cname(Cname);
	        System.out.println("welcome customer to "+company_name);

	       
	       System.out.println("enter no of days :");
	       int days=sc.nextInt();
	       sc.nextLine();

	       int NoOfDays=no_of_days(days);
	       
	       int FixedRent=Fixed_rent();
	       int FixedInsurance=Fixed_insurance();
	       int total=total_cost(FixedRent,NoOfDays,FixedInsurance);
	       
 	       System.out.println(" total amount is :"+total);

	}
	
	public static void main(String[] args) {
		ZoomCarRentals z= new ZoomCarRentals();
		ZoomCarRentals z1= new ZoomCarRentals();

       z.take_input();
       System.out.println("***************************");
       z1.take_input();
       
       
       
       
       
       
       
       
	}

}
