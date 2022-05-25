/**
 Question:
 Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). The idea here is to represent each array/list as an integer in itself of digits N and M.
You need to find the sum of both the input arrays/list treating them as two integers and put the result in another array/list i.e. output array/list will also contain only single digit at every index.
 */

public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
       
        
        int k = output.length-1;
        
        while(i>=0 && j>=0){
            int temp = arr1[i] + arr2[j] + carry;
            
            if(temp >= 10){
                carry = 1;
                output[k] = temp%10;
            }else{
                carry = 0;
                output[k] = temp;
            }
            j--;
            i--;
            k--;
        }
        
        while(i>=0){
            int temp = arr1[i] + carry;
             if(temp >= 10){
                carry = 1;
                output[k] = temp%10;
            }else{
                carry = 0;
                output[k] = temp;
            }
            i--;
            k--;
        }
        
        while(j>=0){
            int temp = arr2[j] + carry;
             if(temp >= 10){
                carry = 1;
                output[k] = temp%10;
            }else{
                carry = 0;
                output[k] = temp;
            }
            j--;
            k--;
        }
        
        if(carry == 1)
            output[0] = 1;
    }

}