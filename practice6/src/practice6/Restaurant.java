package practice6;

import java.util.Objects;

public class Restaurant {
	public String net, name, address;
	private double fee, givenFree;

	public Restaurant() {
	}

	public Restaurant(String net, String name, String address) {
		this.net = net;
		this.name = name;
		this.address = address;
	}

	public Restaurant(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public Restaurant(String address) {
		this.address = address;
	}

	void setFee(double fee) {
		this.fee = fee;
	}

	void addFee(double change) {
		fee += change;
	}

	void addGivenFree(double change) {
		givenFree += change;
	}

	public double getFee() {
		return fee;
	}

	public double getGivenFree() {
		return givenFree;
	}

	@Override
	public String toString() {
		String s = "";
		if (net != null)
			s += net + " -- ";
		if (name != null)
			s += name + ": ";
		s += address + " - " + fee;
		if(givenFree != 0)
			s += " (Loss from free distribution: " + givenFree + ")";
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(address, other.address);
	}

	@Override
	public int hashCode() {
		return Objects.hash(address);
	}
}
