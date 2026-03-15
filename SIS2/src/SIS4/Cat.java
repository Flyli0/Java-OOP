package SIS4;

public class Cat extends Animal implements CanHavePizza, Moving{
	private String breed;
	private String name;
	public Cat(String breed, String tail, String name){
		this.breed = breed;
		this.name = name;
		super(4,tail,true);
	}
	
	public Cat() {
		this.breed = "siamese";
		this.name = "Murrzik";
		super();
	}
	
	public int getLegsNum() {
		return 4;
	}
	
	public String getLegsNum(String name) {
		return "How many legs do you expect from a cat" + name + " 4!";
	}
	
	@Override
	public String voice() {
		return "Meow";
	}

	@Override
	public void move() {
		System.out.println(this.name + "is moving");
		
	}

	@Override
	public void eatPizza() {
		this.voice();
		System.out.println(this.name + "is eating pizza mmm");
		
	}
}
