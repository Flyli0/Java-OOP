package laboratoryWork2.checkmateTask;


public class King extends Piece{

	@Override
	public boolean isLegalMove(Position b) {
		if(b.isFreeOfAllies()) {
			int dx = Math.abs(a.getX()-b.getX());
			int dy = Math.abs(a.getY()-b.getY());
			
			if(dx == 0 && dy == 0) {
				return false;
			}
		}
		return false;
	}
	
}
