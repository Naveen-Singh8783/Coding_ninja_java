/**
 Question:
 You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
You don't need to print or return anything, just change in the input array itself.
 */

 
public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        for(int i=1; i<arr.length; i+=2){
            int temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;
        }
    }
}