package Lab3.task1;

import java.util.ArrayList;
import java.util.List;

public class app {

	public static void main(String[] args) {
		List<Animal> a = new ArrayList<Animal>();
		ArrayList<Movable> b = new ArrayList<Movable>();
		Cat c = new Cat("Meowl", 2, "Brown");
		Car c1 = new Car(70.0, 20.0, "Carrrr");
		a.addLast(c);
		//a.add(c1) causes Checked exception 
		b.add(c);
		b.add(c1);
		for(Movable m: b) {
			System.out.println(m);
		}
	}

}
