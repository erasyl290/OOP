package problem1_2;

public class Wall extends Entity {

	public Wall() {
		// TODO Auto-generated constructor stub
	}

	public Wall(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interaction(Entity entity) {
		// TODO Auto-generated method stub
		double entityLeft = entity.x - entity.width / 2, entityRight = entity.x + entity.width / 2,
				entityUp = entity.y + entity.height / 2, entityDown = entity.y - entity.height / 2;
		double thisLeft = this.x - this.width / 2, thisRight = this.x + this.width / 2,
				thisUp = this.y + this.height / 2, thisDown = this.y - this.height / 2;
		if (entity instanceof Moveable) {
			Moveable action = (Moveable) entity;
			while ((entityRight == thisLeft || entityLeft == thisRight) && entityDown <= thisUp && entityUp >= thisDown)
				action.move(false);
		}
	}

	@Override
	public String toString() {
		return "Wall [toString()=" + super.toString() + "]";
	}
}
