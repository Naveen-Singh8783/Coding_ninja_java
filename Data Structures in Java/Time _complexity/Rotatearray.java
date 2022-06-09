/**
Question:
You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
 Note:
Change in the input array/list itself. You don't need to return or print the elements.
 */

public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        
       rotate_element(arr, 0, arr.length-1);
        rotate_element(arr,0,arr.length-1-d);
        rotate_element(arr,arr.length-d,arr.length-1);
        
    }
    
    public static void rotate_element(int[] arr, int si, int ei){
        while(si < ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

}