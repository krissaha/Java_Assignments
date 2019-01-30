interface Showable {
	void show();

	interface Message {
		void msg();
	}
}

public class TestNestedInterface1 implements Showable.Message {
	public void msg() {
		System.out.println("Hello nested interface");
	}

	public static void main(String[] args) 
	{
		Showable.Message s = new TestNestedInterface1();
		s.msg();
	}
}
