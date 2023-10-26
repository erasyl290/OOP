package problem1;

public class Magazine extends LibraryItem {
	public int pages, pictures;
	
	public Magazine() {
		super();
	}
	
	public Magazine(String title) {
		super(title);
	}
	
	public Magazine(String title, String author) {
		super(title, author);
	}
	
	public Magazine(String title, int pictures) {
		this(title);
		this.pictures = pictures;
	}
	
	public Magazine(String title, String author, int pictures) {
		this(title, author);
		this.pictures = pictures;
	}
	
	public Magazine(String title, int pictures, int pages) {
		this(title, pictures);
		this.pages = pages;
	}
	
	public Magazine(String title, String author, int pictures, int pages) {
		this(title, author, pictures);
		this.pages = pages;
	}
	
	public Magazine(String title, String author, int pictures, int pages, int year) {
		this(title, author, pictures, pages);
		this.year = year;
	}
	
	public void cutPicture() {
		pictures--;
	}
	
	public void cutPicture(int quantity) {
		pictures -= quantity;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return "Have additional fields: pages, pictures count. Pictures count can be decreased";
	}
	
	public String toString() {
		return "Magazine " + super.toString() + "Pages: " + pages + ", pictures count: " + pictures;
	}
}
