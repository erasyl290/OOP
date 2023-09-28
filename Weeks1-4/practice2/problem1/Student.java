package problem1;

public class Student {
	public String name;
	public int id;
	public int year;
	public static int quantity;

	Student() {
		id += ++quantity;
	}

	Student(String name) {
		this();
		this.name = name;
	}
	
	Student(String name, int year){
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
