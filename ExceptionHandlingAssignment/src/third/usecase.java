package third;

public class usecase {
	public static void main(String[] args) {
		BankApplication ap1=new BankApplication();
		FixedDepositAcc fd=new FixedDepositAcc("FixedDeposit", 1234, 900);
		//FixedDepositAcc fd=new FixedDepositAcc("FixedDeposit", 1234, 1000, 11000);
		Customer c1=new Customer("Vedang", "GNR", 1234, 900,fd);
//		Customer c2=new Customer("Kishan", "GNR", 1237, 14000);
//		Customer c3=new Customer("Devang", "GNR", 1236, 14000);
		ap1.addCustomer(c1);
//		ap1.addCustomer(c2);
	//	ap1.getCustomerInfo(1234);
//		System.out.println(ap1.getTotal_customer());
//		ap1.deleteCustomer(1237);
//		ap1.addCustomer(c3);
	//	System.out.println(ap1.getTotal_customer());
	}

}
