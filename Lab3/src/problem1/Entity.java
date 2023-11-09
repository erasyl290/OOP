package problem1;

public abstract class Entity {
	public static int quantity;
	public int healthBar = 1, height, width;
	public double x, y;
	protected int id;
	
	public void setPosition(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setSize(int a, int b) {
		height = a;
		width = b;
	}
	
	public int getId() {
		return id;
	}
	
	public Entity() {
		id = ++quantity;
	}
	
	public Entity(int hp) {
		this();
		healthBar = hp;
	}
	
	public Entity(int a, int b) {
		this();
		setSize(a, b);
	}
	
	public Entity(int hp, int a, int b) {
		this(hp);
		setSize(a, b);
	}

	public void move(double dx) {
		this.x += dx;
	}
	
	public void move(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public abstract void interaction(Entity e);

	@Override
	public String toString() {
		return "Entity" + id + " [healthBar=" + healthBar + ", length=" + height + ", width=" + width + ", x=" + x
				+ ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Entity))
			return false;
		Entity other = (Entity) obj;
		return id == other.id;
	}
}
