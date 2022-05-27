/**
 Question:
 For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
 */

public class Solution {

	public static void findLargest(int mat[][]){
		//Your code goes here
        if(mat.length == 0){
            System.out.println("row 0 -2147483648");
            return;
        }
        
        int row = mat.length;
        int col = mat[0].length;
      
        int col_max_sum = Integer.MIN_VALUE;
        int row_max_sum = Integer.MIN_VALUE;
        
        int row_index = 0;
        int col_index = 0;
        
        for(int i=0; i<row; i++){
			int sum = 0;
            for(int j=0; j<col; j++)
                sum += mat[i][j];
            
            if(sum > row_max_sum){
                row_max_sum = sum;
                row_index = i;
            }
                
        }
        
        for(int i=0; i<col; i++){
            int sum = 0;
            for(int j=0; j<row; j++)
                sum += mat[j][i];
            
            if(sum > col_max_sum){
                col_max_sum = sum;
                col_index = i;
            }
                
        }
        
        
        if(row_max_sum >= col_max_sum)
            System.out.println("row "+row_index+" "+row_max_sum);
        else
           System.out.println("column "+col_index+" "+col_max_sum); 
	}

}