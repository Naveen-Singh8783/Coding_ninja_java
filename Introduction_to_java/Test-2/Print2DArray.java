/**
 Question:
 Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time
 */
public class solution {
	public static void print2DArray(int input[][]) {
		// Write your code here
        if(input.length <= 0)
            return;
        
        int i = 0;
        int count = 0;
        int row = input.length;
        
        while(i < input.length){
            for(int j=0; j<input[0].length; j++)
                System.out.print(input[i][j]+" ");
            
            System.out.println();
            if(count == row-1-i){
                i++;
                count = -1;
            }
            count++;
        }
        

	}
}