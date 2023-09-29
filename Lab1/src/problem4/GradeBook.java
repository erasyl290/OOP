package problem4;

import problem1.Student;
import java.util.Map;

public class GradeBook {
	Course course;
	Map<Student, Integer> students;

	GradeBook() {
	}

	GradeBook(Course course) {
		this.course = course;
	}

	GradeBook(Map<Student, Integer> students) {
		this.students = students;
	}

	GradeBook(Course course, Map<Student, Integer> students) {
		this(students);
		this.course = course;
	}

	GradeBook(Map<Student, Integer> students, Course course) {
		this(course, students);
	}

	public void displayMessage() {
		System.out.println("Welcome to the grade book of " + course.name + '!' +" Desription of a course: " + course.description);
	}

	public double determineClassAverage() {
		double sum = 0;
		int quantity = 0;
		for (Map.Entry<Student, Integer> item : students.entrySet()) {
			sum += item.getValue();
			quantity++;
		}
		return sum / quantity;
	}

	public String determineClassLowest() {
		Student holder = null;
		int min = Integer.MAX_VALUE;
		for (Map.Entry<Student, Integer> item : students.entrySet()) {
			if (min > item.getValue())
				min = item.getValue();
			holder = item.getKey();
		}
		return String.format("%s (%s, id=%s)", min, holder.name, holder.id);
	}

	public String determineClassBest() {
		Student holder = null;
		int max = Integer.MIN_VALUE;
		for (Map.Entry<Student, Integer> item : students.entrySet()) {
			if (max < item.getValue()) {
				max = item.getValue();
				holder = item.getKey();
			}
		}
		return String.format("%s (%s, id=%s)", max, holder.name, holder.id);
	}

	public void outputBarChart(int n) {
		int left = 0;
		int right = 100 / n - 1;
		String result = "Grade distribution:\n";
		for (int i = 0; i < n; i++) {
			
			if (left != right)
				result += left + "-" + right + ": ";
			else
				result += right + ": ";
			
			for (Map.Entry<Student, Integer> item : students.entrySet()) {
				if (item.getValue() <= right && item.getValue() >= left)
					result += '*';
			}
			
			right += 100 / n;
			if (i != n - 2 || right == 99)
				left += 100 / n;
			else {
				left = right;
				right = 99;
			}
			
			result += "\n";
		}
		result += "100: ";
		for (Map.Entry<Student, Integer> item : students.entrySet()) {
			if (item.getValue() == 100)
				result += '*';
		}
		System.out.println(result + "\n");
	}

	public void displayGradeReport(int n) {
		System.out.println("Class Average = " + determineClassAverage());
		System.out.println("Lowest grade is " + determineClassLowest());
		System.out.println("Best grade is " + determineClassBest());
		outputBarChart(n);
	}
	
	public String toString() {
		String result = "";
		for(Map.Entry<Student, Integer> item : students.entrySet()) {
			result += item.getKey() + " - " + item.getValue() + "\n";
		}
		return result;
	}
}
