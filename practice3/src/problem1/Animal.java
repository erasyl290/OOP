package problem1;

public abstract class Animal {
	public static EatType type;
	public static AwakeTime wakes;
	public Gender gender;
	public double length, height, width, weight, speed;

	public Animal() {
	}

	public void setType(EatType type) {
		Animal.type = type;
	}

	public void setWakes(AwakeTime wakes) {
		Animal.wakes = wakes;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setTypeGender(EatType t, Gender g) {
		setType(t);
		setGender(g);
	}

	public void setTypeWakes(EatType t, AwakeTime ws) {
		setType(t);
		setWakes(ws);
	}

	public void setTypeWakesGender(EatType t, AwakeTime ws, Gender g) {
		setTypeWakes(t, ws);
		setGender(g);
	}
	
	public Animal(double l, double h, double wd) {
		length = l;
		height = h;
		width = wd;
	}

	public Animal(double w, double s) {
		weight = w;
		speed = s;
	}

	public Animal(EatType t, double w, double s) {
		this(w, s);
		setType(t);
	}

	public Animal(EatType t, double l, double h, double wd) {
		this(l, h, wd);
		setType(t);
	}

	public Animal(double l, double h, double wd, double w, double s) {
		this(l, h, wd);
		weight = w;
		speed = s;
	}
	
	public Animal(EatType t, double l, double h, double wd, double w, double s) {
		this(l, h, wd, w, s);
		setType(t);
	}
	
	public void grow(double l, double h, double wd, double w, double s) {
		length += l;
		height += h;
		width += wd;
		weight += w;
		speed += s;
	}
	
	public abstract String eats();
	
	public String toString() {
		return "Type: " + type + "   Awake on: " + wakes + "   Gender: " + gender +
				"\nLength: " + length + "  Height: " + height + "  Width: " + width + "  Weight: " + weight + "  Speed: " + speed + "\n";
	}
}

enum EatType {
	HERBIORE, CARNIVORE, OMNIVORE
}

enum AwakeTime {
	DAY, NIGHT
}

enum Gender {
	MALE, FEMALE, BOTH, NONE
}