/**
 Question:
 Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
 */

public class solution {

	// Return the updated string
	public static String addStars(String s) {
		// Write your code here
        if(s.length() == 1)
            return s;
        
        String str = s.substring(1);

        if(s.charAt(0) == s.charAt(1))
            return s.charAt(0)+"*"+addStars(str);
        else
            return s.charAt(0)+addStars(str);

	}
}
