package SIS4;

public class PaymentService {
	private BankAccount ba;
	public PaymentService(BankAccount ba) {
		this.ba = ba;
	}
	public void pay(BankAccount other, int value){
		other.transfer(this.ba,value);
	}
}
