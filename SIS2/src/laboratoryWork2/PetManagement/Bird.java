package laboratoryWork2.PetManagement;

public class Bird extends Animal{

	public Bird(int age, String name) {
		super(age, name);
	}

	@Override
	public String getSound() {
		return "Squiiq feeeeeew";
	}

}
