/**
 Question:
 Given is the code to print numbers from 1 to n in increasing order recursively. But it contains few bugs that you need to rectify such that all the test cases pass.
 */
public class Solution {

	public static void print(int n){
		//Write your code 
        if(n == 0 )
            return;
        
        print(n-1);
        System.out.print(n+" ");
        
        return;
    }
}
