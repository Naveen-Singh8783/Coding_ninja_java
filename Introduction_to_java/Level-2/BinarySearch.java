/**
 Question:
 You have been given a sorted(in ascending order) integer array/list(ARR) of size N and an element X. Write a function to search this element in the given input array/list using 'Binary Search'. Return the index of the element in the input array/list. In case the element is not present in the array/list, then return -1.
 */

public class Solution { 

    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int first = 0;
        int last = arr.length - 1;
        
        while(first <= last){
         	int mid = (first + last)/2;  
            
            if(arr[mid] < x)
                first = mid+1;
        	else if(arr[mid] > x)
                last = mid-1;
            else
                return mid;
            
        }
        
        return -1;
    }

}