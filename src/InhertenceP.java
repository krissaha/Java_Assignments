
public class InhertenceP 
{
	{
		System.out.println("Printing Instance block from parent");
	}

		InhertenceP()
	{
		System.out.println("Printing Default Constructor from parent");
	}
		InhertenceP(int a, int b)
	{
		System.out.println(a+b);
	}
	
	static
	{
		System.out.println("Printing Static block from parent");
	}
}
