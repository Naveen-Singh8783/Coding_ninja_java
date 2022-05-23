/*
Question:

You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in the order they appear in the first array/list(ARR1)

*/

public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here 
        for(int i=0; i < arr1.length; i++){
				for(int z=0; z<arr2.length; z++){
                    if(arr1[i] == arr2[z]){
                        System.out.print(arr1[i]+" ");
                        arr2[z] = Integer.MIN_VALUE;
                        break;
                    }
                }
        }
        
        
    }
}