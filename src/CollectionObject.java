import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionObject {

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();  
        list.add("C");  
        list.add("Core Java");  
        list.add("Advance Java");  
        System.out.println("Initial collection value:"+list);  
        Collections.addAll(list, "Servlet","JSP");  
        System.out.println("After adding elements collection value:"+list);  
        String[] strArr = {"C#", ".Net"};  
        Collections.addAll(list, strArr);  
        System.out.println("After adding array collection value:"+list);  	

		
		
		
//	    List<Integer> list = new ArrayList<Integer>();  
//	    list.add(46);  
//	    list.add(67);  
//	    list.add(24);  
//	    list.add(16);  
//	    list.add(8);  
//	    list.add(12);  
//	    System.out.println("Value of maximum element from the collection: "+Collections.min(list));  


	}
}
