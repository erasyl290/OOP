package problem3;

import java.util.Scanner;

public class TestTime {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter hours: ");
		int hours = in.nextInt();
		
		System.out.print("Enter minutes: ");
		int min = in.nextInt();
		
		System.out.print("Enter seconds: ");
		int sec = in.nextInt();
		
		in.close();
		
		Time time = new Time(hours, min, sec);
		System.out.println(time.toUniversal());
		System.out.println(time.toStandard());
		
		Time t = new Time(24, 60, 60);
		System.out.println("+ " + t.toUniversal());
		time.add(t);
		System.out.println("= " + time.toStandard());
	}
	
}
