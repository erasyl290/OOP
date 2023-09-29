package problem6;

public class Palindrome {
	public String word;
	
	Palindrome(){
	}
	
	Palindrome(String word){
		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
				System.err.println("This word is not a palindrome");
				System.exit(1);
			}
		}
		this.word = word;
	}
	
	public String toString() {
		return "palindrome " + word;
	}
}
