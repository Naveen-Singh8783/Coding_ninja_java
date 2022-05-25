/**
 Question:
 Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Bubble Sort'.
 */

 
public class Solution {  

    public static void bubbleSort(int[] arr){
    	//Your code goes here
        for(int i=1; i<arr.length-1; i++){
            
            boolean check = true;
            
            for(int j=0; j<arr.length-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    check = false;
                }
            }
            
            if(check)
                return;
        }
    }  

}