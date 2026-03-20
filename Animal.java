package javapractice1;

interface Animal {
 public void sound();
}

	
class Dog implements Animal{
	public static void main(String [] args) {
		Dog d=new Dog();
		d.sound();
		Cat c=new Cat();
		c.sound();
		Bird b=new Bird();
		b.sound();
	
	}
	public void sound() {
		System.out.println("bow-bow");
	}
}
class Cat implements Animal{
	public void sound() {
		System.out.println("meow-meow");
	}
	}
class Bird implements Animal{
	public void sound() {
		System.out.println("chrip-chrip");
	}
}

