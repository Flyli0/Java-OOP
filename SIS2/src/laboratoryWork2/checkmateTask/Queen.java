package laboratoryWork2.checkmateTask;

public class Queen extends Piece{

	@Override
	public boolean isLegalMove(Position b) {
		if(b.isFreeOfAllies()) {
			int dx = Math.abs(a.getX()-b.getX());
			int dy = Math.abs(a.getY()-b.getY());
			if(dx == 0 && dy == 0) {
				return false;
			}
			if(dx == 0 || dy == 0)return true;
			if(dx == dy)return true;
		}
		return false;
	}
}
