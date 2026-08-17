package com.fundamentals;

public class Methods1 {
	int Addition(int a, int b) {
		int c=a+b;
		return c;
	}
	int substarct(int a,int b) {
		int c=a-b;
		return c;
	}
	int multiplication(int a,int b) {
		int c=a*b;
		return c;
	}
	int division(int a,int b) {
		int c=a/b;
		return c;
	}
	
	

	public static void main(String[] args) {
		Methods1 m = new Methods1();
		int result1=m.Addition(5, 5);
		int result2=m.substarct(result1,2);
		int result3=m.multiplication(result2, 8);
		int result4=m.division(result3,5);
		System.out.println("addition result is:"+result1);
		System.out.println("substraction result is:"+result2);
		System.out.println("multiplication result is:"+result3);
		System.out.println("division result is:"+result4);




	}

}
