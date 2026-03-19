package javafullstack;

public class methods {
	public static void main(String [] args){
		methods me=new methods();
	    
			int multiplication=me.multiplication(30,30);
			System.out.println("mul:"+multiplication);
            System.out.println(me.multiplication(30,30)); 			
		
			
		}
	
		int multiplication(int num1,int num2 ) {
			int mul=num1*num2;
			return(mul);
	    
	}

}