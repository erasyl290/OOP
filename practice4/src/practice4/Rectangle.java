package practice4;

public class Rectangle extends Shape {
	public int length, width;

	public Rectangle() {
		super();
		length = 10;
		width = 5;
	}
	
	public Rectangle(int a, int b) {
		super();
		length = a;
		width = b;
	}

	private void position() {
		for (int dx = 0; dx < super.pos; dx++)
			System.out.print(' ');
	}

	private void length() {
		for (int dx = 0; dx < length; dx++)
			System.out.print("* ");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		position();
		if (width > 0)
			length();
		System.out.println();
		
		for (int dy = 0; dy < width - 2; dy++) {
			position();
			System.out.print('*');
			for (int dx = 0; dx < length * 2 - 3; dx++)
				System.out.print(' ');
			System.out.println('*');
		}
		position();
		if (width > 1)
			length();
		System.out.println();
	}

	public String toString() {
		return "Rectangle --" + "   Length: " + length + "   Width: " + width + "   " + super.toString();
	}
}
