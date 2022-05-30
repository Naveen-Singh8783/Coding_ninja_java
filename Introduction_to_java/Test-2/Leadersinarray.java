/**
Question:
Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].
Print all the leader elements separated by space and in the same order they are present in the input array.
 */

public class Solution {

	public static void leaders(int[] input) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
		for(int i=0; i<input.length-1; i++){
            boolean check = true;
            for(int j=i+1; j<input.length; j++){
                if(input[j] > input[i]){
                    check = false;
                    break;
                }
            }
            
            if(check)
                System.out.print(input[i]+" ");
        }
        
        System.out.print(input[input.length-1]);
	}
	
}
