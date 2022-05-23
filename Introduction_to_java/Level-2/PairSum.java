/**
 Question:
 You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.
 */
public class Solution {  

    public static int pairSum(int arr[], int x) {
    	//Your code goes here
        int count = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == x)
                    count++;
            }
        }
        
        return count;
    }
}