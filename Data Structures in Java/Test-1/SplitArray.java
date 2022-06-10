/**
Question:
Given an integer array A of size N, check if the input array can be splitted in two parts such that -
- Sum of both parts is equal
- All elements in the input, which are divisible by 5 should be in same group.
- All elements in the input, which are divisible by 3 (but not divisible by 5) should be in other group.
- Elements which are neither divisible by 5 nor by 3, can be put in any group.
Groups can be made with any set of elements, i.e. elements need not to be continuous. And you need to consider each and every element of input array in some group.
Return true, if array can be split according to the above rules, else return false.
 */

import java.util.*;
public class solution {

public static boolean helperFunction(int arr[], int n, int start, int lsum, int rsum){
        
        if (start == n){
            return lsum == rsum;
        }
        
        if (arr[start]%5==0){
            lsum += arr[start];
        }
        
        else if (arr[start]%3==0){
            rsum += arr[start];
        }
        
        else {
            
            return helperFunction(arr,n,start+1,lsum+arr[start], rsum) || helperFunction(arr, n, start+1, lsum, rsum+arr[start]);
        }
        
        return helperFunction(arr,n,start+1,lsum,rsum);
    }

	public static boolean splitArray(int input[]) {
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        
        int lsum = 0;
        int rsum = 0;
        int start = 0;
        int n = input.length;
        
        return helperFunction(input,n,start,lsum,rsum);
		
	}
	

}
