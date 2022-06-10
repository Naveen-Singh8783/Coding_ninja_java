/**
 Question:
 Given two string s and t, write a function to check if s contains all characters of t (in the same order as they are in string t).
Return true or false.
Do it recursively.
E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order. So function will return true.
 */

public class Solution {
	public static boolean checkSequence(String a, String b) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        if(a.length() == 0 || b.length() == 0){
            if(b.length() == 0)
                return true;
            else
                return false;
        }
            
        
        boolean check = true;
        if(a.charAt(0) == b.charAt(0))
           check = checkSequence(a.substring(1),b.substring(1));
        else
           check = checkSequence(a.substring(1),b); 
        
       return check;

	}
}