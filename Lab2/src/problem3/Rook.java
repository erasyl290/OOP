package problem3;

public class Rook extends Piece {

	public Rook(Position a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isLegalMove(Position a, Position b) {
		// TODO Auto-generated method stub
		return b.x == a.x || b.y == a.y;
	}
	
	public String toString() {
		return "Rook" + super.toString();
	}
}
