package problem4;

import problem1.Student;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course = new Course("OOP", "Object-Oriented Programming");
		GradeBook gradeBook = new GradeBook(course);
		gradeBook.displayMessage();
		
		Map<Student, Integer> students = new HashMap<Student, Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter grades with student names: ");
		for(int i = 0; i < 5; i++) {
			students.put(new Student(in.next()), in.nextInt());
		}
		System.out.print("How many charts create? ");
		int n = in.nextInt();
		in.close();
		
		gradeBook = new GradeBook(students);
		gradeBook.displayGradeReport(n);
		System.out.println(gradeBook);
		System.out.println(course);
	}

}
