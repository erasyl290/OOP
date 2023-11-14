package problem4;

import java.util.Comparator;

public class ByHireDate implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.hireDate.compareTo(o2.hireDate);
	}

}
