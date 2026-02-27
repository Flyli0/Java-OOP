package laboratoryWork2.BankAccount;

public class CheckingAccount extends Account{
	
	public CheckingAccount(double balance, int id) {
		super(balance, id);
	}
	
	@Override
	public String toString() {
		return "Your Checking account ID is: " + this.getAccountId() + '\n' + "Current balance: " + this.balance + '$' + '\n' + "Free transactions left: " + this.FREE_TRANSACTIONS;
	}
}
