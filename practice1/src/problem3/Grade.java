package problem3;

public class Grade {
	private String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(int percentage) {
		if (percentage <= 100 && percentage >= 95) {
			grade = "A+";
		} else if (percentage < 95 && percentage >= 90) {
			grade = "A";
		} else if (percentage < 90 && percentage >= 85) {
			grade = "A-";
		} else if (percentage < 85 && percentage >= 80) {
			grade = "B+";
		} else if (percentage < 80 && percentage >= 75) {
			grade = "B";
		} else if (percentage < 75 && percentage >= 70) {
			grade = "B-";
		} else if (percentage < 70 && percentage >= 65) {
			grade = "C+";
		} else if (percentage < 65 && percentage >= 60) {
			grade = "C";
		} else if (percentage < 60 && percentage >= 55) {
			grade = "C-";
		} else if (percentage < 55 && percentage >= 50) {
			grade = "F+";
		} else {
			grade = "F";
		}
	}
}
