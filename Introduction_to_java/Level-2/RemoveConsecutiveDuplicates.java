/**
 Question:
 For a given string(str), remove all the consecutive duplicate characters.
Example:
Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc"
 */

public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        String ans = "";
        ans = ans + str.charAt(0);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(i-1))
                ans = ans + str.charAt(i);
        }
        
        return ans;
	}

}