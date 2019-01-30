public class Throwexcep {

	public static void main(String[] args)throws ArithmeticException
	{
		Throwexcep t = new Throwexcep();
		t.div();
	}
	
	public void sum()throws ArithmeticException
	{
		div();
	}
	
	public void div()throws ArithmeticException
	{
		int i = 10/0;
	}
}
