package laboratoryWork2.Circuit;

public class Parallel extends Circuit{
	private Circuit c1,c2;
	
	public Parallel(Circuit c1, Circuit c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public double getResistance() {
		double res = (this.c1.getResistance()*this.c2.getResistance())/(this.c1.getResistance()+this.c2.getResistance()); 
		return res;
	}

	@Override
	public double getPotentialDiff() {
		return this.c1.potentialDifference;
	}

	@Override
	public void applyPotentialDiff(double V) {
		this.c1.potentialDifference = V;
		this.c2.potentialDifference = V;
	}

}
