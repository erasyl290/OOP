package problem1;

public class TestLibraryItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("The best", "John Filderlin", 160, 2014);
		System.out.println(book);
		
		DVD disk = new DVD("Another video", "Frederic Freder", 2072, 100, 2023);
		disk.accelerate(2);
		disk.decelerate(2);
		System.out.println(disk);
		
		Magazine magazine = new Magazine("Modern fashion", 50, 13);
		magazine.cutPicture();
		magazine.cutPicture(10);
		System.out.println(magazine);
	}

}
