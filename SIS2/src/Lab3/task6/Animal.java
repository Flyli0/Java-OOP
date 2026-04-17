package Lab3.task6;

public class Animal implements Cloneable, Comparable<Animal>, Moveable, Breathable{
	private String name;
	private Person owner;
	private int age;
	private Person currentHolder;
	
	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void setHolder(Person p) {
		this.currentHolder = p;
	}
	
	public void setOwner(Person o) {
		this.owner = o;
	}
	
	public Person getOwner() {
		return this.owner;
	}
	
	public String toString() {
		String w = "";
		if(this.age > 1) {
			w = "s";
		}
		
		return this.name + ", " + this.age + " Year" + w;
	}
	
	@Override
	public int compareTo(Animal o) {
		return Integer.compare(this.age, o.age);
	}

	@Override 
	public Object clone() throws CloneNotSupportedException {
		Animal cloned = (Animal) super.clone();
		cloned.owner = (Person) this.owner.clone();
		cloned.currentHolder = (Person) this.currentHolder.clone();
		return cloned;
	}

	@Override
	public void breathe() {
		System.out.println("This animal is breathing...");
	}

	@Override
	public void move() {
		System.out.println("This animal is moving...");
	}

	@Override
	public int distance(int time) {
		return time * 20;
	}
}
