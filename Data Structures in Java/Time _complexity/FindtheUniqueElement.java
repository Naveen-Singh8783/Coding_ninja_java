/**
 Question:
 You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
 */
public class Solution {

	public static int findUnique(int[] arr) {
        
		//Your code goes here
        if(arr.length == 0)
            return 0;
        
        if(arr.length == 1)
            return arr[0];
        
        mergeSort(arr);
        for(int i=1; i<arr.length-1; i++){
            if(arr[i] != arr[i+1] && arr[i] != arr[i-1])
                return arr[i];
        }
        
        if(arr[arr.length-1] != arr[arr.length-2])
            return arr[arr.length-1];
        
        return 0;
	}
    
    public static void mergeSort(int[] arr){
        if(arr.length == 1)
            return;
        
        int[] a = new int[arr.length/2];
        int[] b = new int[arr.length - a.length];
        for(int i=0; i<a.length;i++)
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
                i++;
                k++;
            }else{
                arr[k] = b[j];
                j++;
                k++;
            }
        }
        
        while(i < a.length){
            arr[k] = a[i];
                i++;
                k++;
        }
        
        while(j < b.length){
            arr[k] = b[j];
                j++;
                k++;
        }
    }
}