interface Drawable{  
void draw();  
default void msg(){System.out.println("msg Method --- Drawable Interface");}  
}  

class Rectangle implements Drawable{  
public void draw(){System.out.println("Draw Method --- Rectangle Interface");}  
}

public class TestInterfaceDefault {

	public static void main(String[] args) {
		Drawable d = new Rectangle();  
		d.draw();  
		d.msg();  

	}

}
