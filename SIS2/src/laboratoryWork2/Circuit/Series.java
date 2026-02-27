package laboratoryWork2.Circuit;

public class Series extends Circuit{
	private Circuit c1,c2;
	
	
	public Series(Circuit c1, Circuit c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	@Override
	public double getResistance() {
		double res = 0;
		res = this.c1.getResistance() + this.c2.getResistance();
		return res;
	}

	@Override
	public double getPotentialDiff() {
		double res = this.c1.getPotentialDiff() + this.c2.getPotentialDiff();
		return res;
	}

	@Override
	public void applyPotentialDiff(double V) {
		this.c1.potentialDifference = V;
		this.c2.potentialDifference = V;
	}
	
}
