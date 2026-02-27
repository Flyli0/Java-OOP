package laboratoryWork2.PetManagement;

public class Student extends Person{
	private String school;
	
	public Student(String school,String name, int age) {
		super(name,age);
		this.school = school;
	}
	
	@Override
	public String getOccupation() {
		return "Student " + this.school;
	}

}
