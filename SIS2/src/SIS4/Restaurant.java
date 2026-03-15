package SIS4;

public class Restaurant {
	private BankAccount rb;
	private String name;
	private PaymentService ps = new PaymentService(rb);
	public Restaurant(String name) {
		this.name = name;
	}
	public void servePizza(CanHavePizza eater) {
		eater.eatPizza();
		if(eater instanceof Person) {
			Person eatert = (Person) eater;
			ps.pay(eatert.getAcc(), 0);
		}
	}
	
}
