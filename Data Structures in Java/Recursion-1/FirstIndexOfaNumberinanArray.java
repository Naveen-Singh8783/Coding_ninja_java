/*
Question:
Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.
*/

public class Solution {
    
    static int index = -1;

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        index++;
        if(index == input.length)
            return -1;
        
        int i = -1;
        if(input[index] == x)
            return index;
        else
            i = firstIndex(input, x);
        
        return i;
		
	}
	
}