/**
 Question:
 Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
 */

public class solution {

	public static int countZerosRec(int input){
		// Write your code here
        if(input == 0)
            return 1;
        
        int lastDigit = input%10;
        int smallerNumber = input/10;
        int count = 0;
        if(smallerNumber == 0)
            return 0;
        else if(lastDigit == 0)
            count = 1 + countZerosRec(smallerNumber);
        else
            count = countZerosRec(smallerNumber);
        
        return count;
        
	}
}
