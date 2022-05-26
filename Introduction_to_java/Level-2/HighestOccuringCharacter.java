/**
 Question:
 For a given a string(str), find and return the highest occurring character.
Example:
Input String: "abcdeapapqarr"
Expected Output: 'a'
Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
If there are two characters in the input string with the same frequency, return the character which comes first.
 */

public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
        int freq_arr[] = new int[256];
        int count = 0;
        
        for(int i=0; i<str.length(); i++)
            freq_arr[str.charAt(i)]++;
        
        char ans = str.charAt(0);
        
        for(int i=0; i<str.length(); i++){
            if(freq_arr[str.charAt(i)] > count){
                ans = str.charAt(i);
                count = freq_arr[str.charAt(i)];
            }
                
        }
        
        return ans;
	}

}