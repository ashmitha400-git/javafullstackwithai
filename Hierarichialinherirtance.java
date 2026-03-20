package javapractice1;

public class Hierarichialinherirtance {
	public static void main(String [] args) {
		Manager m1=new Manager();
		m1.employeDetails();
		m1.managerDetails();
	
	Developer d1=new Developer();
	d1.employeDetails();
	d1.developerDetails();
	}
}
class Employeees1{
	int empId=5345;
	String empName="suresh";
	int salary=35000;
	String companyName="DSU global it";
	void employeDetails() {
		System.out.println("empid:"+empId);		

		System.out.println("name:"+empName);		
		System.out.println("salary:"+salary);		
		System.out.println("company:"+companyName);		

	}
}
class Manager extends Employeees1{
	String department="HR";
	int teamSize=7;
	
	void managerDetails() {
		System.out.println("depart:"+department);		
		System.out.println("teamsize:"+teamSize);		

		
	}
}
class Developer extends Employeees1{
	String ProgrammingLanguage="java";
	int experience=10;
	String projectName="ecom";
	void developerDetails() {
		System.out.println("language:"+ProgrammingLanguage);		
		System.out.println("experience:"+experience);		
		System.out.println("projectName:"+projectName);		

	}
}