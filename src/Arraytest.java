
public class Arraytest {

	static int sum(int[] x)
	{
		int sum =0;
		for(int i=0; i <x.length; i++)
		{
			sum = sum + x[i];
			System.out.println(sum);
			
		}return sum;
	}
	
	
	public static void main(String[] args)
	{
		sum(new int[]{5,6,7,8});
		
//		int x[] = new int[3];
//		x[0] = 1;
//		x[1] = 2;
//		x[2] = 3;
//		System.out.println(x[2]);
		
//		int []x1 ={1,5,6}; 
//		for (int i=0; i<x1.length; i++)
//		{
//		System.out.println(x1[i]);
		}
		

	}


