package laboratoryWork2.checkmateTask;

public class Position {
	private int coordinateX;
	private char coordinateY;
	private boolean takenByAllies;
	public Position() {
		this.coordinateX = 1;
		this.coordinateY = 'a';
	}
	
	public Position(int x, char y) {
		this.coordinateX = x;
		this.coordinateY = y;
	}
	
	public String toString() {
		return "Position: " + this.coordinateX + ";" + this.coordinateY;
 	}
	
	public int getX() {
		return this.coordinateX;
	}
	
	public char getY() {
		return this.coordinateY;
	}
	
	public boolean isFreeOfAllies() {
		return !takenByAllies;
	}
}
