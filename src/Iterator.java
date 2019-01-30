import java.util.ArrayList;
import java.util.*;

public class Iterator {

	public static void main(String[] args) 
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i=1; i<= 10; i++)
		{
			l.add(i);
		}
		System.out.println("ArrayList:- " + l);
		
		//Iterator define
		Iterator<Integer> it = l.iterator<Integer>();
		while(it.hasnext())
		{
			int a = (Interger) it.next();
		if(a%2==0)
		{
			System.out.println("Even number = " + a);
		}
		}
		Vector v = new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements())
		{
			Integer i=(Integer) v.nextElements();
			System.out.println(i);
		}
	}
}
