/**
 Question:
 Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.
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
        
        for(int i=2; i<=n; i++){
            boolean checker = true;
            
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j == 0){
                    checker = false;
                    break;
                }
            }
            
            if(checker)
                System.out.println(i);
        }
		
	}
}
