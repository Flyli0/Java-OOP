package laboratoryWork2.BankAccount;

public class SavingsAccount extends Account{
	private double dividendsDeposited;
	private static double minimumBalance;
	
	{
		SavingsAccount.minimumBalance = 99;
		this.dividendsDeposited = 0;
		SavingsAccount.interestRate = 0.095;
	}
	
	public SavingsAccount(double balance, int id) {
		super(balance, id);
		if(this.balance < SavingsAccount.minimumBalance) {
			System.out.println("You need to deposit at least 99$ overall to obtain dividends");
		}
		else {
			System.out.println("$$$$$$$$$$$$ Dividends are available!!! $$$$$$$$$$$$$$$");
		}
		
	}
	
	
	
	public void dividend() {
		if(this.balance >= SavingsAccount.minimumBalance) {
			this.dividendsDeposited += this.balance * SavingsAccount.interestRate;
			this.balance += this.balance * SavingsAccount.interestRate;
		}
		else {
			System.out.println("To obtain dividends deposit you need another " + (SavingsAccount.minimumBalance - this.balance) + '$');
		}
	}
	
	@Override
	public String toString() {
		return "Your Saving account ID is: " + this.getAccountId() + '\n' + "Current balance: " + this.balance + '$' + '\n' + "Free transactions left: " + this.FREE_TRANSACTIONS + '\n' + "Overall dividends are: " + this.dividendsDeposited + '$';
	}

}
