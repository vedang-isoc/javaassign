package third;

public class Account {
	private String accType;
	private int acNo;
	private int minBal=1000;
	private int currentBal;
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public int getAcNo() {
		return acNo;
	}
	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}
	public int getMinBal() {
		return minBal;
	}
	public void setMinBal(int minBal) {
		this.minBal = minBal;
	}
	public int getCurrentBal() {
		return currentBal;
	}
	public void setCurrentBal(int currentBal) {
		this.currentBal = currentBal;
	}
	public void  calInterest(){
		
	}
	public String toString() {
		return "Account [accType=" + accType + ", acNo=" + acNo + ", minBal="
				+ minBal + ", currentBal=" + currentBal + "]";
	}
	public Account(String accType, int acNo,  int currentBal)  {
		
	
			this.accType = accType;
			this.acNo = acNo;
		
			this.currentBal = currentBal;
	
		
		
		
	
	}
	public boolean equals(Account Acc) {
		// TODO Auto-generated method stub
		if(this.acNo==Acc.getAcNo()){
			return true;
		}
		else{
			return false;
		}
	}
	

}
