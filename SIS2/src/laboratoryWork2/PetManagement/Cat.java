package laboratoryWork2.PetManagement;

public class Cat extends Animal{

	public Cat(int age, String name) {
		super(age, name);
	}

	@Override
	public String getSound() {
		return "Meoooow";
	}
	
}
