package problem3;

public class Bishop extends Piece {

	public Bishop(Position a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isLegalMove(Position a, Position b) {
		// TODO Auto-generated method stub
		return b.x == b.y;
	}
	
	public String toString() {
		return "Bishop" + super.toString();
	}
}
