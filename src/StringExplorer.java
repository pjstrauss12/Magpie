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
				
		//  Demonstrate the toUpperCase method.
		String upperCase = sample.toUpperCase();
		System.out.println ("sample.toUpperCase() = " + upperCase);
        System.out.println ("After toUpperCase(), sample = " + sample);
        
        // Demonstrate the substring method!!!
        String subguy = sample.substring(4,9);
        System.out.println(subguy);

        //Demonstrate the sneaky substring method
        String target = "quick";
        int startingLocation = sample.indexOf(target);
        int len = target.length();
        System.out.println(sample.substring(startingLocation, startingLocation+len));

        // let's look at substring's overloaded method
        System.out.println(sample.substring(startingLocation+len));

        //break character
        System.out.println("Lalalala\nlalalala");

        //equals
        String one = "one";
        String two = "one";

        System.out.println(one.equals(two));

        int[] x = {1, 2, 3, 4};
        int[] y = {1, 2, 3, 4};

        System.out.println(x.equals(y));

	}
}


