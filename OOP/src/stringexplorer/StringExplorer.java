package stringexplorer;
/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		
		// Demonstrate the toUpperCase method.
		String upperCase = sample.toUpperCase();
		System.out.println("sample.toUpperCase() = " + upperCase);
		
		// Demonstrate the substring(int start) method.
		String substring01 = sample.substring(15);
		System.out.println("sample.subtring(15) = " + substring01);
		
		// Demonstrate the substring(int start, int end) method.
		String substring02 = sample.substring(3, 23);
		System.out.println("sample.substring(3, 23) = " + substring02);
		
		// Demonstrate the charAt(int index) method.
		char char01 = sample.charAt(18);
		System.out.println("The character at value 18 in our string is " + char01);
		
		// Demonstrate the compareTo(String) method.
		int order;
		order = sample.compareTo("The quick brown fox jumped over the lazy ");
		System.out.println(order);
		
		// Demonstrate the equals(String) method.
		String test01 = new String("The quick brown fox jumped over the lazy dog.");
		if(sample.equals(test01)) {
			System.out.println("The strings are the same.");
		}
		else {
			System.out.println("The strings are not the same.");
		}
		
		// Demonstrate the equalsIgnoreCase(String) method.
		String test02 = new String("THE QUICK BROWN FOX JUMPED OVER THE LAZY DOG.");
		if(sample.equalsIgnoreCase(test02)) {
			System.out.println("The strings are the same when case is ignored.");
		}
		else {
			System.out.println("The strings are not the same when case is ignored.");
		}
		
		// Demonstrate the length() method.
		System.out.println("The string length is " + sample.length() + ".");
		
		// Demonstrate the replace(char old, char new) method.
		String samplenew;
		samplenew = sample.replace('o', 'i');
		System.out.println("\"" + sample + "\"" + " with 'o' characters replaced to 'i' characters is " + "\"" + samplenew + "\"");
		
		// Demonstrate the trim() method.
		int len;
		String welcome = "     Hello!     ";
		len = welcome.length();
		System.out.println("The length of the string welcome before applying the trim method is " + len);
		welcome = welcome.trim();
		len = welcome.length();
		System.out.println("The length of the string welcome after applying the trim method is " + len);
		
	}

}
