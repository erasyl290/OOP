package problem3;

public class King extends Piece {

	public King(Position a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isLegalMove(Position a, Position b) {
		// TODO Auto-generated method stub
		return Math.max(a.x, b.x) - Math.min(a.x, b.x) <= 1 &&
				Math.max(a.y, b.y) - Math.min(a.y, b.y) <= 1;
	}
	
	public String toString() {
		return "King" + super.toString();
	}
}
