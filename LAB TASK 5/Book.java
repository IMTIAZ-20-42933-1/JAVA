import java.lang.*;

public class Book{
	protected String isbn;
	protected String BookTitle;
	protected String AuthorName;
	protected int Quantity;
	protected double price;
	
	public Book(){System.out.println("Empty Book" );}
	public Book (String isbn,String BookTitle,String AuthorName,int Quantity, double price)
	{
		System.out.println("parameterized Book");
		this.isbn=isbn;
		this.BookTitle=BookTitle;
		this.AuthorName=AuthorName;
		this.Quantity=Quantity;
		this.price=price;
    }
	
	public void setisbn(String isbn)
	            { this.isbn=isbn;}
	public void setBookTitle(String BookTitle)
	            {this.BookTitle =BookTitle;}
	public void setAuthorName(String AuthorName)
	            {this.AuthorName=AuthorName;}
	public void setQuantity(int Quantity) 
	           {this.Quantity=Quantity;}
	public void setprice(double price)
	            {this.price=price;}
	
	public String getisbn()
	       {return isbn;}
	public String getBookTitle()
	       {return BookTitle;}
	public String getAuthorName()
	       {return AuthorName;}
	public int getQuantity()
	       {return Quantity;}
	public double getprice()
	       {return price;}
	
	public void showdetails()
	{
		System.out.println("ISBN NO : "+isbn);
		System.out.println("Book Title : "+BookTitle);
		System.out.println("Author Name : "+AuthorName);
		System.out.println("Available Quantity : "+Quantity);
		System.out.println("Price : "+price);
	}
	
}