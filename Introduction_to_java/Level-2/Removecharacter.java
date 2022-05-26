/**
 Question:
 For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.
The input string will remain unchanged if the given character(X) doesn't exist in the input string.
 */

 
public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
        String ans = "";
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ch)
                ans = ans + str.charAt(i);
        }
        
        return ans;
	}

}