import java.lang.*;

public class Student
{
	private int id;
	private String name;
	private double cgpa;
	
	public void setID( int i)
	{
		id = i;
	}
	public void setName( String n)
	{
		name = n;
	}
	public void setcgpa( double c)
	{
		cgpa = c;
	}
	
	public int getID ()
	{
		return id;
	}
	
	public String  getName ()
	{
		return name;
	}
	
	public double getcgpa ()
	{
		return cgpa;
	}
	public static void main(String args[])
	{
		Student s = new Student();
		
		s.setID(42933);
		s.setName("Imtiaz");
		s.setcgpa(3.62);
		
		System.out.println("ID:" + s.getID());
		System.out.println("Name:" + s.getName());
		System.out.println("cgpa:" + s.getcgpa());
		
	}
}