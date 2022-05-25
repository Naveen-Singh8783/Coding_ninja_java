/**
 Question:
 You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
 */

public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        
       
        reverse(arr,0, arr.length-1);
        reverse(arr,0, arr.length-1-d);
        reverse(arr, arr.length-d, arr.length-1);
    }
    
    public static void reverse(int[] arr, int low, int high){
        if(high == 0)
            return;
        
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        
        
    }

}