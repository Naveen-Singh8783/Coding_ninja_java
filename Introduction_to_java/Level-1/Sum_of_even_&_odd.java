/*
Question:
Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.

*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum_even = 0;
        int sum_odd = 0;
        
        while(n > 0){
            int num = n%10;
            if(num%2 == 0)
                sum_even+=num;
            else
                sum_odd+=num;
            
        	n = n/10;
        }
        
        System.out.println(sum_even+" "+sum_odd);

	}
}
