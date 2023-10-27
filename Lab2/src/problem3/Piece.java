package problem3;

public abstract class Piece {
	Position a;
	
	public Piece(Position a) {
		this.a = a;
	}
	
	public abstract boolean isLegalMove(Position a, Position b);
	
	public String toString() {
		return " on " + a.toString();
	}
}
