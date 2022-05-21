/**
Question:
Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.

*/


public class Solution {
	
	public static boolean checkMember(int n){
				
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
        if(n == 0)
            return true;
        
        int first = 0;
        int sec = 1;
        
        int sum = 0;
        
        while(sec <= n){
            sum = first + sec;
            if(sum == n)
                return true;
            
            
            first = sec;
            sec = sum;
        }
        
        return false;

	}
	

}
