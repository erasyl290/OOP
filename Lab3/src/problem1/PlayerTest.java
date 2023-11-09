package problem1;

public class PlayerTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Player p = new Player(100, 25);
		p.setPosition(10, 5);
		p.setSize(5, 2);
		Player p2 = (Player) p.clone();
		p.interaction(p2);
		p.atack();
		System.out.println(p + "\n" + p2);
		
		Wall wall = new Wall();
		p.interaction(wall);
		p.atack();
		System.out.println(wall);
	}

}
