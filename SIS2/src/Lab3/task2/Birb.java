package Lab3.task2;

public class Birb implements Flyable{
	private String name;
	private String color;
	public Birb(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	@Override
	public void move() {
		System.out.println("Da birb is mooving...");
	}
	
	@Override
	public double distance(int time) {
		
		return time*30;
	}
	
	@Override
	public void fly() {
		System.out.println(this.name + " is flying");
	}
	
	@Override
	public void ascend() {
		System.out.println("Birb is Flying High!");
		
	}
	@Override
	public void descend() {
		System.out.println("Birb is flying low");
	}
}
