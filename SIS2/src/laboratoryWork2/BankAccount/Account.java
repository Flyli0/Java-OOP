package laboratoryWork2.BankAccount;

public abstract class Account {
	protected static double interestRate;
	protected int FREE_TRANSACTIONS;
	private int transactionCounter;
	protected double balance;
	private int accountId;
	private boolean open;
	
	public Account(double balance, int id) {
		this.balance = balance;
		this.accountId = id;
		this.transactionCounter = 0;
		FREE_TRANSACTIONS = 10;
		open = true;
	}
	
	protected double deductFee(int numberOfTransactions){
		this.balance -= (0.02*numberOfTransactions);
		return (0.02*numberOfTransactions);
	}
	
	public void deposit(double value) {
		if(open) {
			if(this.FREE_TRANSACTIONS > 0) {
			balance+=value;
			this.FREE_TRANSACTIONS--;
				}
			else {
			balance += value;
				}
			System.out.println("Success! Your current balance is: " + this.balance);
			this.transactionCounter++;
		}
		else {
			System.out.println("You cannot make transactions on a closed account");
		}
	}
	
	public void withdraw(double value) {
		if(open) {
			if(balance == 0) {
				System.out.println("Your balance is 0$");
			}
			else if(this.balance < value) {
				System.out.println("You don't have so much money on your account");
			}
			else if(this.balance >= value) {
				if(this.FREE_TRANSACTIONS>0) {
					this.FREE_TRANSACTIONS--;
					balance -= value;
				}
				else {
					 balance -= value;
				}
				System.out.println("Successfully withdrawed:" + value + '$' + '\n' + "Your current balance is: " + this.balance);
				this.transactionCounter++;
			}
		}
		else {
			System.out.println("You cannot make transactions on a closed account");
		}
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getAccountId() {
		return this.accountId;
	}
	
	public void transfer(double amount, Account other) {
		if(open) {
			this.withdraw(amount);
			other.deposit(amount);
		}
		else {
			System.out.println("You cannot make transactions on a closed account");
		}
	}
	
	public int getNumberOfTransactions() {
		return this.transactionCounter;
	}
	
	public String toString() {
		String f = "Your account ID is: " + this.accountId + '\n' + "Current balance: " + this.balance + '$' + '\n' + "Free transactions left: " + this.FREE_TRANSACTIONS;
		return f;
	}
	
	public final void print() {
		System.out.println(this.toString());
	}
	
	public final void closeAccount() {
		if(open)this.open = false;
		else System.out.println("this account is already closed");
	}
	
	public final void openAccount() {
		if(!this.open)this.open = true;
		else System.out.println("this account is already open");
	}
}
