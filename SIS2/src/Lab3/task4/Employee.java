package Lab3.task4;
import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable{
	private double salary;
	private Date hireDate;
	private String insuranseNumber;
	
	public Employee(String name, int age, double salary, Date hireDate, String insuranseNumber) {
		super(name, age);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranseNumber = insuranseNumber;
	}
	
	public Employee(String name, int age, double salary, Date hireDate) {
		super(name, age);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranseNumber = "-1";
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setSalary(double newSalary) {
		this.salary = newSalary;
	}
	
	public Date getHireDate() {
		return this.hireDate;
	}
	
	public String getInsuranceNum() {
		return this.insuranseNumber;
	}
	
	public void setInsurance(String Inum) {
		this.insuranseNumber = Inum;
	}
	
	@Override 
	public String toString() {
		return super.toString() + "\n Employed since: " + this.getHireDate() + "\n Salary: " + this.getSalary();
	}
	
	@Override 
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		else {
			Employee temp = (Employee) o;
			if(temp.getHireDate() == this.getHireDate() && temp.getInsuranceNum() == this.getInsuranceNum()) return true;
			else {
				return false;
			}
		}
	}

	@Override
	public int compareTo(Employee o) {
		return Double.compare(this.getSalary(), o.getSalary());
	}
	
	@Override 
	public Object clone() throws CloneNotSupportedException {
		Employee cloned = (Employee) super.clone();
		cloned.hireDate = (Date) this.hireDate.clone();
		return cloned;
	}
	
}
