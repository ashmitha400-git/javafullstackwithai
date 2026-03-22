package com.java.oops;

public class Printerloadride {
public static void main(String[] args) {
	Printerloadride p=new Printerloadride();
	p.print();
	p.print("Suresh");
	Adavncedprinter a=new Adavncedprinter();
	a.print();
}
void print() {
	System.out.println("print the statements");
}
void print(String a) {
     
	System.out.println("print the name of the user:"+a);
	
}
}
class Adavncedprinter extends Printerloadride{
	 void print() {
		System.out.println("this is method overriding");
	}
}
