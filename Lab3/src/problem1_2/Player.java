package problem1_2;

public class Player extends Entity implements Controllable, Bounces, Fights, Cloneable {
	public int damage;
	public Entity entity;
	public final int speed = 3;

	public Player() {
		damage = 10;
	}

	public Player(int dmg) {
		damage = dmg;
	}

	public Player(int hp, int dmg) {
		this(dmg);
		healthBar = hp;
	}

	@Override
	public void interaction(Entity e) {
		// TODO Auto-generated method stub
		entity = e;
	}

	@Override
	public void move(boolean free) {
		// TODO Auto-generated method stub
		if (free)
			x += speed;
	}

	public void move() {
		x -= speed;
	}

	@Override
	public void bounce() {
		// TODO Auto-generated method stub
		double accelerator = 1.5, change = 0.5;
		System.out.println("\nBounce coordinates (y)...");
		for (double i = accelerator; i > 0; i -= change) {
			y += i;
			System.out.println(y);
		}
		System.out.println("Top point");
		for (double i = 0; i <= accelerator; i += change) {
			y -= i;
			System.out.println(y);
		}
		System.out.println("Landed...\n");
	}

	@Override
	public void toggles(int toggle) {
		// TODO Auto-generated method stub
		if (toggle == 1)
			move(true);
		else if (toggle == 2)
			move();
		else if (toggle == 3)
			bounce();
	}

	@Override
	public void atack() {
		// TODO Auto-generated method stub
		if (entity instanceof Damageable)
			entity.healthBar -= damage;
	}

	@Override
	public String toString() {
		return "Player [damage=" + damage + ", toString()=" + super.toString() + "]";
	}

	public Object clone() throws CloneNotSupportedException {
		Player p = (Player) super.clone();
		p.id = ++quantity;
		return p;
	}
}
