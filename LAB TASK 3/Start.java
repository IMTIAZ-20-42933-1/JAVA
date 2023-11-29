import java.lang.*;
public class Start {
    public static void main(String[] args) {
		StoryBook book1 = new StoryBook();
        book1.setIsbn("895723");
        book1.setBookTitle("The Giver");
        book1.setAuthorName("Lois Lowry");
        book1.setPrice(2000);
        book1.setCategory("Novel");  
        book1.setAvailableQuantity(255);
        book1.addQuantity(333);
        book1.sellQuantity(420);
		StoryBook.setDiscountRate(50);
		
        System.out.println("ISBN\t\t: " + book1.getIsbn());
		System.out.println("Book Title\t: " + book1.getBookTitle());
		System.out.println("Author Name\t: " + book1.getAuthorName());
		System.out.println("Price\t\t: " + book1.getPrice());
        System.out.println("Category\t: " + book1.getCategory());
        System.out.println("Discount Rate\t: " + StoryBook.discountRate + " %");    
		System.out.println("Available Quantity: " + book1.getAvailableQuantity() + '\n');
		
		StoryBook book2 = new StoryBook("568239", "The Handmaid's Tale", "Margaret Atwood", 1500, 600, "Speculative fiction");
        StoryBook.setDiscountRate(25);
        book2.addQuantity(20);
        book2.sellQuantity(135);
		
        System.out.println("ISBN\t\t: " + book2.getIsbn());
		System.out.println("Book Title\t: " + book2.getBookTitle());
		System.out.println("Author Name\t: " + book2.getAuthorName());
		System.out.println("Price\t\t: " + book2.getPrice());
        System.out.println("Category\t: " + book2.getCategory());
        System.out.println("Discount Rate\t: " + StoryBook.discountRate + " %");    
		System.out.println("Available Quantity : " + book2.getAvailableQuantity() + '\n');
		
		TextBook book3 = new TextBook();
        book3.setIsbn("897456");
        book3.setBookTitle("Social Science");
        book3.setAuthorName("Madhumita Pattrea");
        book3.setPrice(325);
        book3.setAvailableQuantity(45);
        book3.setStandard(10);
        book3.addQuantity(20);
        book3.sellQuantity(10);
		TextBook.setDiscountRate (25);
		
        System.out.println("ISBN\t\t: " + book3.getIsbn());
		System.out.println("Book Title\t: " + book3.getBookTitle());
		System.out.println("Author Name\t: " + book3.getAuthorName());
		System.out.println("Price\t\t: " + book3.getPrice());
        System.out.println("Standard\t: " + book3.getStandard());
        System.out.println("Discount Rate\t: " + TextBook.discountRate + " %");    
		System.out.println("Available Quantity : " + book3.getAvailableQuantity() + '\n');
		
		 TextBook book4 = new TextBook("239845", "Mathematics", "Karim Khan", 250, 40, 10);
        TextBook.setDiscountRate(20);
        book4.addQuantity(27);
        book4.sellQuantity(30);
		
        System.out.println("ISBN\t\t: " + book4.getIsbn());
		System.out.println("Book Title\t: " + book4.getBookTitle());
		System.out.println("Author Name\t: " + book4.getAuthorName());
		System.out.println("Price\t\t: " + book4.getPrice());
        System.out.println("Standard\t: " + book4.getStandard());
        System.out.println("Discount Rate\t: " + TextBook.discountRate + " %");    
		System.out.println("Available Quantity : " + book4.getAvailableQuantity() + '\n');
	}
}