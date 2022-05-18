/*
Question:
Write a program to print parallelogram pattern for the given N number of rows.
For N = 4
****
 ****
  ****
   ****
The dots represent spaces.
*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        int space = 0;
        
        
        for(int i=1; i<=star; i++){
            for(int j=1; j<=space;j++)
                System.out.print(" ");
            
            for(int j=1; j<=star;j++)
                System.out.print("*");
            
            System.out.println();
            space++;
        }
	}
}
