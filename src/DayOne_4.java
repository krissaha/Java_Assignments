import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOne_4 {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter number :- ");
		String s1 = br.readLine();
		int n = Integer.parseInt (s1);
		
	      	   for(int i = n; i>=1; --i) 
	      	   {
	            for(int s = 0; s<= n-i; s++)
	            {
	                System.out.print("  ");
	            }
	            for(int j=i; j <= 2*i-1; ++j) 
	            {
	                System.out.print("* ");
	            }

	            for(int j = 0; j < i - 1; ++j)
	            {
	                System.out.print("* ");
	            }

	            System.out.println();
	        }
	    }

	}

