
public class VarargsTest {

	static void display(int a, String... values) {

		System.out.println(a);
		for (String s : values) {
			System.out.println(s);
		}

	}

	public static void main(String[] args) {

		display(1);// zero argument
		display(1, "my", "name", "is", "varargs", "my", "name", "is");// four
																		// arguments

	}

}
