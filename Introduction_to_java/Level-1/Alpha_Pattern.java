/*
Question:
Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC

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
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                System.out.print(ch);
            
            System.out.println();
            ch+=1;
        }

		
	}

}
