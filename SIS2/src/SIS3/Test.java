package SIS3;
import java.util.Scanner;
import java.util.Vector;
public class Test {

	public static void main(String[] args) {
	Vector<Person> people = new Vector<>();
	int s;
	Person p = new Person("f","f1");
	Scanner scn = new Scanner(System.in);
	while(true) {
		System.out.println("To insert new Person insert 1, to output all people insert 2, to exit insert 3");
		s = scn.nextInt();
		if(s == 1) {
			String name = scn.next();
			String address = scn.next();
			System.out.println("If you are Student insert 1, if you are an Employee: 2, if none of this insert 3");
			int c = scn.nextInt();
			if(c == 1) {
				String program = scn.next();
				int year = scn.nextInt();
				double fee = scn.nextDouble();
				p = new Student(name,address,program,year,fee);
			}
			else if(c == 2) {
				String school = scn.next();
				double pay = scn.nextDouble();
				p = new Employee(name,address,school,pay);
			}
			else if(c == 3) {
				p = new Person(name,address);
			}
		people.add(p);
		}
		else if(s == 2) {
			for(Person pipl : people){
				System.out.println(pipl);
			}
			}
		else if(s ==3) {
			break;
			}
		else {
			System.out.println("Wrong input");
			}
		}
	}
}
