package Lab3.task4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee implements Comparable<Employee>, Cloneable{
	private Vector<Employee> team;
	private double bonus;
	
	public Manager(String name, int age, double salary, Date hireDate, String ensurance) {
		super(name, age, salary, hireDate, ensurance);
		this.team = new Vector<Employee>();
		this.bonus = 0;
	}
	
	public void addTeammate(Employee e) {
		this.team.add(e);
	}
	
	public String getTeam() {
		String tim = "";
		if(this.team.isEmpty()) return "empty";
		tim += "---------------------TEAM------------------- \n";
		for(Employee e: this.team) {
			tim += (e + "(>_>) \n");
		}
		tim += "-------------------------------------------- \n";
		return tim;
	}
	
	public void addBonus(double bonus) {
		this.bonus += bonus;
	}
	
	public double getBonus() {
		return this.bonus;
	}
	public void giveBonus() {
		this.setSalary(this.getSalary()+this.bonus);
	}
	
	@Override 
	public String toString() {
		return super.toString() + "Manager (>_>) with team: \n" + this.getTeam();
	}
	
	@Override 
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		else {
			Manager temp = (Manager) o;
			if(temp.getTeam() == this.getTeam()) return true;
			else {
				return false;
			}
		}
	}
	
	@Override 
	public int compareTo(Employee m) {
		Manager temp = (Manager) m;
		if(super.compareTo(temp) == 0) {
			return Double.compare(this.bonus, temp.getBonus());
		}
		return super.compareTo(m);
	}
	
	@Override 
	public Object clone() throws CloneNotSupportedException{
		Manager cloned = (Manager) super.clone();
		cloned.team = (Vector<Employee>) this.team.clone(); 
		return cloned;
	}
}
