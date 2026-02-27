package laboratoryWork2.Circuit;

public abstract class Circuit {
	protected double potentialDifference;
	protected double resistance;
	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double V);
	
	public double getPower() {
		return Math.pow(this.getPotentialDiff(), 2)/this.getResistance();
	}
	public double getCurrent() {
		return this.getPotentialDiff()/this.getResistance();
	}
	
	@Override 
	public String toString() {
		return " Resistance :" + this.getResistance() + "\n Potential Difference: " + this.getPotentialDiff() + "\n Current: " + this.getCurrent();
	}
}
