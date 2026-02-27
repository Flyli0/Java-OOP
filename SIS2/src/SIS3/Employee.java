package SIS3;

public class Employee extends Person{
	private String school;
	private double pay;
	public Employee(String name, String address, String school, double pay){
		this.school = school;
		this.pay = pay;
		super(name,address);
	}
	
	public String getSchool() {
		return this.school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public double getPay() {
		return this.pay;
	}
	
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	public String toString() {
		return "Employee: "+ this.getName() + "\n Address: " + this.getAddress() + "\n School: " + this.school + "\n pay: " + this.pay;
	}
}
