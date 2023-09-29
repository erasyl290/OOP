package problem6;

import java.util.Scanner;

public class TestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Write a palindrome: ");
		String word = in.next();
		in.close();
		
		Palindrome palindrome = new Palindrome(word);
		System.out.println(palindrome);
	}

}
