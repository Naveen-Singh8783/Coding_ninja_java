/**
Question:
Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
 
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
        char ch = (char)('A'+ n );
        for(int i=1; i<=n; i++){
            ch = (char)(ch-i);
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch = (char)(ch+1);
			}
                
            
            System.out.println();
            
        }

		
	}

}
