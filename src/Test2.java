
public class Test2 {

	public static void main(String[] args) 
	{
		System.out.println("Print Main---1");
		main(5);
		main(6,6);
	}
	public static void main(int a)
	{
		System.out.println("Print Main---2");
	}
	public static void main(int a, int v)
	{
		System.out.println("Print Main---3");
	}
}
