import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		StoryBook sb1=new StoryBook();
		System.out.println("*-----------------------*");
		sb1.setisbn("895723");
		sb1.setBookTitle("The Giver");
		sb1.setAuthorName("Lois Lowry");
	    sb1.setQuantity(204);
		sb1.setprice(850.00);
		sb1.setCatagory("Novel");
	
		System.out.println("*-----------------------*");
		
		System.out.println("Isbn : "+sb1.getisbn());
		System.out.println("Book Title : "+sb1.getBookTitle());
		System.out.println("Available Quantity : "+sb1.getQuantity());
		System.out.println("Book Price : "+sb1.getprice());
		System.out.println("Catagory : "+sb1.getCatagory());
	    System.out.println("Author Name : "+sb1.getAuthorName());
	    System.out.println("...................");
		StoryBook sb2=new StoryBook ("568239","The Handmaid's Tale","Margaret Atwood",896,546.15,"Speculative fiction");
		System.out.println("*-----------------------*");
		sb2.showdetails();
		
		
		
		System.out.println("*-----------------------*");
		TextBook tb1=new TextBook();
		tb1.setisbn("897456");
		tb1.setBookTitle("Social Science");
	    tb1.setAuthorName("Madhumita Pattrea");
		tb1.setQuantity(300);
		tb1.setprice(475.00);
		tb1.setStandard(10);
		System.out.println("*-----------------------*");
		
		
		System.out.println("Isbn : "+tb1.getisbn());
		System.out.println("Book Title : "+tb1.getBookTitle());
	    System.out.println("Author Name : "+tb1.getAuthorName());
		System.out.println("Available Quantity : "+tb1.getQuantity());
		System.out.println("Book Price : "+tb1.getprice());
		System.out.println("Standard : "+tb1.getStandard());
		
		System.out.println("*-----------------------*");
		TextBook tb2 =new TextBook("239845","Mathematics","Karim Khan",700,230.0,85);
		System.out.println("*-----------------------*");
	    tb2.showdetails();
		System.out.println("*-----------------------*");
	
	}
}