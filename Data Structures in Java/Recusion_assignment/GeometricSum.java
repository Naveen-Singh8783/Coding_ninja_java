/**
 Question:
 Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
using recursion.
 */

import java.lang.Math;
public class solution {

	public static double findGeometricSum(int k){
		// Write your code here
        if(k == 0)
            return 1;
        
   
        
        return ((double)1/Math.pow(2, k)) + findGeometricSum(k-1);
        
      

	}
}
