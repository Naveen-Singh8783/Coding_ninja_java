/**
 Question:
 Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG
 
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
        char ch1 = 'B';
        int j = 0;
        for(int i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print(ch);
                if(j == 2)
                    ch1 = ch;
            	ch+=1;    
            }      
            System.out.println();
            ch = ch1;
        }

		
	}

}
