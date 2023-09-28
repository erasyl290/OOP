package problem2;

import java.util.Scanner;

public class TestSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("Square side: ");
		int a = in.nextInt();
		in.close();

		Square square = new Square(a);
		System.out.println(square);
	}

}
