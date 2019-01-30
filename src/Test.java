
public class Test
{
	Test()
	{
		System.out.println("Default Constructor");
	}
	
	{
		System.out.println("First block run ");
	}
	
	Test(int a, int b)
	{
		int c = a + b ;
		System.out.println(c);
	}
}
