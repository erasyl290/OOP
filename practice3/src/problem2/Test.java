package problem2;

import java.util.Scanner;
import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> people = new HashSet<Person>();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Adding people... Enter inquired data or type \"Exit\"");
		
		String name = "0";
		while(true) {
			name = "0";
			System.out.print("Name: ");
			name = in.nextLine();
			if(name.isEmpty() || name.equals("Exit")) {
				break;
			}
			
			System.out.print("Address: ");
			String address = in.nextLine();
			
			System.out.print("Add new (student/employee)? ");
			String answer = in.nextLine();
			
			if(answer.equals("student")) {
				System.out.print("Program: ");
				String program = in.nextLine();
				
				System.out.print("Year: ");
				int year = in.nextInt();
				
				System.out.print("Fee: ");
				double fee = in.nextDouble();
				in.nextLine();
				
				people.add(new Student(name, address, program, year, fee));
				
			} else if(answer.equals("employee")) {
				System.out.print("School: ");
				String school = in.nextLine();
				
				System.out.print("Salary: ");
				double pay = in.nextDouble();
				in.nextLine();
				
				people.add(new Staff(name, address, school, pay));
				
			} else {
				people.add(new Person(name, address));
			} System.out.println();
		} in.close();
		System.out.println("Stop processing...\n");
		
		
		if(!people.isEmpty()) {
			System.out.println("Added people: ");
		}
		for(Person p: people) {
			System.out.print(p + "\n");
		}
	}

}
