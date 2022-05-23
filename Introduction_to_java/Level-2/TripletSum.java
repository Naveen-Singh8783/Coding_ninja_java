/**
 Question:
 You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.
 */

public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        int count = 0;
        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j<arr.length-1; j++){
                for(int z=j+1; z<arr.length; z++){
                    if(arr[i] + arr[j] + arr[z] == x)
                    count++;
                }
                
                
            }
        }
        
        return count;
    }

}