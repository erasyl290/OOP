package problem3;

public class Pawn extends Piece {

	public Pawn(Position a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isLegalMove(Position a, Position b) {
		// TODO Auto-generated method stub
		return ((b.y - a.y == 1) || a.y == 2 && b.y == 4) && (a.x == b.x);
	}
	
	public String toString() {
		return "Pawn" + super.toString();
	}
}
