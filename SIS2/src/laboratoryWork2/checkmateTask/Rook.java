package laboratoryWork2.checkmateTask;

public class Rook extends Piece{
	public Rook(Position a) {
		this.a = a;
	}
	@Override 
	public boolean isLegalMove(Position b){
		if(b.isFreeOfAllies()) {
			if(b.getX() == this.a.getX() && b.getY() == this.a.getY())return false;
			if(b.getX() == this.a.getX())return true;
			if(b.getY() == this.a.getY())return true;
		}
		return false;
	}
}
