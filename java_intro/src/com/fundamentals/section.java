package com.fundamentals;
import java.util.Scanner;
public class section {
	String ternary(int marks) {
		String result= 
  	          (marks<=100 && marks>=91)?"S grade":
  	        	  (marks<=90 && marks>=81)?"A grade":
  	        		  (marks<=80 && marks >=71)?"B grade":
        	        		  (marks<=70 && marks >=51)?"c grade":
	        	        		  (marks<=50 && marks >=41)?"D grade":
		        	        		  (marks<=40 && marks >=35)?"E grade":
			        	        		  (marks<=0 && marks >=35)?"failed:"
			       :"invalid"  ;
		return result;
	}
	void task(int parameter) {
		if(parameter%3==0) {
			System.out.print("FIizzzz");
			if(parameter%5==0) {
				System.out.println("Buzzz");
			}
		}
		else if(parameter%5==0) {
			System.out.println("Buzzzzz");
		}
		else {
			System.out.println("not divisble");
		}
		
	}
	

	 void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter marks: ");
		        int marks=sc.nextInt();
		        System.out.println("enter integer value :");
		        int integer=sc.nextInt();
		       String result= ternary(marks);
		        System.out.println(result);
		        task(integer);
		        




		        		
		        

		     
		
	}

}
