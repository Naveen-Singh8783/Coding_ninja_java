/**
 Question:
 Sort an array A using Merge Sort.
Change in the input array itself. So no need to return or print anything.
 */
public class solution {

	public static void mergeSort(int[] input){
		// Write your code here
        if(input.length <= 1)
            return;
        
        
        int a[] = new int[input.length/2];
        int b[] = new int[input.length - a.length];
        
        for(int i=0; i<a.length; i++)
            a[i] = input[i];
        
        for(int i=a.length; i<input.length; i++)
            b[i-a.length] = input[i];
        
        mergeSort(a);
        mergeSort(b);
        
        merge(a, b, input);
		
	}
    
    public static void merge(int []s1, int []s2, int []d){
        int i=0;
        int j=0;
        int k=0;
        
        while(i < s1.length && j < s2.length){
            if(s1[i] >= s2[j]){
                d[k] = s2[j];
                j++;
                k++;
            }else{
                d[k] = s1[i];
                i++;
                k++;
            }
        }
        
        while(i < s1.length){
            d[k] = s1[i];
            i++;
            k++;
        }
        
        while(j < s2.length){
            d[k] = s2[j];
            j++;
            k++;
        }
    }
}
