package problem1;

import java.util.Scanner;

public class Analyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		
		Scanner in = new Scanner(System.in);
		String input = "";
		while (!input.equals("Q")) {
			System.out.print("Enter number (Q to quit): ");
			
			if (in.hasNextInt())
				data.add(in.nextInt());
			else
				input = in.next();
		}
		in.close();
		
		System.out.println("Average = " + data.average());
		System.out.println("Maximum = " + data.largest());
	}

}
