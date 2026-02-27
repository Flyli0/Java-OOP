package laboratoryWork2.PetManagement;

public class Fish extends Animal{

	public Fish(int age, String name) {
		super(age, name);
	}

	@Override
	public String getSound() {
		return "Nah Ima fish, I don't talk, brother";
	}
	
}
