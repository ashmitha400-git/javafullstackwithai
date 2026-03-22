package com.java.oops;

public class Bankoverride {
public void getIntrestRate() {
	System.out.println("intrest rate in bank:");
	}
public static void main(String [] args) {
	Bankoverride b=new Bankoverride();
	b.getIntrestRate();
	Sbi s=new Sbi();
	s.getIntrestRate();
	Hdfc h=new Hdfc();
	h.getIntrestRate();
	Icici i=new Icici();
	i.getIntrestRate();
}
}
class Sbi extends Bankoverride{
public 	void getIntrestRate() {
		System.out.println("intrest rate in sbi bank is 3%");
	}
}
class Hdfc extends Bankoverride{
	public void getIntrestRate() {
		System.out.println("intrest rate in hdfc bank is 5%");

	}
}
class Icici extends Bankoverride {
	public void getIntrestRate() {
		System.out.println("intrest rate in icici bank is 4%");

	}
}