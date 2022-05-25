/**
 Question:
 You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.
If N <= 1 or all the elements are same in the array/list then return -2147483648 or -2 ^ 31(It is the smallest value for the range of Integer)
 */
public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
       	int max = Integer.MIN_VALUE;
    	int sec_max = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                sec_max = max;
                max = arr[i];
				
            }else{
                if(arr[i] > sec_max && arr[i] != max)
                    sec_max = arr[i];
            }    
        }
        
        if(arr.length <= 1 || sec_max == Integer.MIN_VALUE)
                return -2147483648;
            
            return sec_max;
    }

}