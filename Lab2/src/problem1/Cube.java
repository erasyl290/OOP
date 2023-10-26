package problem1;

public class Cube extends Shapes3D {
	public double size;
	
	public Cube() {
		size = 5;
	}
	
	public Cube(double size) {
		this.size = size;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return Math.pow(size, 3);
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return 6 * Math.pow(size, 2);
	}
	
	public String toString() {
		return "Cube with size " + size + ". " + super.toString();
	}
}
