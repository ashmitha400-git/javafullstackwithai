class swap{
public static void main(String args[]){
int a=5;
int b=7;
a=a^b;
b=a^b;
a=b^a;

System.out.println("after swap value of a:"+a);
System.out.println("after swap value of b:"+b);

}
}