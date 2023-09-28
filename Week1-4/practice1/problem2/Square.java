package problem2;

public class Square {
	public int side, area, perimeter;
	public double diagonal;

	Square() {
	}

	Square(int side) {
		area = side * side;
		perimeter = side * 4;
		diagonal = side * Math.sqrt(2);
	}

	public String toString() {
		return "Area = " + area + "\n" + "Perimeter = " + perimeter + "\n" + "Diagonal = " + diagonal;
	}
}
