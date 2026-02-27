package laboratoryWork2.checkmateTask;

public class Pawn extends Piece{

	@Override
	public boolean isLegalMove(Position b) {
		int dx = (a.getX()-b.getX());
		int dy = (a.getY()-b.getY());
		if(b.isFreeOfAllies()) {
			if(dy == 0 && dx == 1)return true;
		}
		return false;
	}
}
