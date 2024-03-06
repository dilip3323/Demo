import java.util.Scanner;

public class FrequentofString {
	
	public static void main(String[] args) {
		
		
		//abcbfdabcbffb
		//	
		
		System.out.println("Enter String to be searched in");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println("Enter String to be searched");
		String f = sc.nextLine();
		int count=0;
		while(s.contains(f)) {
			count++;
			s= s.replaceFirst(f, "");
		}
		System.out.println("count is"+count+" and new string: "+s);
		
		
		
	}

}
