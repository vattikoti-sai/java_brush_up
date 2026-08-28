package constructors;

 class Vehicle {
	 
	
 String type;	
 
 public Vehicle(String type){
	 this.type=type;
 }

}
class Car extends Vehicle{
	int model;
	Double price;
	
  public Car(String type,int model,double price) {
	  
	  super(type);
	  this.model=model;
	  this.price=price;
  }
  
}
public class ElectricCar extends Car{
  String battery_capacity;
  
  
  public ElectricCar(int model,double price,String type,String battery_capacity){
	  super(type,model,price);
	  this.battery_capacity=battery_capacity;
	  
  }
  void display() {
	  System.out.println("*****************************");
	  System.out.println("model of car : "+model);
	  System.out.println("type of car : "+type);
	  System.out.println("battery_capacity  of car : "+battery_capacity);
	  System.out.println("type of car : "+type);


  }
  
  public static void main(String[] args) {
	  
	  ElectricCar ev = new ElectricCar(2026,1500000,"manual","55W");
	  ev.display();
}
 
}