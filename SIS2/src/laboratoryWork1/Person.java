package laboratoryWork1;

public class Person {
	private Gender g;
	enum Gender{
		BOY,GIRL;
	}
	public Person(String gender) {
		if(gender.equalsIgnoreCase("boy") || gender.equalsIgnoreCase("girl")) {
				gender = gender.toUpperCase();
				g = Gender.valueOf(gender);
		}
	}
	
	public Gender getGender() {
		return g;
	}
}
