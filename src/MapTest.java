import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class MapTest {

	public static void main(String[] args) {
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(1, "Krishnendu");
		m1.put(2,"ROY");
		for(Map.Entry m : m1.entrySet())
		{
		//System.out.println(m);
		System.out.println(m.getValue());
		}
		
		
		
//		Map<Integer,String> map=new HashMap<Integer,String>();  
//		  map.put(100,"Amit");  
//		  map.put(101,"Vijay");  
//		  map.put(102,"Rahul");  
//		  //Elements can traverse in any order  
//		  for(Map.Entry m:map.entrySet()){  
//		   System.out.println(m.getKey()+" "+m.getValue());  
//		  }  

	}

}
