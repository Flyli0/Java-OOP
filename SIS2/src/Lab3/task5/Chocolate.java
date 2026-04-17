package Lab3.task5;


public class Chocolate implements Comparable<Chocolate>{
	private double weight;
	private String name;
	public Chocolate(double weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	@Override
	public int compareTo(Chocolate o) {
		return Double.compare(this.weight, o.getWeight());
	}
	
	@Override 
	public String toString() {
		return this.name + ": " + this.weight;
	}
	
}
