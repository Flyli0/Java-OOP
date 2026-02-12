package laboratoryWork1;

public class Temperature {
	private double temperature;
	private String scale;
	
	Temperature(double temperature){
		this.temperature = temperature;
	}
	
	Temperature(String scale){
		if(scale.equalsIgnoreCase("C") || scale.equalsIgnoreCase("F")) {
			this.scale = scale;
		}
		else {
			System.out.println("Wrong Scale symbol!");
		}
	}
	
	Temperature(double temperature,String scale){
		this(scale);
		this.temperature = temperature;
	}
	
	Temperature(){
		temperature = 0;
		scale = "C";
	}
	
	public double tempC() {
		if(scale.equalsIgnoreCase("F")) {
			temperature = 5*(temperature-32)/9;
			scale = "C";
		}
		return temperature;
	}
	
	public double tempF() {
		if(scale.equalsIgnoreCase("C")) {
			temperature = 9*(temperature/5)+32;
			scale = "F";
		}
		return temperature;
	}
	
	public void setScale(String scale) {
		if(scale.equalsIgnoreCase("C") || scale.equalsIgnoreCase("F")) {
			this.scale = scale;
		}
	}
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public void setBoth(String scale, double temperature) {
		this.setTemperature(temperature);
		this.setScale(scale);
	}
	
	public void getScale() {
		System.out.println(this.scale);
	}
}
