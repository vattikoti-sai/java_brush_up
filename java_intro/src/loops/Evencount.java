package loops;

import java.util.Scanner;


public class Evencount {
	static int countOfEven(int n) {
		int count=0;
		for(; n>0;n=n/10) {
			int rem =n%10;
			if(rem%2==0) {
				count+=1;
			}
		}
		return count;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter a number ");
		int n=sc.nextInt();
//		countOfEven(n);
		System.out.println("the count of even is "+countOfEven(n));
	}

}
