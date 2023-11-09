package problem1_2;

public class PlayerTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Player p = new Player(100, 25);
		p.setPosition(10, 5);
		p.setSize(5, 2);
		System.out.println(p);
		
		Player p2 = (Player) p.clone();
		p.interaction(p2);
		p.atack();
		System.out.println("\np2: -25 hp\n\n" + p2);
		
		Wall wall = new Wall();
		p.interaction(wall);
		p.atack();
		System.out.println(wall);
		
		for(int i = 0; i < 10; i++) // x += 10 * 3
			p.toggles(1);
		for(int i = 0; i < 5; i++) // x -= 5 * 3
			p.toggles(2);
		p.toggles(3);
		Item i = new Item();
		i.interaction(p);
		i.move(true);
		System.out.println(i);
	}

}
