package problem2;

public class Staff extends Person{
	protected String school;
	protected double pay;
	
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public double getPay() {
		return pay;
	}
	
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	public Staff(String name, String address, String school, double pay) {
		super.name = name;
		super.address = address;
		this.school = school;
		this.pay = pay;
	}
	
	public String toString() {
		return super.toString() + "School: " + school + "   Pay: " + pay + "\n";
	}
}
