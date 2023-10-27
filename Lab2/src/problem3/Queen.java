package problem3;

public class Queen extends Piece {

	public Queen(Position a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isLegalMove(Position a, Position b) {
		// TODO Auto-generated method stub
		return b.x == b.y || b.x == a.x || b.y == a.y;
	}
	
	public String toString() {
		return "Queen" + super.toString();
	}
}
