package laboratoryWork2.PetManagement;
import java.util.ArrayList;

public class PersonRegistry {
	private ArrayList<Person> register;
	
	public PersonRegistry() {
		register = new ArrayList<Person>();
	}
	
	public void addPerson(Person p) {
		register.add(p);
	}
	
	public void removePerson(Person p) {
		register.remove(p);
	}
	
	public ArrayList<Person> personsWithPets() {
		ArrayList<Person> arr = new ArrayList<Person>();
		for(Person p: register) {
			if(p.hasPet()) {
				arr.add(p);
			}
		}
		return arr;
	}
	
	public ArrayList<Person> personsWithoutPets() {
		ArrayList<Person> arr = new ArrayList<Person>();
		for(Person p: register) {
			if(!p.hasPet()) {
				arr.add(p);
			}
		}
		return arr;
	}
	
	public void printDetails() {
		System.out.print("DETAILS \n");
		for(Person p: register) {
			System.out.println("Person " + p.name + " age: " + p.age);
			System.out.println("Occupation " + p.getOccupation());
			System.out.print('\n');
		}
	}
	
}
