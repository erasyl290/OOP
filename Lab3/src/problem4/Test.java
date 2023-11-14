package problem4;

import java.util.Collections;
import java.util.Vector;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Vector<Employee> team = new Vector<Employee>();
		Manager m1 = new Manager("C False Manager", "Universe", "02.01.23"),
				m2 = new Manager("B NotTrue Manager", "Another Universe", "03.01.23"),
				m3 = new Manager("A Manager whoHasA_Manager", "Hell", "04.01.23");
		m1.setSalary(100000);
		m2.setSalary(100000.1);
		m3.setSalary(100000);
		team.add(m1);
		team.add(m2);
		team.add(m3);
		
		Manager m = new Manager("TheBest Manager", "Universe", "01.01.23");
		m.setInsuranceNum("GALAXY_INSURANCE:CAD99821");
		m.setSalary(9999999.999);
		m.setBonus(9871827);
		m.setTeam(team);
		System.out.println(m);
		
		Manager m_equals = new Manager("TheBest Manager", "Universe", "01.01.23");
		m_equals.setTeam(team);
		System.out.println(m_equals.equals(m));
		m_equals.setInsuranceNum("GALAXY_INSURANCE:CAD99821");
		System.out.println(m_equals.equals(m) + "\n");
		
		System.err.println("Checking that clone's data does not change data of cloned manager");
		Manager m_clone = (Manager) m.clone();
		m_clone.setAddress("Parallel Universe");
		System.out.println(m);
		
		System.err.println("Sorting by salary");
		Collections.sort(m.team);
		System.out.println(m);
		
		m1.setBonus(0.1);
		System.err.println("Sorting by bonus");
		Collections.sort(m.team);
		System.out.println(m);
		
		System.err.println("Sorting by name");
		Collections.sort(m.team, new ByName());
		System.out.println(m);
		
		System.err.println("Sorting by hireDate");
		Collections.sort(m.team, new ByHireDate());
		System.out.println(m);
	}

}
