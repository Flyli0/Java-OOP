package laboratoryWork2.PetManagement;

public class PetServiceTest {
	public static void main(String[] args) {
		PersonRegistry pr1 = new PersonRegistry();
		Person p1 = new Employee("Engineer", "John", 27);
		p1.assignPet(new Dog(1,"TRex"));
		Person p2 = new Student("Informational Systems", "Marcus", 21);
		p2.assignPet(new Cat(1,"Galaxy Destroyer"));
		Person p3 = new PhDStudent("Engineering in Oil producing", "Jane", 25);
		Animal a = new Fish(2,"Ado");
		p3.assignPet(a);
		Person p4 = new Employee("Space Engineer", "Xeno", 31);
		Person p5 = new Student("City Building", "Roman", 20);
		Person p6 = new PhDStudent("Quantum Physics in complex computations", "Nikita", 24);
		pr1.addPerson(p1);
		pr1.addPerson(p2);
		pr1.addPerson(p3);
		pr1.addPerson(p4);
		pr1.addPerson(p5);
		pr1.addPerson(p6);

//		System.out.println("WITHOUT PETS");
//		for(Person p :pr1.personsWithoutPets()) {
//			System.out.println(p);
//			System.out.println('\n');
//		}
		
		p3.leavePetWith(p5);
		
		pr1.printDetails();
		
		p3.returnPetFrom(p5);	
		
		System.out.println("WITH PETS");
		for(Person p :pr1.personsWithPets()) {
			System.out.println(p);
			System.out.println('\n');
		}
	}
}
