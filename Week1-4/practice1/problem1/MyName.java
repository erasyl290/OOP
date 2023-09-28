package problem1;

public class MyName {
	public String name;

	MyName() {
		name = "+---+\n|aaa|\n+---+";
	}

	MyName(String name) {
		String dashes = "";
		for (int i = 0; i < name.length(); i++) {
			dashes += "-";
		}
		this.name = '+' + dashes + "+\n|" + name + "|\n+" + dashes + '+';
	}

	public String toString() {
		return name;
	}
}
