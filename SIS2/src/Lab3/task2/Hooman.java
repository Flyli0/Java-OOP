package Lab3.task2;

public class Hooman implements Dance{
	private String name;
	private int age;
	
	public Hooman(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void move() {
		System.out.println("This hooman is moving...");
	}

	@Override
	public double distance(int time) {
		return 2*time;
	}

	@Override
	public void dance() {
		this.move();
		System.out.println("Humano is dancing, and he got some mooooves!!!");
	}

}
