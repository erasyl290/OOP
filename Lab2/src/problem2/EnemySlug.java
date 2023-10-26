package problem2;

import java.util.Objects;

public class EnemySlug extends Slug {
	public int damage;
	
	public EnemySlug() {
		super();
		damage = 100;
	}
	
	public EnemySlug(int size) {
		super.size = size;
	}
	
	public EnemySlug(int size, int damage) {
		this(size);
		this.damage = damage;
	}
	
	public void grow() {
		super.size += 150;
	}
	
	public String toString() {
		return "Mini-Slug" + super.toString() + "   Damage: " + damage;
	}
	
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		EnemySlug m = (EnemySlug) o;
		return this.damage == m.damage;
	}
	
	public int hashCode() {
		return Objects.hash(size, damage);
	}
}
