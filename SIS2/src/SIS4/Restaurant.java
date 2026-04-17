package SIS4;

public class Restaurant {
	private BankAccount rb;
	private String name;
	private PaymentService ps;
	public Restaurant(String name) {
		this.name = name;
		this.rb = new BankAccount(name,100);
		ps = new PaymentService(rb);
	}
	public void servePizza(CanHavePizza eater) {
		eater.eatPizza();
		if(eater instanceof Person) {
			Person eatert = (Person) eater;
			ps.pay(eatert.getAcc(), 7);
		}
	}
	
}
