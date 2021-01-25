package third;



public class Customer {
	private String name;
	private String address;
	private int acno;
	private int current_bal;
	private Account acc;
	
	public Customer(String name, String address, int acno, int current_bal,
			Account acc) {
		super();
		this.name = name;
		this.address = address;
		this.acno = acno;
		this.current_bal = current_bal;
		this.acc = acc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAcno() {
		return acno;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public int getCurrent_bal() {
		return current_bal;
	}
	public void setCurrent_bal(int current_bal) {
		this.current_bal = current_bal;
	}
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", acno="
				+ acno + ", current_bal=" + current_bal + ", acc=" + acc.toString() + "]";
	}
	
}
