package laboratoryWork2.Circuit;

public class Resistor extends Circuit{
	
	public Resistor(double resistance) {
		this.resistance = resistance;
	}

	@Override
	public double getResistance() {
		return this.resistance;
	}

	@Override
	public double getPotentialDiff() {
		return this.potentialDifference;
	}

	@Override
	public void applyPotentialDiff(double V) {
		this.potentialDifference = V;
	}

}
