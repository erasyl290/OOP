package problem1;

public class TestShapes3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cylinder = new Cylinder(3, 10);
		cylinder.move(3.75);
		System.out.println(cylinder);
		
		Sphere sphere = new Sphere();
		sphere.set(4, 2.5);
		System.out.println(sphere);
		
		Cube cube = new Cube(4);
		cube.move(1, 1, 3.3);
		System.out.println(cube);
	}

}
