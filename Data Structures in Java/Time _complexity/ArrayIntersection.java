/**
 Question:
 You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
 */
public class Solution {

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
        mergeSort(arr1);
        mergeSort(arr2);
        
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }else if(arr1[i] < arr2[j])
                    break;
            }
        }
	}
    
    public static void mergeSort(int[] arr){
        if(arr.length <= 1)
            return;
        
        int[] a = new int[arr.length/2];
        int[] b = new int[arr.length-a.length];
        
        for(int i=0; i<a.length;i++)
            a[i] = arr[i];
        
        for(int i=a.length; i<arr.length;i++)
            b[i-a.length] = arr[i];
        
        mergeSort(a);
        mergeSort(b);
        merge(a, b, arr);
    }
    
    public static void merge(int[] a, int[] b, int[] arr){
        int i=0;
        int j=0;
        int k=0;
        
        while(i < a.length && j<b.length){
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
        
        while(i<a.length){
            arr[k] = a[i];
            i++;
            k++;
        }
        
        while(j<b.length){
            arr[k] = b[j];
            j++;
            k++;
        }
    }

}