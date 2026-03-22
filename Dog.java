package com.java.oops;
interface Animal{
	public void sound() ;
		
	
}
public class Dog implements Animal {
	public static void main(String [] args) {
		Dog d=new Dog();
		d.sound();
		Cat  c=new Cat();
		c.sound();
		Bird b=new Bird();
		b.sound();
	}
public void sound() {
	System.out.println("dog sound:bow-bow");
}
}
class Cat implements Animal {
	public void sound() {
		System.out.println("cat sound:meow-meow");
	}
}
class Bird implements Animal{
	public void sound() {
		System.out.println("bird sound:chrip-chrip");
	}
}