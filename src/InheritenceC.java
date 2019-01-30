
public class InheritenceC extends InhertenceP
{
	InheritenceC()
	{
		System.out.println("Print child constructor");
	}
	{
		System.out.println("Print instance block of child");
	}
	static{
		System.out.println("Print static block of child ");
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		InhertenceP s =	 new InhertenceP();
		 new InheritenceC();
		 new InhertenceP(1,1);
		 //System.out.println(s);
		 System.out.println(s.toString());
		
	}

}
