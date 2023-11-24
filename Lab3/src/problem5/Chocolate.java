package problem5;

public class Chocolate implements Comparable<Chocolate> {
	public double weight;
	public String name;
	
	public Chocolate(double weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	
	public String toString() {
		return "Name: " + name + "   Weight: " + weight;
	}
	
	public int compareTo(Chocolate o) {
		if (weight > o.weight) return 1;
		if (weight < o.weight) return -1;
		return 0;
	}
}
