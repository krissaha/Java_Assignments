class Test1 
{
	public void mtest1()
	{
		System.out.println("----In Test1 method---");
	}
}
class Test4 
{
	public void mtest2()
	{
		Test1 t1 = new Test1();
		t1.mtest1();
	}
}

public class Test3 {

	public static void main(String[] args) 
	{
		Test4 t4 = new Test4();
		Test1 t = t4.mtest2();
		t4.mtest2();
	}
}