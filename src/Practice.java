

public class Practice
{

	// main method.. 
	public static void main (String args[])
	{
		 int A = 1;
		System.out.println("The value of A : " + A);
		
		 char a;
		         //Initialize the char variable with value 'P'
	        a = 'P';
	 
	        //Print the value of char variable
	      	System.out.println("Value of char is : " + a + A );
	 		
			//Use the double keyword to declare decimal variable
			double PI;
	 
			//Initialize the double variable with value 'P'
	        PI = 3.14159;
	 
	      //Print the value of double variable
	        System.out.println("PI: " + PI);
		
	        int Ten = 10;	
			int Twenty = 20;
			int Thirty = 30;
		    boolean bValue;
		    int iValue;
	 
		    bValue = (Thirty == Twenty + Ten) ? true: false;
		    System.out.println( "The boolean value of the variable 'bValue' is : " +  bValue ); //true
	 
		    iValue = ((Thirty == Twenty + Ten)) ? 50: 100;
		    System.out.println( "The int Value of the variable iValue is : " + iValue ); //50
	 
		    //This is a use of Not Logical Operator
		    iValue = (!(Thirty == Twenty + Ten)) ? 50: 100;
		    System.out.println( "The int Value of the variable iValue is : " + iValue ); //100
		    
		    
			// This will print -- 0,1,2,3,4,5
			for(int Increment = 0;Increment<=5;Increment++){
				System.out.println("Count is  ==> " + Increment );
			}
	 
			System.out.println("<==== Next Count ====>");
			// This will print -- 5,4,3,2,1,0
			for(int Decrement = 5;Decrement>=0;Decrement--){
				System.out.println("Count is ==> " + Decrement );
			}
	 
			System.out.println("<==== Next Count ====>");
			// This will print -- 0,2,4
			for(int Increment = 0;Increment<=10;Increment+=2)
			{
				System.out.println("Skip every one another  ==>"+ Increment );
		    
			}
		
	}
	}


