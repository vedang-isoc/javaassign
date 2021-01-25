import java.util.Scanner;


public class secondAssignment extends Exception {
public static void main(String[] args) {
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of which square root is to be found");
	a=sc.nextInt();
	try{
		if(a<0){
			throw new NegativeNumberException("Number can not be negative");
		}
		System.out.println("Square root of number is "+Math.sqrt(a));
	}
	catch(NegativeNumberException e){
	System.out.println("Exception occured "+e.getMessage());
		
	}
	
}
}
