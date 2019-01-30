class parent
{
	void m1()
	{
		System.out.println("Child m1");
	}
}

public class Child1 extends parent 
{
	void m1()
	{
		System.out.println("Parent m1");
	}
	void m2()
	{
		System.out.println("child new method m2");
	}
	
	public static void main(String[] args)
	{
		parent p1 = new parent();
		Child1 c1 = new Child1();
		parent p2 = new Child1();
		
		
		//p1.m1();
		//c1.m1();
		//c1.m2();
		p2.m1();
		
		

	}

}
