package problem1;

public class Sphere extends Shapes3D {
	public double radius;
	
	public Sphere() {
		radius = 5;
	}
	
	public Sphere(double radius) {
		this.radius = radius;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 4 * Math.PI * Math.pow(radius, 3) / 3;
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
	public String toString() {
		return "Sphere with radius " + radius + ". " + super.toString();
	}
}
