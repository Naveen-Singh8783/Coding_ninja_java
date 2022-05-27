/**
 Question:
 For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.
 */

public class Solution {

	public static void totalSum(int[][] mat) {
		//Your code goes here
        if(mat.length == 0){
            System.out.println(0);
            return;
        }
        
        int row = mat.length;
        int col = mat[0].length;
        
        
        
        int sum = 0;
        
        //upper boundary
        for(int j=0; j<col; j++)
            sum += mat[0][j];
        
        
        //rigth boundary
        for(int i=1; i<row; i++)
            sum += mat[i][col-1];
        
        
        //bottom boundary
        for(int j=col-2; j>=0; j--)
            sum += mat[row-1][j];
        
        
        //left boundary
        for(int i=row-2; i>=1; i--)
            sum += mat[i][0];
        
        
        //diagonal
        int i=1;
        int j=1;
        while(i<row-1 && j<col-1){
			sum += mat[i][j];
            i++;
            j++;
        }
       
        
        //diagonal
        i=1;
        j=col-2;
        while(i<row-1 && j>=1){
            if(i != j)
              sum += mat[i][j];
            i++;
            j--;
        }
            
        System.out.println(sum);
        
        
	}

}