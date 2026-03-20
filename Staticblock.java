package javapractice1;


public class Staticblock {
  static int number;
  static {
	  number=100;
	  System.out.println("static block");
  }
  public static void main(String [] args) {
	  System.out.println("main method:"+number);
  
  }
}
