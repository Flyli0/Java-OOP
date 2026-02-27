package laboratoryWork2.checkmateTask;

public class Bishop extends Piece{

	@Override
	public boolean isLegalMove(Position b) {
		if(b.isFreeOfAllies()) {
			int dx = Math.abs(a.getX()-b.getX());
			int dy = Math.abs(a.getY()-b.getY());
			if(dx==dy)return true;
		}
		return false;
	}
	
}
