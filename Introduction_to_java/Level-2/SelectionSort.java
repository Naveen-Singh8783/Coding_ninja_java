/**
 Question:
 Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Selection Sort'.
 */

 
public class Solution {  

    public static void selectionSort(int[] arr) {
    	//Your code goes here
        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
					if(arr[j] < arr[min])
                        min = j;
            }
            
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }   

}