import java.lang.*;

public class Book implements BookOperations
 {
    private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;

    public Book() 
	{
	System.out.println(\"Empty-Constructor\":");	
    }

    public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
	{
		System.out.println( \"Parameterized-Constructor\":");
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public String getIsbn()
	{
        return isbn;
    }

    public void setIsbn(String isbn)
	{
        this.isbn = isbn;
    }

    public String getBookTitle()
	{
        return bookTitle;
    }

    public void setBookTitle(String bookTitle)
	{
        this.bookTitle = bookTitle;
    }

    public String getAuthorName()
	{
        return authorName;
    }

    public void setAuthorName(String authorName) 
	{
        this.authorName = authorName;
    }

    public double getPrice() 
	{
        return price;
    }

    public void setPrice(double price) 
	{
        this.price = price;
    }

    public int getAvailableQuantity()
	{
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity)
	{
        this.availableQuantity = availableQuantity;
    }
	
	public void addQuantity(int amount)
    {
		
	    if(amount>=1)
	    {
		availableQuantity = availableQuantity + amount;
		System.out.println("Adding is done.");
	    }  
	    else
	    {
		System.out.println("Sorry, adding is not possible.");
	    }
	
    }
	
	    public void sellQuantity(int amount)
    {
		
	    if(amount>=1 && amount<=availableQuantity)
	    {
		availableQuantity = availableQuantity - amount;
		System.out.println("Selling is done.");
	    }
	    else
	    {
		System.out.println("Sorry, selling is not possible.");
	    }
		
    }
	
	public void showDetails()
	{
		System.out.println( \"Show Method\":");
		System.out.println("Book ISBN: " + isbn);
		System.out.println("Title of The Book: " + bookTitle);
		System.out.println("Author's Name: " + authorName);
		System.out.println("Price: " + price + "(Not Negotiable)");
		System.out.println("Available Quantity: " + availableQuantity);
	}
	
}
