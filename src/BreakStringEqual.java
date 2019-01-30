import java.util.Scanner;

public class BreakStringEqual {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);  
        System.out.print("Guruji please enter the String to be devided :-");
        String s = s1.nextLine();
        System.out.println("!!! Thank you Guruji !!!");
		int len = s.length();
		String sep = "";
		System.out.println("Sirji your entered String Length is = " + len);
		for (int i = 1; i <= 10; i++) {
			int t = len % i;
			if (t == 0) {
				System.out.println("Guruji above String will be devided in =" + i);
			} else {
				System.out.println("Sorry Guruji above String cannot be devided in =" + i);
			}
		}
		Scanner in = new Scanner(System.in);  
        System.out.print("Guruji please enter your choise to break the String:-");    
        int guru = in.nextInt();
		
		for (int j = 0; j <= len - 1; j++) {
			char c = s.charAt(j);
			sep = sep + c;
			int seplen = sep.length();
			if (seplen == guru) {
				System.out.println(sep);
				sep = "";
			} else {

				// System.out.print(c);
			}
		}
	System.out.println("Thank you Guruji Please visit again !!!");
	}
}
