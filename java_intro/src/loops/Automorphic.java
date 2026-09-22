package loops;

import java.util.Scanner;

public class Automorphic {
	
	static boolean check(int n) {
		boolean status=false;
	      int square=n*n;
	      
	     
	    	  int rem=square%10;
	    	  if(rem==n) {
	    		  status=true;
	    	  }
	      return status;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number : ");
		int n=sc.nextInt();
		
		if(check(n)) {
			System.out.println("Automorphic Number");
		}
		else {
			System.out.println("Not a Automorphic number ");
		}
   
	}

}
