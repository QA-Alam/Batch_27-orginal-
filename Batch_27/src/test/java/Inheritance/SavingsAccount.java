package Inheritance;

public class SavingsAccount extends CheckingAccount {
	
	
public static void main(String[] args) {
	
	SavingsAccount obj = new SavingsAccount();
	obj.accountActivity();
	obj.savingActivity();
	
	
}
	
	
	public  void savingActivity() {
		//System.out.println(CheckingAccount.accountName);
		CheckingAccount.balance = 10000;
		CheckingAccount.withdraw = 1000;
		CheckingAccount.deposit = 5000;
		CheckingAccount.total = CheckingAccount.balance -CheckingAccount.withdraw +CheckingAccount.deposit;
		System.out.println(CheckingAccount.accountName+ " total saving account balance$ "+ CheckingAccount.total);
	}
	
	
}
