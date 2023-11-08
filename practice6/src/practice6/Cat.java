package practice6;

public class Cat extends Animal implements CanHavePizza{
	public String name;
	public int age;

	public void setAge(int age) {
		this.age = age;
	}

	{
		super.setType(EatType.CARNIVORE);
		super.setWakes(AwakeTime.DAY);
	}

	public Cat() {
		super(0.1, 0.2, 0.3, 0.01, 0);
	}

	public Cat(String name) {
		this();
		this.name = name;
	}

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		grow(age);
	}

	public Cat(String name, Gender gen) {
		this();
		this.name = name;
		super.setGender(gen);
	}

	public Cat(String name, int age, Gender gen) {
		this.name = name;
		this.age = age;
		super.setGender(gen);
		grow(age);
	}

	@Override
	public String eats() {
		// TODO Auto-generated method stub
		return "Meat, Fish, Cat food, Grass (for digestion)";
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
		r.addGivenFree(cost);
	}

	public void ageChange() {
		age += 1;
	}

	public void ageChange(int years) {
		age += years;
	}
	
	private void grow(int age) {
		length += 0.1 * age;
		height += 0.05 * age;
		width += 0.01 * age;
		weight += 0.5 * age;
	}
	
	public void grow() {
		length += 0.1;
		height += 0.05;
		width += 0.01;
		weight += 0.5;
	}


	public void grow(double w) {
		length += 0.1;
		height += 0.05;
		width += 0.01;
		weight = w;
	}

	public void grow(int years, double w) {
		ageChange(years);
		weight = w;
	}

	public void speedChange(double s) {
		speed += s;
	}

	public void speedNew(double s) {
		speed = s;
	}

	public String toString() {
		return "Name: " + name + "   Age: " + age + "\n" + super.toString();
	}
}
