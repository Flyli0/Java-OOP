package Lab3.task4;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name) { //if newborn
		this.name = name;
		this.age = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override 
	public String toString() {
		return "My name is " + this.getName() + "\n I'm " + this.getAge() + "years old.";
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Person)) return false;
		if(o == null) return false;
		Person temp = (Person) o;
		if(temp.getName() == this.getName() && temp.getAge() == this.getAge()) return true;
		return false;
	}
}
