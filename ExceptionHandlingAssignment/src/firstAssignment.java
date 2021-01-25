import java.util.Scanner;


public class firstAssignment {
public static void main(String[] args) {
	int a,b;
	Scanner sc=new Scanner(System.in);
	try{
		System.out.println("Enter Divisor");
		a=sc.nextInt();
		System.out.println("Enter Dividend");
		b=sc.nextInt();
		try{
			System.out.println("Divison of two number is "+a/b);
			
		}
		finally{
			System.out.println("This is finally block of inner try block");
		}
		
	}
	
	catch(ArithmeticException e){
	e.printStackTrace();
	System.out.println("Exception occured "+e.getMessage());
	}
	catch(Exception e){
		e.printStackTrace();
		System.out.println("Exception occured "+e.getMessage());
	}
	
	finally{
		System.out.println("This is finally block of outer try block");
		
		
	}
}
}
