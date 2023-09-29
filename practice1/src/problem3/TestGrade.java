package problem3;

import java.util.Scanner;

public class TestGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("Write your percentage: ");
		int percentage = in.nextInt();
		in.close();
		
		Grade grade = new Grade();
		grade.setGrade(percentage);
		System.out.println(grade.getGrade());
	}

}
