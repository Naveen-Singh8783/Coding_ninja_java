/*

Question:
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1

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
        int num = n;
        
        for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++)
                System.out.print(num);
            num--;
            System.out.println();
        }
		
	}

}
