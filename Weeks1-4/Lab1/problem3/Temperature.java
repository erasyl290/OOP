package problem3;

public class Temperature {
	private double temp;
	private char scale;
	
	public char getScale() {
		return scale;
	}

	public void setDegree(double temp) {
		this.temp = temp;
	}

	public void setScale(char scale) {
		if (scale != 'C' && scale != 'F')
			System.err.println("Scale has to be in Celsius or Farenheit (C or F)");
		this.scale = scale;
	}
	
	public void setTemp(double temp, char scale) {
		setDegree(temp);
		setScale(scale);
	}

	Temperature() {
		scale = 'C';
	}

	Temperature(double temp) {
		this();
		this.temp = temp;
	}

	Temperature(char scale) {
		this.scale = scale;
	}

	Temperature(double temp, char scale) {
		this.temp = temp;
		this.scale = scale;
	}

	public Temperature inCelsius() {
		if (scale == 'F') {
			double temp = this.temp;
			temp = 5 * (temp - 32) / 9;
			Temperature result = new Temperature(temp);
			return result;
		}
		return this;
	}

	public Temperature inFarenheit() {
		if (scale == 'C') {
			double temp = this.temp;
			temp = 9 * temp / 5 + 32;
			Temperature result = new Temperature(temp, 'F');
			return result;
		}
		return this;
	}
	
	public String toString() {
		return temp + " " + scale;
	}
}
