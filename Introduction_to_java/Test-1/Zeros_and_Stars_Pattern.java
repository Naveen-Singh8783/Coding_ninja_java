/**
Question:
Print the following pattern
Pattern for N = 4

*000*000*
0*00*00*0
00*0*0*00
000***000

 */

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==j)
                    System.out.print("*");
                else
                    System.out.print("0");
            }
            
            System.out.print("*");
            
            for(int j=n; j>=1; j--){
                if(i==j)
                    System.out.print("*");
                else
                    System.out.print("0"); 
            }
            
            System.out.println();
        }
		
	}	


}
