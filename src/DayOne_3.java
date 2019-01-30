import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Write a program in Java to display the multiplication table of a given integer. 
*
*Test Data
*Input the number (Table to be calculated) : Input number of terms : 5
*Expected Output :
*5 X 0 = 0                                                                        
*5 X 1 = 5                                                                        
*5 X 2 = 10                                                                       
*5 X 3 = 15                                                                       
*5 X 4 = 20                                                                       
*5 X 5 = 25
*/

public class DayOne_3 {

	public static void main(String[] args) throws IOException 
	{
				
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.print("Input the number (Table to be calculated) :");
        String s1 = myReader.readLine();
        int num = Integer.parseInt (s1);
        System.out.print("Input number of terms : ");
        String s2 = myReader.readLine();
        int t1 = Integer.parseInt (s2);
        
        for (int i=0; i<=t1; i++)
        {
        	int j=0;
        	j = num * i;
        	System.out.println(num + " X " + i + " = " + j );
        }
      	}
}
