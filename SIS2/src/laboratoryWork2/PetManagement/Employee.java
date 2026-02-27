package laboratoryWork2.PetManagement;

public class Employee extends Person{
	private String occupation;
	
	public Employee(String occupation,String name, int age) {
		super(name,age);
		this.occupation = occupation;
	}
	
	@Override
	public String getOccupation() {
		return occupation;
	}
	
	
}
