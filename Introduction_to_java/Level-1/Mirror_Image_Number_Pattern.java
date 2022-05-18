/**
 Question:
 Print the following pattern for the given N number of rows.
Pattern for N = 4
...1
..12
.123
1234
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
        
       for(int i=1; i<=n; i++){
           int space = n - i;
           while(space > 0){
               System.out.print(" ");
               space--;
           }
               
           
           for(int j=1; j<=i; j++)
               System.out.print(j);
           
           System.out.println();
       }

		
	}

}
