package laboratoryWork2.BankAccount;
import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts;
	public Bank() {
		accounts = new ArrayList<Account>();
	}
	
	public void assign(Account a) {
		accounts.add(a);
	}
	
	public void update() {
		for(Account account:this.accounts) {
			if(account instanceof SavingsAccount) {
				((SavingsAccount) account).dividend();
			}
			else if(account instanceof CheckingAccount) {
				if(account.FREE_TRANSACTIONS <= 0) {
					double c = account.deductFee(account.getNumberOfTransactions()-10);
					System.out.println("Fee: " + c + '$');
				}	
			}
			account.print();
			System.out.println('\n');
		}
	}
}
