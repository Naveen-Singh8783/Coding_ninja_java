/**
 Question:
 Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
If C is equal to -
 1, then print the sum
 2, then print the product
 Any other number, then print '-1' (without the quotes)
 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        
        if(c == 1)
            System.out.println((n*(n+1))/2);
        else if(c == 2){
            int product = 1;
            while(n >= 1){
                product *= n;
                n--;
            }
            System.out.println(product);
        }
            
        else
            System.out.println(-1);

	}
    
}
