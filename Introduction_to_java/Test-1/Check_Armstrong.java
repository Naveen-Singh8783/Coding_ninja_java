/**
Question:

Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
For example,
371, as 3^3 + 7^3 + 1^3 = 371
1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634

 */

import java.util.Scanner;
import java.lang.Math;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits = String.valueOf(n).length();
        int sum = 0;
        
        int num = n;
        
        while(num > 0){
            int rem = num%10;
            num /= 10;
            
            sum += (int)(Math.pow(rem, digits));
        }
        
        if(sum == n)
            System.out.println("true");
        else
            System.out.println("false");
        

	}
}
