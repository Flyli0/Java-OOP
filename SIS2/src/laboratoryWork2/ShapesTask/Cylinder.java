package laboratoryWork2.ShapesTask;
import java.math.*;

public class Cylinder extends Shape3D{
	private double radius, height;
	public Cylinder(double r, double h) {
		this.radius = r;
		this.height = h;
	}
	@Override
	public double volume() {
		return Math.PI 	* this.radius * this.radius * height;
	}
	
	@Override 
	public double surfaceArea() {
		return (Math.PI 	* this.radius * this.radius)*2+(2*Math.PI*this.radius);
	}
}
