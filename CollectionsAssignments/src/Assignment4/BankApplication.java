package Assignment4;

import java.util.ArrayList;
import java.util.Hashtable;

public class BankApplication {
	private  Hashtable<String,Customer> accountinfo =new Hashtable();
	public  void addNewCustomer(Customer c) {
		accountinfo.put(c.getName(), c);
		System.out.println("Customer Added");
	}
	public  void depositeAmount(String name,String acc_type,int amount) {
		Customer c =accountinfo.get(name);
		c.depositeAmount(acc_type, amount);
		
		
	}
	public  void displayCustomer() {
		System.out.println(accountinfo);
		
	}
		

}
