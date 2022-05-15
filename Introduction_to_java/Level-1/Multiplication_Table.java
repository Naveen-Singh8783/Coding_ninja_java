/*
Question:
Write a program to print multiplication table of n.

*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int i=1; i<=10; i++)
            System.out.println(n*i);

	}
}