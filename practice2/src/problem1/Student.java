package problem1;

public class Student {
	public String name;
	public int id;
	public int year;
	public static int quantity;

	public Student() {
		id += ++quantity;
	}

	public Student(String name) {
		this();
		this.name = name;
	}
	
	public Student(String name, int year){
		this(name);
		this.year = year;
	}
	
	public boolean equals(Student student) {
		return id == student.id;
	}
	
	public String toString() {
		return id + " " + name + ' ' + year;
	}
}
