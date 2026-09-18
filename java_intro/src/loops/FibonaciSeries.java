package loops;

import java.util.Scanner;

public class FibonaciSeries {
	
	static void fibonaci(int n) {
		int a=0;
		int b=1;
		int temp;
		
		for(int i=0;i<n;i++) {
			System.out.print( a + " ");
			temp=b;
			b=a+b;
			a=temp;
			
			
			
		}
		
		
	}
  
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a stopping number : ");
		int n=sc.nextInt();
		fibonaci(n);
		
		
		
   
	                                        }

}
