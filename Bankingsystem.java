package javapractice1;

public class Bankingsystem {
public static void main(String [] args) {
	Savingaccount sa=new Savingaccount();
	sa.accountHolderName("Suresh");
	sa.calculateIntrest();
	Currentaccount ca=new Currentaccount();
	ca.accountHolderName("ashmitha");
	ca.calculateIntrest();
}
}
abstract class Account{
	abstract void calculateIntrest();

		
	}
	

class Savingaccount extends Account {
	
	void accountHolderName(String a ) {
		System.out.println("-----Savinga ccount----");

	System.out.println("the account holder name is:"+a);
	}

	void calculateIntrest() {
		System.out.println("the total intrest percentage is:5%");
	
	}	
}
class Currentaccount extends Account{
	void accountHolderName(String b) {
		System.out.println("----current account----");
		System.out.println("the accoun holder name is: "+b);
	}
	void calculateIntrest () {
		System.out.println("the total intrest percentage is :3%");
	}
}