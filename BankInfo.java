package week3.day1;

public class BankInfo extends AxisBank {
	
	public void saving() {
		System.out.println("Savings Account");
	}
	
	public void fixed() {
		System.out.println("Fixed Deposit Account");		
	}
	
	public void deposit() {
		System.out.println("Cash Deposit");
	}
	
	public static void main(String[] args)	{
		BankInfo bnkObj = new BankInfo();
		bnkObj.saving();
		bnkObj.fixed();
		bnkObj.deposit();
	}
}	