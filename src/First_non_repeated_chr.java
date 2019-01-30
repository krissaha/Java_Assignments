
public class First_non_repeated_chr 
{
	
	static void m1(String k)
	{
		String s = k;
	      for (char c : s.toCharArray())
	      {
	          if (s.indexOf(c) == s.lastIndexOf(c)) 
	          {
	              System.out.println("First non repeated characted in String \"" + s + "\" is:" + c);
	              break;
	           }
	       }
	}
	
	public static void main(String[] args) 
	{
		First_non_repeated_chr.m1("Krishnendu");
	  
	}
}
