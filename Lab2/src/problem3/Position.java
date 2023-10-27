package problem3;

public class Position {
	int x, y;

	public Position(int x, int y) {
		if (x > 0 && x < 9 && y > 0 && y < 9) {
			this.x = x;
			this.y = y;
		} else
			System.err.println("Out of board");
	}

	public Position(char x, int y) {
		if (x > 64 && x < 73)
			this.x = x - 64;
		else if (x > 96 && x < 104)
			this.x = x - 96;
		else
			System.err.println("Out of board");
		if (y > 0 && y < 9)
			this.y = y;
		else
			System.err.println("Out of board");
	}

	public String toString() {
		return x + "" + y;
	}
}
