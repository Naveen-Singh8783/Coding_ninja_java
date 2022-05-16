/*
Question:
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321

 */

import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=i; j>=1; j--)
                System.out.print(j);
            
            System.out.println();
        }

		
	}

}
