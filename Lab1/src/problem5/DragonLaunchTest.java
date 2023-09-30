package problem5;

public class DragonLaunchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person('G');
		DragonLaunch dragon = new DragonLaunch();
		for (int i = 0; i < 3; i++) {
			dragon.kidnap(p1);
		}
		for (int i = 0; i < 3; i++) {
			dragon.kidnap(p2);
		}
		System.out.println(dragon.willDragonEatOrNot());
	}

}
