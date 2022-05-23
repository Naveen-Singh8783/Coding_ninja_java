/**
 Question:
 You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.
Note:
You need not print the array. You only need to populate it.
 */

 
public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	//Your code goes here
        int first = 0;
        int last = n-1;
        int num = 1;
        
        while(first <= last){
            arr[first] = num;
            num++;
            if(first != last)
                arr[last] = num;
            num++;
            first++;
            last--;
        }
        
    
    }
}