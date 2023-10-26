package practice4;

public abstract class Shape {
	public int pos;
	public Color clr;

	public Shape() {
		clr = Color.BLACK;
	}

	public Shape(int pos) {
		this.pos = pos;
	}

	public Shape(int pos, Color clr) {
		this.pos = pos;
		this.clr = clr;
	}

	public Shape(int pos, String clr) {
		if (clr.equals("RED"))
			this.clr = Color.RED;
		else if (clr.equals("GREEN"))
			this.clr = Color.GREEN;
		else if (clr.equals("BLUE"))
			this.clr = Color.BLUE;
		else
			this.clr = Color.BLACK;
	}

	public void draw(int pos) {
		this.pos = pos;
		draw();
	}
	public abstract void draw();
	

	public String toString() {
		return "Position: " + pos + "   Color: " + clr;
	}
}

enum Color {
	RED, GREEN, BLUE, BLACK
};