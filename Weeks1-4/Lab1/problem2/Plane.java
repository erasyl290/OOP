package problem2;

public class Plane {
	public static final String runway = "Almaty airport runway";
	public static boolean airportOpened;
	static int quantity, letter, number;
	private String name;
	public String planeStatus, pilot;
	public Flight flight;

	{
		name = (char) letter + Integer.toString(++number);
		if ((number - 9) * 0.1 + 1 == ++quantity) {
			number -= 9;
			if (++letter == 91) {
				letter = 65;
				number += 10;
			}
		}
	}

	Plane() {
		flight = null;
	}

	Plane(Flight flight) {
		this.flight = flight;
	}

	Plane(Flight flight, String pilot) {
		this(flight);
		this.pilot = pilot;
	}

	void fly() {
		planeStatus = "Plane is not in Almaty ";
	}

	void fly(Flight flight) {
		planeStatus = "Plane has departured on " + flight;
	}

	public String toString() {
		return name;
	}
}

enum Flight {
	ASTANA, AKTOBE, KARAGANDA, SHYMKENT
}
