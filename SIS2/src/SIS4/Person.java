package SIS4;

public class Person implements CanHavePizza{
	private String name;
	private String address;
	private BankAccount acc;
	
	{
		acc = new BankAccount(this.name,0);
	}
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return this.name;
	}
	
	public BankAccount getAcc() {
		return this.acc;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return "Person: " + this.name + ", Address: " + this.address;
	}

	@Override
	public void eatPizza() {
		System.out.println("omnomnom");
		
	}
	
	
}

