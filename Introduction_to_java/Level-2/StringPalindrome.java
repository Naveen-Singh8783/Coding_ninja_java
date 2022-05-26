/**
 Question:
 Given a string, determine if it is a palindrome, considering only alphanumeric characters.
 */

public class Solution {

	public static boolean isPalindrome(String str) {
		//Your code goes here
        int low = 0;
        int high = str.length()-1;
        
        while(low < high){
            if(str.charAt(low) != str.charAt(high))
                return false;
            
            low++;
            high--;
        }
        
        return true;
	}

}