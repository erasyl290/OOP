package practice4;

public class Circle extends Shape {
	public int radius;

	public Circle() {
		super();
		radius = 5;
	}

	public Circle(int r) {
		super();
		radius = r;
	}
	
	private void edge() {
		for (int i = 0; i < super.pos + radius - 2; i++)
			System.out.print(' ');
		for (int dx = 0; dx < radius - 2; dx++)
			System.out.print("* ");
		System.out.println();
	}

	private void half(int dx) {
		int pos = super.pos + radius - 4;
		for (int i = 0; i < pos - dx; i++)
			System.out.print(' ');
		System.out.print('*');
		
		for (int i = 0; i < radius * 2 + dx * 2 - 3; i++)
			System.out.print(' ');
		System.out.println('*');
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		edge();
		for (int dx = 0; dx < radius / 2 - 1; dx++)
			half(dx);
		for (int dx = radius / 2 - 1; dx >= 0 ; dx--)
			half(dx);
		edge();
	}

	public String toString() {
		return "Circle --" + "   Radius: " + radius + "   " + super.toString();
	}
}
