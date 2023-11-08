package practice6;

public class CanHavePizzaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant r = new Restaurant("Krapiva", "Morrison", "Momish-uli, Shalyapina");
		System.out.println(r);
		Cat c = new Cat();
		Student s = new Student("Yerasyl Baymukhan", "Momish-uli, Shalyapina", "IS", 2, 42000);
		System.out.println("\n" + s);
		s.eatPizza(r, 20);
		System.out.println("Pizza is sold!");
		c.eatPizza(r, 10);
		System.out.println("Pizza is given free!\n");
		s.eatPizza(r, 15);
		System.out.println(s);
		System.out.println(r);
	}

}
