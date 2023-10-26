package problem1;

public abstract class LibraryItem {
	public String title, author;
	public int year;
	
	public LibraryItem() {
	}
	
	public LibraryItem(String title) {
		this.title = title;
	}
	
	public LibraryItem(String title, String author) {
		this(title);
		this.author = author;
	}
	
	public LibraryItem(String title, String author, int year) {
		this(title, author);
		this.year = year;
	}
	
	public abstract String info();
	
	public String toString() {
		return "\"" + title + "\" by " + author + ", made in " + year + ". "; 
	}
}
