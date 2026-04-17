package Lab3.task1;

public class Car implements Movable{
	private double velocity;
	private double acceleration;
	private String modelName;
	
	public Car(double velocity, double acceleration, String modelName) {
		this.velocity = velocity;
		this.acceleration = acceleration;
		this.modelName = modelName;
	}

	@Override
	public void move() {
		System.out.println("the car is moving...");
	}

	@Override
	public double distance(int time) {
		return time*this.velocity;
	}
	
	@Override
	public String toString() {
		return this.modelName;
	}
}
