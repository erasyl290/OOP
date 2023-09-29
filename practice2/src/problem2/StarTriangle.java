package problem2;

public class StarTriangle {
	public String sign = "[*]";
	public String triangle = "";

	StarTriangle() {
	}

	StarTriangle(int width) {
		for (int i = 0; i < width; i++) {
			for (int k = -1; k < i; k++) {
				triangle += sign;
			}
			triangle += "\n";
		}
	}
	
	public String toString() {
		return triangle;
	}
}
