package javapractice1;

public class Multilevelinheritance {
	public static void main(String [] args) {

		Course	cr=new Course();
		cr.studentDetails();
		cr.instructorDetails();	
		cr.courseDetails();
		}
}
	class Student1{
	String education="degree";
	String collegeName="TKR";
	int yearsOfStudy=3;
	void studentDetails() {
	System.out.println("edu:"+education);
	System.out.println("college:"+collegeName);
	System.out.println("study:"+yearsOfStudy);		
	}
	
}

class Instructor1 extends Student1{
	String expertise="java,html,css";
	String experience="15-years";
	void instructorDetails() {
	System.out.println("expertise:"+expertise);
	System.out.println("experience:"+experience);
}
}
class Course extends Instructor1{
	int id =52234;
	String title="javafullstack";
	void courseDetails() {
	System.out.println("id:"+id);
	System.out.println("course:"+title);
	}	
}
