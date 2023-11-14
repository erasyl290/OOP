package problem4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
	public double salary;
	public Date hireDate;
	protected String insuranceNumber;

	public void setSalary(double d) {
		salary = d;
	}

	public void setInsuranceNum(String s) {
		insuranceNumber = s;
	}

	public double getSalary() {
		return salary;
	}

	public String getInsuranceNum() {
		return insuranceNumber;
	}

	public Employee(String name, String address, String hireDate) {
		super(name, address);
		// TODO Auto-generated constructor stub
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yy");
		try {
			this.hireDate = formatter.parse(hireDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.err.println("Date format must be dd.MM.yy (01.12.23");
		}
	}

	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yy");
		return super.toString() + "     Hire date: " + formatter.format(hireDate) + "\nInsurance number: "
				+ insuranceNumber + "     Salary: " + salary;
	}

	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		Employee other = (Employee) obj;
		if (insuranceNumber == null)
			return hireDate.equals(other.hireDate);
		return insuranceNumber.equals(other.insuranceNumber);
	}
	
	public Object clone() throws CloneNotSupportedException {
		Employee o = (Employee) super.clone();
		o.hireDate = (Date) hireDate.clone();
		return o;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if (this.salary > o.salary)
			return 1;
		if (this.salary < o.salary)
			return -1;
		return 0;
	}
}
