abstract class T2
{
	T2()
	{
		System.out.println("Constructor Test");
	}
	abstract void m1();
}

public class T3 extends T2 
{
	void m1()
	{
		System.out.println("Method m1");
	}
	T3()
	{
		super();
		System.out.println("Normal class constructor");
	}
	
	
	public static void main(String[] args) 
	{
		T3 t = new T3(); 
		t.m1();	
	}

}
