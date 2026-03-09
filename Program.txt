class Program{
public static void main(String args[]){
for(int r=1;r<=3;r++){
for(int c=1;c<=3;c++){
if((r==1 && c==2)||(r==2 && c==1)||(r==3 && c==2)||(r==2 && c==3))
System.out.print(" ");
else{
System.out.print(c);
}
}
System.out.println();
}
}
}
