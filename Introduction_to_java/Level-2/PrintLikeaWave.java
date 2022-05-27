/**
 Question:
 For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order, i.e, print the first column top to bottom, next column bottom to top and so on.
 */

public class Solution {

	public static void wavePrint(int mat[][]){
        
        if(mat.length <= 0)
            return;
		//Your code goes here
        boolean flow = true;
        int i=0;
        int j=0;
        
        while(j < mat[0].length){
            if(flow){
                int z = 0;
                while(z < mat.length ){
                    System.out.print(mat[z][j]+" ");
                    z++;
                }
                flow = false;
                    
            }else{
                int z = mat.length-1;
                  while(z >= 0 ){
                    System.out.print(mat[z][j]+" ");
                    z--;
                }
                flow = true;
            }
            
            j++;
        }
	}

}