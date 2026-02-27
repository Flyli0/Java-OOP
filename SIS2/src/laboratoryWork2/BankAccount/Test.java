package laboratoryWork2.BankAccount;

public class Test {

	public static void main(String[] args) {
		Bank bank1 = new Bank();
		SavingsAccount b = new SavingsAccount(0,1);
		CheckingAccount a = new CheckingAccount(0,2);
		a.deposit(100);
		a.withdraw(20);
		a.transfer(20,b);
		a.deposit(300);
		a.transfer(100, b);
		a.transfer(1, b);
		a.transfer(1, b);
		a.transfer(1, b);
		a.transfer(1, b);
		a.transfer(1, b);
		a.transfer(1, b);
		a.transfer(1, b);
		System.out.println('\n');
		bank1.assign(a);
		bank1.assign(b);
		bank1.update();
		a.closeAccount();
		a.closeAccount();
	}
	
}
