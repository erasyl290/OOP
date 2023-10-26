package practice4;

public class Triangle extends Shape {
	public int size;

	public Triangle() {
		super();
		size = 5;
	}
	
	public Triangle(int size) {
		super();
		this.size = size;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for (int dx = 0; dx < size - 1; dx++) {
			int pos = super.pos + size - 1;
			for (int i = 0; i < pos - dx; i++)
				System.out.print(' ');
			System.out.print('*');

			for (int i = 0; i < dx * 2 - 1; i++)
				System.out.print(' ');
			if (dx != 0)
				System.out.print('*');
			System.out.println();
		}
		for (int i = 0; i < pos; i++)
			System.out.print(' ');
		for (int i = 0; i < size; i++)
			System.out.print("* ");
	}

	public String toString() {
		return "Triangle --" + "   Size: " + size + "   " + super.toString();
	}
}
