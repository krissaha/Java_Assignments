import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(20);
		h.add(30);
		h.add(40);
		System.out.println(h.add(30));
		System.out.println(h.add(50));
		System.out.println(h);
		System.out.println(h.remove(h));
	}
}
