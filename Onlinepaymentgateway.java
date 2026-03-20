package javapractice1;

public class Onlinepaymentgateway {
public static void main(String [] args) {
	Creditcardpayment cp=new Creditcardpayment();
	cp.creditpaymentdetails();
	cp.processPayment();
	cp.transactionId();
	Upipayment up=new Upipayment();
	up.upipaymentprocess();
	up.processPayment();
	up.transactionId();
	Walletpayment wp=new Walletpayment();
	wp.walletpayment();
	wp.processPayment();
	wp.transactionId();
}
}
abstract class Paymentprocesses{
abstract void processPayment();
void transactionId(){
System.out.println("SBI50382798");
}
}
class Creditcardpayment extends Paymentprocesses{

	String cardNumber="1234 5678 9012 3456";
	String cardHolderName="RupaAsmitha";
	String expiryDate="12-36";
	void creditpaymentdetails() {
		System.out.println("------------");
	System.out.println("card num:"+cardNumber);
	System.out.println("card HolderName:"+cardHolderName);
	System.out.println("expiryDate:"+expiryDate);
	}
	void processPayment() {
		System.out.println("SBI50382798");

	}
}
class Upipayment extends Paymentprocesses{
	String upiId="ashmitha@upi";
	String userName="ashmitha";
	String bankName="SBI";
	String status="success";
	void upipaymentprocess() {
		System.out.println("------------");

		System.out.println("upiId:"+upiId);
		System.out.println("userName:"+userName);
		System.out.println("bankName:"+bankName);
		System.out.println("status:"+status);

	}
	void processPayment() {
		System.out.println("SBI50382798");


	}
}
class Walletpayment extends Paymentprocesses{
	String walletId="wi123456";
	String userName="ashmitha";
	int amount=5000;
	String status="success";
	void walletpayment() {
		System.out.println("------------");

	System.out.println("walletid:"+walletId);
	System.out.println("userName:"+userName);
	System.out.println("amount:"+amount);
	System.out.println("status:"+status);
}
void processPayment() {
	System.out.println("SBI50382798");
}
}