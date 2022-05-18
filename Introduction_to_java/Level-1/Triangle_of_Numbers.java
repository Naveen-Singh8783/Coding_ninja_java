/*
Question:
Print the following pattern for the given number of rows.
Pattern for N = 4
   1
  121
 12321
1234321

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
        
        int i = 1;
        while(i<=n){
		  
          int space = 1;
            while(space <= n-i){
                System.out.print(" ");
                space+=1;
            }
            
            int num = i;
            int j = 1;
            while(j <= i){
                System.out.print(num);
                j++;
                num++;
            }
            
            num-=2;
            while(num >= i){
                System.out.print(num);
                num--;
            }
        	
            System.out.println();
            i++;
        }
	}
}
