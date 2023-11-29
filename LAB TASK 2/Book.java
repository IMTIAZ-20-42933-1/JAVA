import java.lang.*;

public class Book
{
	private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int avaliableQuantity;
	
	public Book()
	{
		System.out.println("Empty-Book");
	}
	public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
	{
		System.out.println("Parameterized-Book");
        this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
        this.price = price;
        this.avaliableQuantity = avaliableQuantity;	
	}

    public void setIsbn(String isbn)
	{
	  this.isbn = isbn;	
	}
	public void setBookTitle (String bookTitle)
	{
		this.bookTitle = bookTitle;
	}
	public void setAuthorName (String authorName)
	{
		this.authorName = authorName;
	}
	public void setPrice (double price)
	{
	this.price = price;	
	}
	public void setAvaliableQuantity (int avaliableQuantity)
	{
		this.avaliableQuantity = avaliableQuantity;
	}
	public String getIsbn()
	{
		return isbn;
	}
	public String getBookTitle()
	{
		return bookTitle;
	}
	public String getAuthorName()
    {
		return authorName;
	}
    public double getPrice()
    {
		return price;
	}		
    public int getAvailableQuantity()
    {
		return avaliableQuantity;
	}		

    public void showDetails()
	{
    System.out.println("Isbn: " + isbn);
    System.out.println("Book Title: " + bookTitle);
    System.out.println("Author Name: " + authorName);
    System.out.println("Price: " + price);
    System.out.println("Avaliable Quantity:" + avaliableQuantity);
	}
}
	