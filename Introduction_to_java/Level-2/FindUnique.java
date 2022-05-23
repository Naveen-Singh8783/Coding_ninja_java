/**
 Question:
 You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
 Note:
Unique element is always present in the array/list according to the given condition.
 */

public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here
       for(int i=0; i<arr.length; i++){
			boolean check = true;
            for(int j=0; j<arr.length; j++){
                if(i != j){
                    if(arr[i] == arr[j])
                        check = false;
                }
            }
           
           if(check)
               return arr[i];
           
           
           
       }
        
        return -1;
    }
}