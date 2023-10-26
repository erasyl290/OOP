package problem1;

public class Book extends LibraryItem {
	public int pages;
	
	public Book() {
		super();
	}
	
	public Book(String title) {
		super(title);
	}
	
	public Book(String title, String author) {
		super(title, author);
	}
	
	public Book(String title, int pages) {
		this(title);
		this.pages = pages;
	}
	
	public Book(String title, String author, int pages) {
		this(title, author);
		this.pages = pages;
	}
	
	public Book(String title, String author, int pages, int year) {
		this(title, author, pages);
		super.year = year;
	}
	
	public String info() {
		return "Have additional fields: pages";
	}
	
	public String toString() {
		return "Book " + super.toString() + "Pages: " + pages + ". ";
	}
}
