package com.java.oops;
interface Vehicle{
	public void start() ;

	
}
 class Car implements Vehicle{
 public static void main(String [] args) {
			Car c=new Car();
			c.start();
			Bike b=new Bike();
			b.start();
			Truck t=new Truck();
			t.start();
		}
			
public void start() {
	System.out.println("car starts with key");
}
}
 class Bike implements Vehicle{
	public void start() {
		System.out.println("bike starts with a key or a start button");	
	}
}
class Truck implements Vehicle{
	public void start() {
		System.out.println("truck starts with key");
	}
}