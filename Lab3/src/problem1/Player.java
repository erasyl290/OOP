package problem1;

public class Player extends Entity implements Fights, Cloneable {
	public int damage;
	public Entity entity;

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
	public void atack() {
		// TODO Auto-generated method stub
		if (entity instanceof Damageable)
			entity.healthBar -= damage;
	}

	@Override
	public String toString() {
		return "Player [damage=" + damage + ", toString()=" + super.toString() + "]";
	}
	
	public Object clone() throws CloneNotSupportedException{
		Player p = (Player) super.clone();
		p.id = ++quantity;
		return p;
	}
}
