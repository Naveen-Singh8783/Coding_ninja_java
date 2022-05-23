/**
 Question:
 You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.
Note:
You need to change in the given array/list itself. Hence, no need to return or print anything. 
 */

public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int zeros = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                arr[i] = 1;
               zeros++; 
            }
                
        }
        
        int i=0;
        while(zeros > 0){
            arr[i] = 0;
            i++;
            zeros--;
        }
            
    }   
}