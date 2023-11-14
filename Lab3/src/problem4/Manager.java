package problem4;

import java.util.Vector;

public class Manager extends Employee implements Comparable<Employee>, Cloneable {
	public Vector<Employee> team = new Vector<Employee>();
	public double bonus;

	public void setTeam(Vector<Employee> v) {
		team.addAll(v);
	}

	public void setBonus(double d) {
		bonus = d;
	}

	public Manager(String name, String address, String hireDate) {
		super(name, address, hireDate);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String members = "Members:\n";
		if (team.size() == 0)
			members += "    No one\n";
		for (int i = 0; i < team.size(); i++) {
			members += "     " + i + ". " + team.get(i).name + "\n";
		}
		return super.toString() + "     Bonus: " + bonus + "\n" + members;
	}

	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		Manager oth = (Manager) obj;
		return team.equals(oth.team);
	}

	public Object clone() throws CloneNotSupportedException {
		Manager o = (Manager) super.clone();
		return o;
	}

	@Override
	public int compareTo(Employee o) {
		int superCompareTo = super.compareTo(o);
		if (superCompareTo == 0) {
			Manager obj = (Manager) o;
			if (this.bonus > obj.bonus)
				return 1;
			if (this.bonus < obj.bonus)
				return -1;
		}
		return superCompareTo;
	}
}
