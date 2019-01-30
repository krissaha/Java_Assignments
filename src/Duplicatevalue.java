import java.util.HashSet;
import java.util.Set;

public class Duplicatevalue {

	public static void main(String[] args) {
		String s[] = { "S", "A", "H", "L", "A", "K", "I", "J"};
		
		Set<String> s1 = new HashSet<String>();
		
		for(String s2 : s)
		{
			if(s1.add(s2) == false)
			{
				System.out.println("Duplicate value :- " + s2);
			}
		}
	}
}
