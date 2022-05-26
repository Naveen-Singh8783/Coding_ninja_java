/**
 Question:
For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
Permutations of each other
Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.

Example: 
str1= "sinrtg" 
str2 = "string"

The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings are a permutation of each other.
 */

public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
        if(str1.length() != str2.length())
            return false;
        
    	int freq_arr[] = new int[256];
        
        for(int i=0; i<str1.length(); i++)
            freq_arr[str1.charAt(i)]++;
        
        for(int i=0; i<str2.length(); i++)
            freq_arr[str2.charAt(i)]--;
        
        
        for(int i=0; i<256; i++){
            if(freq_arr[i] != 0)
          		return false;
        }
        
        return true;
        
	}

}
