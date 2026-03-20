package javapractice1;

public class Abstractexample {
	public static void main(String [] args) {
		Car c1=new Car();
	c1.start();
	c1.fuel();
		
	bike b=new bike();
	b.start();
	b.fuel();
	}

}
abstract class Vehicle{
	abstract void start();
	void fuel() {
		System.out.println("fuel is required");
	}
}
class Car extends Vehicle{
	void start() {
	System.out.println("car starts with keys");


		//System.out.println("fuel is required to start a car");
	}
	}
class bike extends 	Vehicle{

void start() {
	System.out.println("bike starts with start button");

}
}
