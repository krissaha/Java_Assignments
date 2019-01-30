import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<String> al=new ArrayList<String>();  
//		al.add("Amit");  
//		al.add("Vijay");  
//		al.add("Kumar");  
//		al.add(1,"Sachin");  
//		System.out.println("An element at 2nd position: "+al.get(2));  
//		for(String s:al){  
//		System.out.println(s); 
//		}
//		
		List<String> al = new ArrayList<String>();    
        al.add("Amit");    
        al.add("Vijay");    
        al.add("Kumar");    
        al.add(1,"Sachin");    
        ListIterator<String> itr = al.listIterator();    
        System.out.println("Traversing elements in forward direction");    
        while(itr.hasNext()){    
             
        System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());    
        }    
        System.out.println("Traversing elements in backward direction");    
        while(itr.hasPrevious()){    
          
        System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());    
        }    
			
	}
}
