package problem4;

public class Person {
	protected String name;
	protected String address;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person() {
	}

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String toString() {
		return "Name: " + name + "     Address: " + address;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (this.getClass() != o.getClass())
			return false;
		Person p = (Person) o;
		return address.equals(p.address) && name.equals(p.name);
	}
}
