package laboratoryWork2.PetManagement;

public abstract class Animal {
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
	
	public abstract String getSound();
}
