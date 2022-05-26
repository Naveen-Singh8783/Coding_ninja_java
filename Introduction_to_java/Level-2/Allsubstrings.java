/**
 Question:
 For a given input string(str), write a function to print all the possible substrings.
 */

public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here
        for(int len=1; len<=str.length(); len++){
            for(int start=0; start<=str.length()-len; start++){
                int end = start + len - 1; 
                System.out.println(str.substring(start, end+1));
            }
                
        }
        
	}

}