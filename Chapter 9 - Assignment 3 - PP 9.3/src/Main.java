
public class Main {
	
	public static void main(String args[]){
		
		Book book = new Book("Harry Potter and The Secret Chamber", 1222, "J.K. Rowling","Second adventure of Harry.");
		Magazine magazine = new Magazine("Scientific American", "Mind", 90, "Special" );
		Newspaper newspaper = new Newspaper("New York Times", 50, "12/09/2013");
		
		System.out.println(book.toString());
		System.out.println();
		
		System.out.println(magazine.toString());
		System.out.println();
		
		System.out.println(newspaper.toString());
		System.out.println();
		
	}

}
