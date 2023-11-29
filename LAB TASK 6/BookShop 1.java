import java.lang.*;
public class BookShop
{
    private String name;
    StoryBook storyBook[] = new StoryBook[100];
    TextBook textBook[] = new TextBook[100];
    public BookShop()
    {System.out.println("Empty");}
    public BookShop(String name)
    {this.name = name;}

    public void setName(String name)
    {this.name = name;}
    public String getName()
    {return name;}
   
    public boolean insertTextBook(TextBook tb)
    {
        boolean flag = false;
        for(int i=0; i<textBook.length; i++)
        {
            if(textBook[i]==null)
            {
                textBook[i] = tb;
                flag = true;
                break;
            }
        }
        return flag;
    }
    public boolean removeTextBook(TextBook tb)
    {
        boolean flag = false;
        for(int i=0; i<textBook.length; i++)
        {
            if(textBook[i]==tb)
            {
                textBook[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }
    public TextBook searchTextBook(String isbn)
    {
        TextBook flag = null;
        for(int i=0; i<textBook.length; i++)
        {
            if(textBook[i] != null)
            {
                if(textBook[i].getisbn() == isbn)
                {
                    flag = textBook[i];
                    break;
                }
            }
        }
        return flag;
    }
    public void showAllTextBook()
    {
        for(int i=0; i<textBook.length; i++)
        {
            if(textBook[i] != null)
            {
                textBook[i].showdetails();
                System.out.println();
            }
        }
    }
	 public boolean insertStoryBook(StoryBook sb)
    {
        boolean flag = false;
        for(int i=0; i<storyBook.length; i++)
        {
            if(storyBook[i]==null)
            {
                storyBook[i] = sb;
                flag = true;
                break;
            }
        }
        return flag;
    }
    public boolean removeStroyBook(StoryBook sb)
    {
        boolean flag = false;
        for(int i=0; i<storyBook.length; i++)
        {
            if(storyBook[i]==sb)
            {
                storyBook[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }
    public StoryBook searchStoryBook(String isbn)
    {
        StoryBook flag = null;
        for(int i=0; i<storyBook.length; i++)
        {
            if(storyBook[i] != null)
            {
                if(storyBook[i].getisbn() == isbn)
                {
                    flag = storyBook[i];
                    break;
                }
            }
        }
        return flag;
    }
    public void showAllStoryBook()
    {
        for(int i=0; i<storyBook.length; i++)
        {
            if(storyBook[i] != null)
            {
                storyBook[i].showdetails();
                System.out.println();
            }
        }
    }
}