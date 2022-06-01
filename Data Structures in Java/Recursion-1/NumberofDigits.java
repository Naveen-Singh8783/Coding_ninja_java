/**
 Question:
 Given the code to find out and return the number of digits present in a number recursively. But it contains few bugs, that you need to rectify such that all the test cases should pass.
 */
public class Solution {

	public static int count(int n){
		//Write your code here
        if(n == 0)
            return 0;
        
        n /= 10;
        int c = 1 + count(n);
        
        return c;
        
    }

}
