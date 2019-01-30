class Parent
{
	
}

class child extends Parent
{
	
}

class test
{
	Parent covtest()
	{
		Parent p = new Parent();
		return p;
	}
}

public class CoTest extends test{
	child covtest()
	{
		System.out.println("Child c");
		child c = new child();
		return c;
	}

	public static void main(String[] args)
	{
		CoTest c = new CoTest();
		c.covtest();
	}
}
