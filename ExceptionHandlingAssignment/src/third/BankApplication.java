package third;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {
	InsufficientBalException ie=new InsufficientBalException("Current Balance is less than Minimum Balance Can not create Customer");
	Scanner sc=new Scanner(System.in);
	private Customer customers[]= new Customer[10];
	private static int total_customer=0;
	public void addCustomer(Customer c){
		try{
			if(c.getCurrent_bal()<c.getAcc().getMinBal()){
				throw ie;
			}
			else{
				customers[total_customer++]=c;
			}
		}
		catch(InsufficientBalException ie){
			System.out.println(ie.getMessage());
			
		}
		
		

	}
	public void deleteCustomer(int i){
		for(int i1=0;i1<customers.length;i1++){
			if(customers[i1].getAcno()==i){
				customers[i1]=null;
				total_customer--;
				break;
			}
		}
	}
	public void updateCustomer(int ac){
		for(int i1=0;i1<customers.length;i1++){
			if(customers[i1].getAcno()==ac){
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter Address");
				String add=sc.next();
				customers[i1].setAddress(add);
				customers[i1].setName(name);
				break;
			}
		}
		
	}
	public void getCustomerInfo(int ac){
		for(int i1=0;i1<customers.length;i1++){
			if(customers[i1].getAcno()==ac){
			System.out.println(customers[i1].toString());
			break;
			}
		}
		
	}
	public static int getTotal_customer() {
		return total_customer;
	}
	
	
}
