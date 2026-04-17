package Lab3.task1;

public class Cat extends Animal implements Breathable, Movable, Cloneable{
	private String color;
	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	@Override
	public void move() {
		System.out.println(this.name + " is moving");
	}
	@Override
	public double distance(int time) {
		return time*20;
	}
	@Override
	public void Breathe() {
		System.out.println("cat is breathing...");
	}
	
	@Override 
	public void voice() {
		System.out.println("Meow");
	}
	
	@Override 
	public String toString() {
		return "Cat " + this.name;
	}
	
	@Override 
	public Object clone() {
		Cat cloned = (Cat) super.clone();
		return cloned;
		
	}

}
