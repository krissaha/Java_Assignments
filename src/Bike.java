
public class Bike {

	int speed;
	Bike()
	{
		System.out.println("Constructor is invoked");
	}
	
	{
		System.out.println("instance block invoked");
	}
	public static void main(String[] args) 
	{
		Bike b1= new Bike();
		Bike b2 = new Bike();

	}

}
