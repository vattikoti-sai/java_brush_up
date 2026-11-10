package Oops;

public class Laptop extends Device{
	int ram;
	String processor;
	void CunIDE() {
		System.out.println("cun id method called");
	}
	void compilecode() {
		System.out.println("code complied called");
	}
	@Override
	void displaydetails(){
		setBrand("vivo");
		setPrice(20000);
		System.out.println("device brand is "+getBrand());
		System.out.println("Price is : "+getPrice());
		
		
	}

}
