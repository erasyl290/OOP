package problem1;

public class Cylinder extends Shapes3D {
	public double radius, height;

	public Cylinder() {
		radius = 5;
		height = 12;
	}

	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * Math.pow(radius, 2) * height;
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius * height;
	}

	public String toString() {
		return "Cylinder with radius " + radius + " and height " + height + ". " + super.toString();
	}
}
