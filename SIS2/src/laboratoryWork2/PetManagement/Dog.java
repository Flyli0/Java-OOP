package laboratoryWork2.PetManagement;

public class Dog extends Animal{

	public Dog(int age, String name) {
		super(age, name);
	}

	@Override
	public String getSound() {
		return "Woof Woof";
	}

}
