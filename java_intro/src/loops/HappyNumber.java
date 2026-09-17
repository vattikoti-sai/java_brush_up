package loops;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a number ");
       int n=sc.nextInt();
       
       int rem=0;
       int sqr=0;
       
    	  while(n!=1 && n!=4) {
    		  while(n>0) {
        	   rem=n%10;
        	   n=n/10;
        	   sqr=sqr+rem*rem;
        	   
           }
           if(sqr==1) {
    		   System.out.println("happy number");
    		   break;
    		   
    		   
    	   }
    	   else {
    		   n=sqr;
    		   sqr=0;
    		   
    	   }
       
    	  }
      
	}

}
