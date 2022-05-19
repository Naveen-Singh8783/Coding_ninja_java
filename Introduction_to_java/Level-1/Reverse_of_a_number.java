/**
 Question:
 Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.
 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean checker = true;
        
        if(n == 0){
            System.out.print(0);
            return;
        }
        
        while(n != 0){
            if(n%10 == 0 && checker){
                
            }else{
                System.out.print(n%10);
                checker = false;
            }
            n/=10;
        }
        
	}
}
