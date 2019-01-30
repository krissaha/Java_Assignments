
public class Switch_Case 
{
	public static void main (String args[])
	{
		int i = 1;
		String s; // = "Your Name : - ";
		switch (i)
		{
		case 1:
			s = "Krishnendu";
			break;
		case 2:
		    s = "Harry";
			break;
		case 3:
			s = "TOM";
			break;
		case 4:
			s = "RAM";
			break;
		case 5:
			s = "Amit";
			break;
			
		default:  s = "Mamata";
            break;
		}
	System.out.println("Your name is = " + s);
	}
}