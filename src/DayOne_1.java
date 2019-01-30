import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*1. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
*Test Data
*Input an integer between 0 and 1000: 565
*Expected Output :
*The sum of all digits in 565 is 16
*/

public class DayOne_1 {

	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.print("Input an Integer between 0 and 1000 :- ");
        String n = br.readLine();
        int num = Integer.parseInt(n);
        
        int fDigit = num % 10;
        int rNumber = num / 10;
        int sDigit = rNumber % 10;
        rNumber = rNumber / 10;
        int tDigit = rNumber % 10;
        rNumber = rNumber / 10;
        int foDigit = rNumber % 10;
        int sum = tDigit + sDigit + fDigit + foDigit;
        System.out.println("The sum of all digits for " + num + " is : - " + sum);
	}
}
