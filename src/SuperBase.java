
class Baseclass2 
{
   Baseclass2(){
		super();
		System.out.println("Baseclass2 method ");
	}
   static{
	   System.out.println("Static block ");
   }
}
public class SuperBase extends Baseclass2
{
	SuperBase()	    {
		System.out.println("Super class method1 ");
	}
	SuperBase(int i){
		System.out.println("super class method2 ");
	}

	public static void main(String[] args)
	{
		new SuperBase();
		new SuperBase(5);

	}
}
