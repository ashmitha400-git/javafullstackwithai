package javapractice1;


public class Staticblock {

  static int a;
  static int b;
  static int sum;
  static{
	 a=20;
	b=30;
	sum=a+b;
	  System.out.println("static block execution:");
	  
  }
  
  public static void main(String [] args) {
System.out.println("the valu of sum is:"+sum);
  }
}
