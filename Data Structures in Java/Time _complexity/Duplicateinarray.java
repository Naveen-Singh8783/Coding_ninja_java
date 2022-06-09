/**
 Question:
 You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3, and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
 */
public class Solution {

	public static int findDuplicate(int[] arr) {
		//Your code goes here
        mergeSort(arr);
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] == arr[i])
                return arr[i];
        }
        
        return -1;
	}
    
	public static void mergeSort(int[] arr){
        if(arr.length == 1)
            return;
        
        int[] a =  new int[arr.length/2];
        int[] b = new int[arr.length - a.length];
        
        for(int i=0; i<a.length; i++)
            a[i] = arr[i];
        
        for(int i=a.length; i<arr.length; i++)
            b[i-a.length] = arr[i];
        
        mergeSort(a);
        mergeSort(b);
        merge(a, b, arr);
    }
    
    public static void merge(int[] a, int[] b, int[] arr){
        int i=0;
        int j=0;
        int k=0;
        
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]){
                arr[k] = a[i];
                k++;
                i++;
            }else{
                arr[k] = b[j];
                k++;
                j++;
            }
        }
        
        while(i<a.length){
            arr[k] = a[i];
                k++;
                i++;
        }
        
        while(j<b.length){
            arr[k] = b[j];
                k++;
                j++;
        }
    }
}