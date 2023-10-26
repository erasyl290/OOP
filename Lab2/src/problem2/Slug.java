package problem2;

import java.util.Objects;

public class Slug {
	public int size;

	public Slug() {
		size = 300;
	}

	public Slug(int size) {
		this.size = size;
	}

	public void grow() {
		size += 100;
	}

	public String toString() {
		return "  --  Size: " + size;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || !(o instanceof Slug))
			return false;
		Slug s = (Slug) o;
		return this.size == s.size;
	}

	public int hashCode() {
		return Objects.hash(size);
	}
}
