package laboratoryWork2.ShapesTask;

public class Cube extends Shape3D{
	private double side;
	public Cube(double s) {
		this.side = s;
	}
	
	@Override 
	public double surfaceArea() {
		return 6*this.side * this.side;
	}
	
	@Override 
	public double volume() {
		return this.side*this.side*this.side;
	}
}
