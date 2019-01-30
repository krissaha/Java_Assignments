class Base
{
	   String designation = "Teacher";
	   String collegeName = "Beginnersbook";
	   void does()
	   {
	   System.out.println("Teaching..");
	   }
}

public class Inheritence extends Base
{
	String mainsub = "Computer Science";
	
	public static void main (String args[])
	{
		Inheritence I = new Inheritence();
		
		System.out.println(I.collegeName);
		System.out.println(I.designation);
		System.out.println(I.mainsub);
		I.does();		
	}
}
