/**
 Question:
 Sort an array A using Quick Sort.
Change in the input array itself. So no need to return or print anything.
 */
/*
	To apply the method explained in the hint video, we have to add two more parameters in the function call. This can be done by calling a helper function from given function. The helper function can have three parameters: array, start index, end index.  
	
	Skeleton code to achieve this:
	public class Solution {
		public static void quickSort(int[] input, int startIndex, int endInedx) {
			// your code goes here
		}
	
		public static void quickSort(int[] input) {
			quickSort(input, 0, input.length - 1);
		}
	
	}
	
*/


public class Solution {
	
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
        quickSort(input, 0, input.length - 1);
		
	}
    
    public static void quickSort(int[] input, int startIndex, int endIndex) {
			// your code goes here
        	if(startIndex >= endIndex)
                return;
        
        int i = partition(input, startIndex, endIndex);
        quickSort(input, startIndex, i-1);
        quickSort(input, i+1, endIndex);
        
	}
    
    public static int partition(int[] input, int si, int ei){
        int pivot = input[si];
        int count = 0;
        for(int i=si; i<=ei; i++)
        {
            if(input[i] < pivot)
                count++;
        }
        
        input[si] = input[si + count];
        input[si + count] = pivot;
        int i=si;
        int j=ei;
        
        while(i < j){
            if(input[i] < pivot)
                i++;
            else if(input[j] >= pivot)
                j--;
            else{
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }
        
        return si+count;
    }
	
}