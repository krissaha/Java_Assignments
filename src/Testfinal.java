import java.awt.AWTPermission;

public class Testfinal {

	public static void m1()
	{
//		System.out.println("Inside method---");
//		try
//		{
//			int i =10/0;
//			System.out.println(" Inside try block ");
//		}catch(ArithmeticException e)
//		{
//			System.out.println("Inside catch block ");
//		}
//		finally 
//		{
//			int i =10/0;
//			System.out.println("Inside final block");
//		}
	}
	
	public static void main(String[] args) 
	{
		
		Testfinal t1 = new Testfinal();
		t1= null;
		System.out.println(t1.toString());
		
		
	}

}
