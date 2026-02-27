package laboratoryWork2.PetManagement;

public class PhDStudent extends Person{
	private String doctorship;
	
	public PhDStudent(String doctorship, String name, int age) {
		super(name,age);
		this.doctorship = doctorship;
	}

	@Override
	public String getOccupation() {
		return "PhD Student " + this.doctorship;
	}
	
	@Override
	public void assignPet(Animal pet) {
		if(this.pet instanceof Dog) {
			System.out.println("I'm too busy to have such high-maintenance animal as a pet!");
		}
		else {
			this.pet = pet;
			pet.setOwner(this);
			pet.setHolder(this);
		    System.out.println("Owner set to: " + pet.getOwner());
		}
	}
}
