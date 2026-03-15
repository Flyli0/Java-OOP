package SIS4;

public class BankAccount {
	private int value;
	private String owner; 
	public BankAccount(String owner) {
		this.owner = owner;
	}
	
	public BankAccount(String owner, int value) {
		this.owner = owner;
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	
	public void deposit(int value) {
		this.value+=value;
	}
	
	public void withdraw(int val) {
		if(val>this.value) {
			System.out.println("You don't have enough money!");
		}
		else {
			this.value -= val;
		}
	}
	
	public void transfer(BankAccount other, int value) {
		this.withdraw(value);
		other.deposit(value);
		System.out.println("You have successfully transfered: " + value + "$\n to User: " + other.getOwner());
		System.out.println("Your Bank account current value: "+this.value); 
	}
}
