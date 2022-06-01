/**
 Question:
 Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.
 */
public class Solution {
    static int i = -1;

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        i++;
        if(i == input.length)
            return 0;
        
        
        int s = input[i] + sum(input);
        return s;
            
		
	}
}