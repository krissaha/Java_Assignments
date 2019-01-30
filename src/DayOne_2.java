/* 2.Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
*Test Data
*Input number: 3 
*Expected Output :
*Wednesday
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DayOne_2 {

	public static void main(String[] args) throws IOException 

	{
				
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.print("Input the number of WeekDay :");
        String d = myReader.readLine();
        int day = Integer.parseInt ( d);
  
        switch (day)
        {
        	case 1:
        	{
        	System.out.println("You Enter Monday");	
        	break;
        	}
        	
        	case 2:
        	{
        	System.out.println("You Enter Tuesday");	
        	break;
        	}
        	
        	case 3:
        	{
        	System.out.println("You Enter Wednesday");	
        	break;
        	}
        	
        	case 4:
        	{
        	System.out.println("You Enter Thrusday");	
        	break;
        	}
         
        	case 5:
        	{
        	System.out.println("You Enter Friday");	
        	break;
        	}
        	
        	case 6:
        	{
        	System.out.println("You Enter Saturday");	
        	break;
        	}
        	
        	case 7:
        	{
        	System.out.println("You Enter Sunday");	
        	break;
        	}
        	
        	default: 
            System.out.println("Please enter a valid Day !!! ");  
        	
        }   
    } 		
}