/**
 Question:
 Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
    F(n) = F(n-1) + F(n-2), 
    Where, F(1) = F(2) = 1
Provided N you have to find out the Nth Fibonacci Number.
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
        
        System.out.println(fibonacci(n));        		
	}
    
    public static int fibonacci(int n){
        if(n == 1)
            return 1;
        else if(n <= 0)
            return 0;
             
        return (fibonacci(n-1)+ fibonacci(n-2));
    }

}
