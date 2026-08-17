package com.fundamentals;

public class Methods2 {
static int result;
void Addition(int a, int b) {
	result=a+b;
	System.out.println(" addition result is:"+result);
	
}
void substarct(int a,int b) {
	result=a-b;
	System.out.println(" substraction result is:"+result);

	
}
void multiplication(int a,int b) {
	result=a*b;
	System.out.println(" multiplication result is:"+result);

	
}
void division(int a,int b) {
	result=a/b;
	System.out.println(" division result is:"+result);

	
}
	public static void main(String[] args) {
		Methods2 m2=new Methods2();
	m2.Addition(10, 20);
	m2.substarct(result,10);
	m2.multiplication(result, 2);
	m2.division(result, 5);
		
	}

}
