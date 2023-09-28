package problem1;

import java.util.Scanner;

public class PrintMyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("Write your name: ");
		String name = in.nextLine();
		in.close();

		MyName result = new MyName(name);
		System.out.print(result);
	}

}
