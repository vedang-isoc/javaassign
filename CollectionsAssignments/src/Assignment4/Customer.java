package Assignment4;

import java.util.Hashtable;

import javax.swing.Spring;

public class Customer {
	private String name;
	private int acc_no;
	private Hashtable<String,Integer> accinfo;
	
	public void depositeAmount(String acc_type,Integer amount) {
		Integer cam=this.accinfo.get(acc_type);
		cam+=amount;
		this.accinfo.replace(acc_type, cam);
		
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public Customer(String name, int acc_no, Hashtable<String, Integer> accinfo1) {
		super();
		this.name = name;
		this.acc_no = acc_no;
		this.accinfo =new Hashtable(accinfo1);
//		this.accinfo = accinfo1; 
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", acc_no=" + acc_no + ", accinfo=" + accinfo + "]";
	}

}
