class Eligible{
public static void main(String args[]){
int marks=70;
int attendence=80;
Boolean hasBacklog=false;
boolean result=(marks >=70 && attendence >= 75 && !hasBacklog);
System.out.println("Eligible for placement:"+result);
}
}