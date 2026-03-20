package javapractice1;

public class Constuctor {
public static void main(String[] args) {
	
	Employee s1=new Employee();
	Employee s2=new Employee();
    Employee s3=new Employee(18,"suresh");
    System.out.println(s3.id);
    System.out.println(s3.name);

    Product p1=new Product();
    Product p2=new Product();
    Product p3=new Product(90,"mobile phone");
    System.out.println(p3.id);
    System.out.println(p3.title);


}
 	}
	class Employee{
	int id;
	String name;
	public Employee() {
      System.out.println("Employee constructor");
	}
	public Employee (int id,String name) {
		this.id=id;
		this.name=name;
	}
	}
	class Product{
		int id;
		String title;
		
		public Product() {
			System.out.println("product constructor");
		}
		
		public Product(int id,String title) {
			this.id=id;
			this.title=title;
		}

	}




