package SIS4;

public class Animal {
	private int legs;
	private String tail;
	private boolean wiskers;
	public Animal(int legs, String tail,boolean wiskers) {
		this.legs = legs;
		this.tail = tail;
		this.wiskers = wiskers;
	}
	public Animal() {
		this.legs = 4;
		this.tail = "Long";
		this.wiskers = true;
	}
	public int getLegsNumber() {
		return this.legs;
	}
	
	public boolean isThereAWiskers() {
		return wiskers;
	}
	
	public String getTailType() {
		return tail;
	}
	
	public String voice() {
		return "Not defined";
	}
}
