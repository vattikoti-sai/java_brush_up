package Oops;

public class Mobile extends Device{
String camera;
String battery;
void call() {
	System.out.println("make call method called ");
}
void takephoto() {
	System.out.println("take photo method called");
}

@Override
void displaydetails() {
	setBrand("Iphone");
	setPrice(10000);
	System.out.println("device brand is "+getBrand());
	System.out.println("Price is : "+getPrice());
}
}
