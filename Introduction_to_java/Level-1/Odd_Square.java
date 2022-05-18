/**
 Question:
 Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start_row = 1;
        int max_odd = 1;
        for(int i=2; i<=n; i++)
        	max_odd+=2;
        
        for(int i=1; i<=n; i++){
            int odd = start_row;
            int min_odd = 1;
            
            for(int j=1; j<=n; j++){
                if(i==1){
                    System.out.print(odd);
                    odd+=2;
                }else{
                    if(odd <= max_odd){
                        System.out.print(odd);
                        odd+=2;
                    }else{
                        System.out.print(min_odd);
                        min_odd+=2;
                    }
                }
            }
            System.out.println();
            start_row+=2;
        }
	}
}
