package com.fundamentals;
import java.util.Scanner;
public class SwappingUsingVariable {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value:  ");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b =sc.nextInt();
		int temp=b;
		 b=a;
		 a =temp;
		
		System.out.println( " a is :"+a);
		System.out.println("b is :"+b);


	}

}
