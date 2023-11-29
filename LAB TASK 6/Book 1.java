import java.lang.*;

public class Book{
	protected String isbn;
	protected String BookTitle;
	protected String AuthorName;
	protected int availableQuantity;
	protected double price;
	
	public Book(){System.out.println("Empty Book" );}
	public Book (String isbn,String BookTitle,String AuthorName,int availableQuantity, double price)
	{
		System.out.println("parameterized Book");
		this.isbn=isbn;
		this.BookTitle=BookTitle;
		this.AuthorName=AuthorName;
		this.availableQuantity=availableQuantity;
		this.price=price;
    }
	
	public void setisbn(String isbn){ this.isbn=isbn;}
	public void setBookTitle(String BookTitle){this.BookTitle =BookTitle;}
	public void setAuthorName(String AuthorName){this.AuthorName=AuthorName;}
	public void setavailableQuantity(int availableQuantity) {this.availableQuantity=availableQuantity;}
	public void setprice(double price){this.price=price;}
	
	public String getisbn(){return isbn;}
	public String getBookTitle(){return BookTitle;}
	public String getAuthorName(){return AuthorName;}
	public int getavailableQuantity(){return availableQuantity;}
	public double getprice(){return price;}
	
	public void showdetails()
	{
		System.out.println("ISBN NO : "+isbn);
		System.out.println("Book Title : "+BookTitle);
		System.out.println("Author Name : "+AuthorName);
		System.out.println("Available Quantity : "+availableQuantity);
		System.out.println("Price : "+price);
	}
	void addQuantity(int amount) {
        if(amount>0) {
            availableQuantity += amount;
        }
        else {
            System.out.println("Invalid");
        }
    }
	void sellQuantity(int amount) {
        if(amount>0 && amount<=availableQuantity) {
            availableQuantity -= amount;
        }
        else {
            System.out.println("Invalid");
        }
    }
}