package problem1;

public abstract class Shapes3D {
	public double x, y, z;
	
	public abstract double volume();

	public abstract double surfaceArea();
	
	public void set(double x) {
		this.x = x;
	}
	
	public void set(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void set(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void move(double dx) {
		this.x += dx;
	}
	
	public void move(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public void move(double dx, double dy, double dz) {
		this.x += dx;
		this.y += dy;
		this.z += dz;
	}
	
	public String toString() {
		return "Volume - " + volume() + ", surface area - " + surfaceArea() + ", coordinates - (" + x + "; " + y + "; " + z + ")";
	}
}
