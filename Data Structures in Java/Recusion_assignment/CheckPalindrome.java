/**
 Question:
 Check whether a given String S is a palindrome using recursion. Return true or false.
 */

public class solution {

	public static boolean isStringPalindrome(String input) {
		// Write your code here
        if(input.length() <= 1)
        	return true;
        
        
        boolean check;
        if(input.charAt(0) == input.charAt(input.length()-1))
				check = isStringPalindrome(input.substring(1,input.length()-1));
        else
            check = false;
        
        return check;
	}
}
