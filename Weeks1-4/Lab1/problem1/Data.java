package problem1;

public class Data {
	private double sum, maximum;
	private int quantity;
	public int value;
	
	Data(){
	}
	
	public void add(int value) {
		this.value = value;
		sum += value;
		quantity++;
		largest();
	}
	
	public double average() {
		return sum / quantity;
	}
	
	public double largest() {
		if (value > maximum)
			maximum = value;
		return maximum;
	}
}
