package javapractice1;

public class Singleinheritance {
	public static void main(String [] args) {
	

	Instructor i=new Instructor();
      i.instructorDetails();
      i. instructorDetails();
	}
	}


class Students {
	int yearsOfStudy=3;
	String education="degree";
	String collegeName="TKR";
	void studentDetails() {  
		System.out.println("studyyears:"+yearsOfStudy);
		System.out.println("education:"+education);
		System.out.println("collegename:"+collegeName);
	}
}
class Instructor extends Students{
	String expertise="java,html,css,etc";
	String experience="15-years";
	String bio="trainer";
	double rating=4.5;
	void instructorDetails() {
		System.out.println("expertice:"+expertise);
		System.out.println("experience:"+experience);
		System.out.println("bio:"+bio);
		System.out.println("rating:"+rating);

	}
}