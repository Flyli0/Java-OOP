package laboratoryWork2.ShapesTask;

public class Sphere extends Shape3D{
	private double radius;
	public Sphere(double r) {
		this.radius = r;
	}
	
	@Override
	public double volume() {
		return (4/3)*Math.PI*this.radius*this.radius*this.radius;
	}
	
	@Override 
	public double surfaceArea() {
		return 4*Math.PI * this.radius * this.radius; 
	}
}
