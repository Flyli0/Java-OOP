package laboratoryWork1;
import java.lang.Math;

public class Data {
	private double sum;
	private double maximum;
	private int counter;
	Data(){
		counter = 0;
		maximum = -10e9;
		sum = 0;
	}
	
	public void addValue(int val){
		sum+=val;
		counter++;
		maximum = Math.max(maximum, val);
	}
	
	public double getAverage(){
		if(counter!=0) {
			return sum/counter;
		}
		System.out.println("Data is empty!");
		return 0;
	}
	
	public double getMax(){
		if(counter!=0) {
			return maximum;
		}
		System.out.println("Data is empty!");
		return 0;
	}
}
