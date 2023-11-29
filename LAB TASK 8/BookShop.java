import java.lang.*;

public class BookShop implements BookShopOperations
{
	private String name;
	private Book Books[] = new Book[100]; 

	
	public BookShop()
	{
		System.out.println("\n" + "E-BookShop"); 
	}
	
	public BookShop(String name)
	{
		System.out.println("P-BookShop");
		this.name = name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean insertBook(Book b)
	{
		boolean flag = false;
		
		for(int i=0; i<Books.length; i++)
		{
			if(Books[i] == null)
			{
				Books[i] = b;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeBook(Book b)
	{
		boolean flag = false;
		
		for(int i=0; i<Books.length; i++)
		{
			if(Books[i] == b)
			{
				Books[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public Book searchBook(String isbn)
	{
		Book b = null;
		
		for(int i = 0; i<Books.length; i++)
		{
			if(Books[i] != null)
			{
				if(Books[i].getIsbn() == isbn)
				{
					b = Books[i];
					break;
				}
			}
		}
		return b;
	}
	
	public void showAllBooks()
	{
		for(int i=0; i<Books.length; i++)
		{
			if(Books[i] != null)
			{
				System.out.println("************************");
				Books[i].showDetails();
				System.out.println();
			}
		}
	}
	
	
}
