package Org.system;

public class AxisBank extends BankInfo {
 
	 public void Deposit() {
		 System.out.println("Deposit: 30000");
	 }
	 public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.Deposit();
		a.Fixed();
		a.Saving();
		a.Loan();
		
	}
}

