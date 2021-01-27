package Assignment4;

import java.util.Hashtable;

public class BankingOP {
	public static void main(String[] args) {
		Hashtable<String, Integer> hash=new Hashtable<>();
		hash.put("SB_ACCOUNT", 1000);
		hash.put("CURR_ACCOUNT", 2000);
		//System.out.println(hash);
		
//		Hashtable<String, Integer> hash1=new Hashtable<>();
//		hash1.put("SB_ACCOUNT", 1000);
//		hash1.put("CURR_ACCOUNT", 2000);
		
		Customer c=new Customer("Vedang", 1288,hash);
		Customer c1=new Customer("Kishan", 1277,hash);
		BankApplication app=new BankApplication();
		
		//System.out.println(c);
		
		app.addNewCustomer(c);
		app.addNewCustomer(c1);
		app.depositeAmount("Kishan", "SB_ACCOUNT", 2000);
		app.depositeAmount("Vedang", "SB_ACCOUNT", 5000);
		System.out.println(c);
		System.out.println(c1);
		app.displayCustomer(); 
		System.out.println(hash);
		
	}

}
