import java.lang.*;

public class TextBook extends Book
{
	private int Standard;
	public TextBook ()
	{
		super();
		System.out.println("Empty Text Book");
	}
	
	public TextBook (String isbn,String BookTitle,String AuthorName,int availableQuantity, double price,int Standard)
	{
		super(isbn,BookTitle,AuthorName,availableQuantity,price);
		System.out.println("parameter Text Book");
		this.Standard=Standard;
	}
	public void setStandard(int Standard){this.Standard=Standard;}
	public int getStandard(){return Standard;}
	
}