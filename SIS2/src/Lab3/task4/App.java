package Lab3.task4;

import java.util.Date;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person("Nick",41);
		Date hd = new Date(2024,5,12);
		Date hd2 = new Date(2021,8,8);
		Date hd3 = new Date(2012,6,8);
		Employee e1 = new Employee("John", 18,15000.5,hd,"1e29k11a");
		Employee e2 = new Employee("Janet", 20, 19500.00,hd2,"12jdh3la90");
		Employee e3 = (Employee) e1.clone();
		Manager m = new Manager("Arnold", 45, 52000.00, hd3, "000MMM1j");
		m.addTeammate(e3);
		m.addTeammate(e1);
		m.addBonus(5000.0);
		Manager m2 =  new Manager("Silvester", 39, 52111.22, hd3, "111RRR22www");
		Manager m3 = (Manager) m.clone();
		Manager m4 =  m2;
		System.out.println("----------------Employees------------");
		System.out.println(e1.toString() + "\n\n" + e2.toString() + '\n');
		System.out.println(e1.equals(e3));
		System.out.println(e1.compareTo(e2));
		System.out.println("================ Managers ==============");
		System.out.println(m.toString());
		System.out.println(m.equals(m2));
		System.out.println(m4.equals(m2));
		System.out.println(m.compareTo(m3));
	}

}
