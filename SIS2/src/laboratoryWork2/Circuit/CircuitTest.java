package laboratoryWork2.Circuit;

public class CircuitTest {

	public static void main(String[] args) {
		Circuit a = new Resistor(3.0);
		Circuit b = new Resistor(3.0);
		Circuit c = new Resistor(6.0);
		Circuit d = new Resistor(3.0);
		Circuit e = new Resistor(2.0);
		Circuit f = new Series(a, b);
		Circuit g = new Parallel(c, d);
		Circuit h = new Series(g, e);
		Circuit circuit = new Parallel(h, f);
		circuit.applyPotentialDiff(2.0);
		double R = circuit.getResistance();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(circuit);
	}

}
