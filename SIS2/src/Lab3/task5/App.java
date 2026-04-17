package Lab3.task5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import SIS2.Time;
import Lab3.task4.Employee;

public class App {

	public static void main(String[] args) {
		System.out.println("+++++++++++++CHOCOLATE+++++++++++++");
		List<Chocolate> cl = new ArrayList<Chocolate>();
		Chocolate c1 = new Chocolate(120.58, "Hershey's");
		Chocolate c2 = new Chocolate(165.5, "AlpenGold");
		Chocolate c3 = new Chocolate(140.5, "Toblerone");
		cl.add(c3);
		cl.add(c2);
		cl.add(c1);
		Sort a = new Sort(cl);
		a.quickSort(0, cl.size()-1);
		for(Chocolate c: cl) {
			System.out.println(c);
		}
		
		System.out.println("\n_________________________TIME_______________________");
		List<Time> tl = new ArrayList<Time>();
		Time t1 = new Time(11,25,10);
		Time t2 = new Time(12,25,10);
		Time t3 = new Time(11,27,10);
		tl.add(t3);
		tl.add(t2);
		tl.add(t1);
		Sort b = new Sort(tl);
		b.quickSort(0, tl.size()-1);
		for(Time t: tl) {
			System.out.println(t.toUniversal());
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>EMPLOYEES<<<<<<<<<<<<<<<<<");
		List<Employee> el = new ArrayList<Employee>();
		Employee e1 = new Employee("Tohru", 35,1520800.5,new Date(2011,7,10),"1e2333219k11a");
		Employee e2 = new Employee("John", 18,150020.5,new Date(2024,5,12),"1e29k11a");
		Employee e3 = new Employee("Janet", 20, 19500.00,new Date(2021,5,31),"12jdh3la90");
		el.add(e3);
		el.add(e2);
		el.add(e1);
		Sort c = new Sort(el);
		c.quickSort(0,el.size()-1);
		for(Employee e: el) {
			System.out.println(e);
		}
	}

}
