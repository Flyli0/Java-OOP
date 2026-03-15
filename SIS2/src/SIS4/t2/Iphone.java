package SIS4.t2;
import SIS4.Person;

public class Iphone implements SelAndPlug{
	private String model;
	private Person owner;
	private int price;
	public Iphone(String model, int price) {
		this.model = model;
		this.price = price;
	}
	@Override
	public void sell(Person you) {
		System.out.println("You bought an Iphone for: " + this.price);
		this.owner = you;
	}
	@Override
	public void pending() {
		System.out.println("Do you want to by an Iphone for: " + this.price + '?');
		
	}
	@Override
	public boolean plug() {
		if(unplug()==true) {
			System.out.println("Your IPhone is Charging");
			return true;
		}
		return false;
	}
	@Override
	public boolean unplug() {
		if(plug()==true) {
			System.out.println("Your IPhone is Unplagged");
			return true;
		}
		return false;
	}
}
