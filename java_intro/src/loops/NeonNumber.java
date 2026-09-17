package loops;

import java.util.Scanner;

public class NeonNumber {
	
	
	
	static void display_answer(int n) {
		int temp=n;

		n=n*n;
		int rem=0;
		int sum=0;
		
	
		
		while(n>0) {
			rem=n%10;
			n=n/10;
			sum=sum+rem;
			
		}
		if(temp==sum) {
			System.out.println("it is a neon number");
		}
		else {
			System.out.println("it is not a neon number ");
		}
		
	}

	public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("enter n number: ");
     int n=sc.nextInt();
     display_answer(n);
     
     
     
     
	}

}
