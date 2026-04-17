package Lab3.task6;

public class Person implements Comparable<Person>, Cloneable, Breathable, Moveable{
	protected String name;
	protected int age;
	protected Animal pet;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.pet = null;
	}
	
	public void assignPet(Animal pet) {
		this.pet = pet;
		pet.setOwner(this);
		pet.setHolder(this);
	    System.out.println("Owner set to: " + pet.getOwner());
	}
	
	
	public void returnPetFrom(Person p) {
		if(p.pet.getOwner() == this) {
			this.pet = p.pet;
	        this.pet.setHolder(this);
	        p.pet = null;
		}
		else {
			System.out.println("That is not your pet");
			System.out.println(p.pet.getOwner());
		}
	}
	
	public void removePet() {
		if(this.hasPet()) {
			this.pet = null;
		}
		else {
			System.out.println("You have no pet to leave");
		}
	}
	
	public void leavePetWith(Person p) {
		if(p.hasPet()) {
			System.out.println("this person already maintains some pet");
			return;
		}
		if(p instanceof PhDStudent && this.pet instanceof Dog) {
			System.out.println("this person is too busy to have high-maintainence pet!");
			return;
		}
		
		this.pet.setHolder(p);
	    p.pet = this.pet;
	    this.pet = null;
	}
	
	public boolean hasPet() {
		return this.pet!=null;
	}
	
	public String toString() {
		if(!this.hasPet()) {
			return "Name: " + this.name + "\n Age: " + this.age + "\n Has no pet";
		}
		return "Name: " + this.name + "\n Age: " + this.age + "\n Pet: " + this.pet;
	}

	@Override
	public int compareTo(Person o) {
		return Integer.compare(this.age, o.age);
	}
	
	@Override 
	public Object clone() throws CloneNotSupportedException{
		Person cloned = (Person) super.clone();
		cloned.pet = (Animal) this.pet.clone();
		return cloned;
	}

	@Override
	public void move() {
		System.out.println("This person is moving...");
	}

	@Override
	public int distance(int time) {
		return time*4;
	}

	@Override
	public void breathe() {
		System.out.println("This person is breathing");
		
	}
}
