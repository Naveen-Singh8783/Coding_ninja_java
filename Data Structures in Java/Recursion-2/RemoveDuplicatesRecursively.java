/**
 Question:
 Given a string S, remove consecutive duplicates from it recursively.
 */
public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		if(s.length() == 1)
            return s;
        
        String str = removeConsecutiveDuplicates(s.substring(1));
        if(s.charAt(0) == s.charAt(1))
            return str;
        else
            return s.charAt(0) + str;
	}

}