import java.util.regex.Pattern;

import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;

public class Regularexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Accc";
		String str2 = "333-000-222";
		
		System.out.println(str.matches("[^a-zA-Z]ccc"));
		System.out.println(str.matches("\\wccc"));             // double back slash followed by w letter for word
		System.out.println(str.matches("\\d"));                // double back slash with d for decimal char
		System.out.println(str2.matches("\\d{3}\\d{3}\\d{3}")); // double back slash followed by quaantifier.
		System.out.println(str2.matches("\\d{3}[.-]\\d{3}[.-]\\d{3}")); // double back slash followed by quaantifier.
																		//s - stand for blank space.
		System.out.println(str2.matches("\\d{3}[.-\\s]+\\d{3}[.-]\\d{3}")); //quatifier + for one or more time. or * for 0 or more times
																			// ? 0 or 1 or none.
		Pattern pat = Pattern.compile(str2);
		

	}

}
