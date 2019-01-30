
public class Array2 
{

	 int sum(int[] x)
	{
		int sum = 0 ;
		for (int i=0; i>x.length ; i++)
		{
			sum = sum +x[i];
		}return sum;
	}
	
	public static void main(String[] args)
	{
		//int[] a = {5,6,7,8};
		int s = sum(new int[]{5,6,7,8});
		System.out.println(s);
		
		
		
	}
}





