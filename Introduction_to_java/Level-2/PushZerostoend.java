/**
 Question:
 You have been given a random integer array/list(ARR) of size N. You have been required to push all the zeros that are present in the array/list to the end of it. Also, make sure to maintain the relative order of the non-zero elements.
 */
public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
        int j=0;
        int zeros = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0)
                zeros++;
            else{
                arr[j] = arr[i];
                j++;
            }
            
        }
        
        while(zeros > 0){
            arr[j] = 0;
            j++;
            zeros--;
        }
    }

}