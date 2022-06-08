/**
 Question:
 For a given array/list(ARR) of size 'N,' find and return the 'Equilibrium Index' of the array/list.
Equilibrium Index of an array/list is an index 'i' such that the sum of elements at indices [0 to (i - 1)] is equal to the sum of elements at indices [(i + 1) to (N-1)]. One thing to note here is, the item at the index 'i' is not included in either part.
If more than one equilibrium indices are present, then the index appearing first in left to right fashion should be returned. Negative one(-1) if no such index is present.
 */
public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
        if(arr.length <= 1)
            return -1;
        
        int sum_right = 0;
        int sum_left = 0;
        for(int i=0; i<arr.length; i++)
            sum_right += arr[i];
        
        sum_right -= arr[0];
        for(int i=1; i<arr.length; i++){
            sum_left += arr[i-1];
            sum_right -= arr[i];
            
            if(sum_left == sum_right)
                return i;
        }
        
        return -1;
	}
}