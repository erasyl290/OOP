package practice6;

public class Student extends Person implements CanHavePizza {
	private String program;
	private int year;
	private double fee;

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Student() {
	}

	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	@Override
	public void eatPizza(Restaurant r, int size) {
		// TODO Auto-generated method stub
		double cost = 0;
		if (size == 10)
			cost = 1000;
		else if (size == 20)
			cost = 2000;
		else if (size == 30)
			cost = 3000;
		else
			System.err.println("No current size of pizza is available");
		fee -= cost;
		r.addFee(cost);
	}

	public String toString() {
		return super.toString() + "Program: " + program + "   Year: " + year + "   Fee: " + fee + "\n";
	}
}
