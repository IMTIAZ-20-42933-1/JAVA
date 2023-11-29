import java.lang.*;

public class StoryBook extends Book
{
	private String Catagory;
	public StoryBook()
	{
		super();
		System.out.println("Empty Story Boook");
	}
	public StoryBook (String isbn, String BookTitle,String AuthorName,int availableQuantity, double price,String Catagory)
	{
		super(isbn,BookTitle,AuthorName,availableQuantity,price);
		System.out.println("parameter StoryBook");
		this.Catagory = Catagory;
	}
	public void setCatagory(String Catagory){this.Catagory=Catagory;}
	public String getCatagory(){return Catagory;}
}
