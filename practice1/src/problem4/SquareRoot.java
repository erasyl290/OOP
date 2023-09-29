package problem4;

public class SquareRoot {
	public int a, b, c;
	public double discr, x1, x2;

	SquareRoot() {
	}

	SquareRoot(int a, int b, int c) {
		discr = b * b - 4 * a * c;
		if (discr > 0) {
			x1 = (-b - Math.sqrt(discr)) / a * 2;
			x2 = (-b + Math.sqrt(discr)) / a * 2;
		} else if (discr == 0) {
			x1 = -b / a * 2;
		} else {
			System.err.println("No roots");
			System.exit(1);
		}
	}

	public String toString() {
		if (discr == 0)
			return "Roots: " + x1;
		return "Roots: " + x1 + ", " + x2;
	}
}
