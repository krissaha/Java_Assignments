public class s_s
{
	public	static 	void main (String args[])
	{
		String s1 = "INDIA";
		String s2 = "WEST BENGAL";
		String s4 = s1.concat(s2);
		String s3 = s1 + " " + s2;
		
		//System.out.println(s3 + " " + s4 );
		//System.out.println("Length of the string = " + s2.length());	
		//System.out.println("Character at position 5: " + s1.charAt(4));
		//System.out.println("Index of Character 'B': " + s2.indexOf('T'));
		
		System.out.println("Compare To 'ROCKSTAR': " + s1.compareTo("IN"));	
		System.out.println("Contains sequence 'tar': " + s1);
		
		
	}
}