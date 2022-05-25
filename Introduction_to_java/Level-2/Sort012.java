/**
 Question:
You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.
'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.
 */

public class Solution {

    public static void sort012(int[] arr){
    	//Your code goes here
        int zeros = 0;
        int ones = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0)
                zeros++;
            if(arr[i] == 1)
                ones++;
        }
        
        int i = 0;
        while(zeros > 0){
           arr[i] = 0;
            i++;
            zeros--;
        }
        
        while(ones > 0){
           arr[i] = 1;
            i++;
            ones--;
        }
        
        while(i < arr.length){
            arr[i] = 2;
            i++;
        }
            
    }

}