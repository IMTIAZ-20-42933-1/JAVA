import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Book b1 = new Book ();
		b1.setIsbn("111235");
		b1.setBookTitle("Harry Potter");
		b1.setAuthorName("J.K Rowling");
		b1.setPrice(2000);
		b1.setAvaliableQuantity(300);
		
		System.out.println("Isbn: " + b1.getIsbn());
		System.out.println("Book Title: " + b1.getBookTitle());
		System.out.println("Author Name: " + b1.getAuthorName());
		System.out.println("Price: " + b1.getPrice());
		System.out.println("Avaliable Quantity: " + b1.getAvailableQuantity());
		
		Book b2 = new Book("111235", "Harry Potter", "J.K Rowling", 1000, 200);
		
		System.out.println("Isbn: " + b2.getIsbn());
		System.out.println("Book Title: " + b2.getBookTitle());
		System.out.println("Author Name: " + b2.getAuthorName());
		System.out.println("Price: " + b2.getPrice());
		System.out.println("Avaliable Quantity: " + b2.getAvailableQuantity());
	}
}
		
		
		
		