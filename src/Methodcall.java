
public class Methodcall 
{
	Methodcall()
	{
	 System.out.println("Constructor block ");
	}
	
	{
		System.out.println("I m instance block... ");
	}
 	
	static{
		System.out.println("I m static block... ");
	      }
	
	static public void main(String krish []) 
	{
		new Methodcall();
		
		//System.out.println(m.toString());
	

	}

}
