package problem1;

public class DVD extends LibraryItem {
	private double memory;
	public double duration;
	
	public void setMemory(double memory) {
		this.memory = memory;
	}
	
	public double getMemory() {
		return memory;
	}
	
	public DVD() {
		super();
	}
	
	public DVD(String title) {
		super(title);
	}
	
	public DVD(String title, String author) {
		super(title, author);
	}
	
	public DVD(String title, double memory, double duration) {
		this(title);
		setMemory(memory);
		this.duration = duration;
	}
	
	public DVD(String title, String author, double memory, double duration) {
		this(title, memory, duration);
		super.author = author;
	}
	
	public DVD(String title, String author, double memory, double duration, int year) {
		this(title, author, memory, duration);
		super.year = year;
	}
	
	public void accelerate(double value) {
		duration /= value;
	}
	
	public void decelerate(double value) {
		duration *= value;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return "Have additional fields: memory (kb), time duration (min). Can be accelerated or decelerated";
	}
	
	public String toString() {
		return "DVD " + super.toString() + "Time duration (min): " + duration;
	}
}
