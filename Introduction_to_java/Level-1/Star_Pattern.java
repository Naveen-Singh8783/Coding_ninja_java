/*
Question:
Print the following pattern
Pattern for N = 4
    *
   * *
  * * *
 * * * *

The dots represent spaces.

*/

import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = n-1;
        
        for(int i=1; i <=n; i++){
            
            for(int j=1; j<=space; j++)
                System.out.print(" ");
            
            for(int j=1; j<=star; j++)
                System.out.print("*");
            
            System.out.println();
            star+=2;
            space-=1;
        }
		
	}

}
