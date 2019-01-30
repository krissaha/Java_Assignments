import java.awt.List;
import java.util.ArrayList;
import java.util.*;

public class Collection1 {

	public static void main(String[] args)
	{
	
			
		ArrayList<Integer> list = new ArrayList<Integer>();  
        list.add(46);  
        list.add(67);  
        list.add(24);  
        list.add(16);  
        list.add(8);  
        list.add(12);  
        System.out.println("Value of maximum element from the collection: " + Collections.min(list));  
        
        ArrayList<String> list1 = new ArrayList<String>();  
        list1.add("C");  
        list1.add("Core Java");  
        list1.add("Advance Java");  
        System.out.println("Initial collection value:" + list);  
        Collections.addAll(list1, "Servlet","JSP");  
        System.out.println("After adding elements collection value:" + list); 
        System.out.println("Value of maximum element from the collection: " + Collections.min(list1));
        
	}

}
