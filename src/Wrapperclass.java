
public class Wrapperclass {

	public static void main(String[] args)
	{
	
		String s = "50AD";
		try{
		int s1 = Integer.parseInt(s);
		
		}catch (Throwable e)
		{
			e.printStackTrace();
			
		}
		
		String q = "Kris";
		boolean  b1 = Boolean.parseBoolean(q);
		System.out.println(b1);
		
		String w = "213.210";
		double d = Double.parseDouble(w);
		System.out.println(d);
	
	
	}

}
