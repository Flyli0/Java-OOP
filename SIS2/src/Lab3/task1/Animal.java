package Lab3.task1;

public abstract class Animal {
	protected String name;
	private int age;
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void voice() {
		System.out.println("undefined");
	}
}
