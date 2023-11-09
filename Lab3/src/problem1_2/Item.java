package problem1_2;

public class Item extends Entity implements Moveable {
	public Entity entity;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interaction(Entity e) {
		// TODO Auto-generated method stub
		e.interaction(this);
		entity = e;
	}

	@Override
	public void move(boolean free) {
		// TODO Auto-generated method stub
		if (free) {
			x = entity.x;
			y = entity.y;
		}
	}

	@Override
	public String toString() {
		return "Item [toString()=" + super.toString() + "]";
	}
}
