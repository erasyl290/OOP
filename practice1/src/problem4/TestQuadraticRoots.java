package problem4;

import java.util.Scanner;

public class TestQuadraticRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		int a = in.nextInt();
		
		System.out.print("Enter b: ");
		int b = in.nextInt();
		
		System.out.print("Enter c: ");
		int c = in.nextInt();
		
		in.close();
		
		SquareRoot roots = new SquareRoot(a, b, c);
		System.out.println(roots);
	}

}
