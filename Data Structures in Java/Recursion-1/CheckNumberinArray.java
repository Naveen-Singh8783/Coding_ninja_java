/**
 Question:
 Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.
 */
public class Solution {
	static int i = -1;
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        i++;
        if(i == input.length)
            return false;
        
        boolean check = false;       
        if(input[i] == x)
            return true;
		else
           check = checkNumber(input, x);
        
        return check;
	}
}