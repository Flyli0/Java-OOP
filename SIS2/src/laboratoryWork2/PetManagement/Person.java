package laboratoryWork2.PetManagement;

public abstract class Person {
	protected String name;
	protected int age;
	protected Animal pet;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.pet = null;
	}
	
	public void assignPet(Animal pet) {
		this.pet = pet;
		pet.setOwner(this);
		pet.setHolder(this);
	    System.out.println("Owner set to: " + pet.getOwner());
	}
	
	
	public void returnPetFrom(Person p) {
		if(p.pet.getOwner() == this) {
			this.pet = p.pet;
	        this.pet.setHolder(this);
	        p.pet = null;
		}
		else {
			System.out.println("That is not your pet");
			System.out.println(p.pet.getOwner());
		}
	}
	
	public void removePet() {
		if(this.hasPet()) {
			this.pet = null;
		}
		else {
			System.out.println("You have no pet to leave");
		}
	}
	
	public void leavePetWith(Person p) {
		if(p.hasPet()) {
			System.out.println("this person already maintains some pet");
			return;
		}
		if(p instanceof PhDStudent && this.pet instanceof Dog) {
			System.out.println("this person is too busy to have high-maintainence pet!");
			return;
		}
		
		this.pet.setHolder(p);
	    p.pet = this.pet;
	    this.pet = null;
	}
	
	public boolean hasPet() {
		return this.pet!=null;
	}
	
	public abstract String getOccupation();
	
	public String toString() {
		if(!this.hasPet()) {
			return "Name: " + this.name + "\n Age: " + this.age + "\n Has no pet";
		}
		return "Name: " + this.name + "\n Age: " + this.age + "\n Pet: " + this.pet;
	}
}
