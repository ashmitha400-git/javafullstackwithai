package javapractice1;

 interface Animalinterface {
public void sound();
}
 class Dogs implements Animalinterface{

	public static void main (String [] args) {
			Dogs d=new Dogs();
			d.sound();
			Cats c=new Cats();
			c.sound();
	}
		public void sound() {
         System.out.println("bow-bow");
	}
}
class Cats implements Animalinterface{
	public void sound() {
        System.out.println("meow-meow");

	} 
}