import java.lang.*;
public class Start {
    public static void main(String args[])
	
	{
		
        TextBook tx1 = new TextBook();
        tx1.setisbn("1228-208-789");
        tx1.setAuthorName("Karmul Karim");
        tx1.setavailableQuantity(478);
        tx1.setBookTitle("Biology");
        tx1.setprice(390);
        tx1.setStandard(12);
        tx1.addQuantity(290);
		
        TextBook tx2 = new TextBook("125-456-852", "Bangla 2nd Paper", "Karim Khan", 250, 234, 5);
        tx2.sellQuantity(26);
        TextBook tx3 = new TextBook("895-856-256", "English 2nd Paper", "Hanif Chowdary", 230, 721, 5);
        tx3.sellQuantity(90);
        TextBook tx4 = new TextBook("985-456-852", "Biology 2nd Paper", "Hasan Khan", 390, 160, 2);
        tx4.addQuantity(370);
        TextBook tx5 = new TextBook("859-1278-92", "Socialogy", "Mahfuz Araf", 307, 290, 9);
        tx5.sellQuantity(267);
		
        StoryBook s1 = new StoryBook();
        s1.setisbn("927-23-2938");
        s1.setAuthorName("Lowry");
        s1.setavailableQuantity(400);
        s1.setBookTitle("Death Note");
        s1.setprice(730);
        s1.setCatagory("Tragady");
        s1.addQuantity(367);
        s1.sellQuantity(280);
		
        StoryBook s2 = new StoryBook("896-28-198", "Khan", "Kamal Hasan", 389, 300, "Romantic");
        s2.addQuantity(200);
        StoryBook s3 = new StoryBook("578-896-25", "Shuki", "Ashraf", 300, 200, "Tragedy");
        s3.sellQuantity(20);
        StoryBook s4 = new StoryBook("412-896-36", "The Pala Area", "Kamrul", 400, 200, "Historical");
        s4.addQuantity(300);
        StoryBook s5 = new StoryBook("412-896-74156", "Black Widow", "Zidane", 385, 200, "Fantasy Horror");
        s5.sellQuantity(50);
		
        BookShop b = new BookShop("BSB Book Shop");
        System.out.println("-----------------------");

        if(b.insertStoryBook(s1))
        {
			System.out.println(s1.getisbn() + "inserted");
		}
        else
        {
			System.out.println(s1.getisbn() + "not inserted");
		}
        
		if(b.insertStoryBook(s2))
        {
			System.out.println(s2.getisbn() + "inserted");
		}
        else
        {
			System.out.println(s2.getisbn() + "not inserted");
		}
        
		if(b.insertStoryBook(s3))
        {
			System.out.println(s3.getisbn() + "inserted");
		}
        else
        {System.out.println(s3.getisbn() + "not inserted");}
        
		if(b.insertStoryBook(s4))
        {
			System.out.println(s4.getisbn() + "inserted");
		}
        else
        {
			System.out.println(s4.getisbn() + "not inserted");
		}
        
		if(b.insertStoryBook(s5))
        {
			System.out.println(s5.getisbn() + "inserted");
		}
        else
        {
			System.out.println(s5.getisbn() + "not inserted");
		}

        if(b.insertTextBook(tx1))
        {
			System.out.println(tx1.getisbn() + "inserted");
		}
        else
        {
			System.out.println(tx1.getisbn() + "not inserted");
		}
        
		if(b.insertTextBook(tx2))
        {
			System.out.println(tx2.getisbn() + "inserted");
		}
        else
        {
			System.out.println(tx2.getisbn() + "not inserted");
		}
        
		if(b.insertTextBook(tx3))
        {
			System.out.println(tx3.getisbn() + "inserted");
		}
        else
        {
			System.out.println(tx3.getisbn() + "not inserted");
		}
        
		if(b.insertTextBook(tx4))
        {
			System.out.println(tx4.getisbn() + "inserted");
		}
        else
        {
			System.out.println(tx4.getisbn() + "not inserted");
		}
        
		if(b.insertTextBook(tx5))
        {
			System.out.println(tx5.getisbn() + "inserted");
		}
        else
        {
			System.out.println(tx5.getisbn() + "not inserted");
		}
        System.out.println("*-----------------------*");

        if(b.removeStroyBook(s3))
        {
            System.out.println(s3.getisbn() + " removed");
        }
        else
        {
            System.out.println(s3.getisbn() + " not removed");
        }
		
        System.out.println(b.getName());
        System.out.println("-----------------------Story Books-----------------------\n");
        b.showAllStoryBook();
        System.out.println("-----------------------Text Books-----------------------\n");
        b.showAllTextBook();
        StoryBook sb = b.searchStoryBook(s2.getisbn());
		
        if(sb!=null)
        {
            System.out.println("Book Found");
            sb.showdetails();
        }
        else
        {
            System.out.println("No book with ISBN " + s2.getisbn() + " is found");
        }

        System.out.println("*-----------------------*");
		
    }
}