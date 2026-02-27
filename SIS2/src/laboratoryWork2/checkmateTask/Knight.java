package laboratoryWork2.checkmateTask;

public class Knight extends Piece{

	@Override
	public boolean isLegalMove(Position b) {
		if(b.isFreeOfAllies()) {
			int dx = Math.abs(a.getX()-b.getX());
			int dy = Math.abs(a.getY()-b.getY());
			if(dx == 1 && dy == 2)return true;
			if(dy == 1 && dx == 2)return true;
		}
		return false;
	}

}
