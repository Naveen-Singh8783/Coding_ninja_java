/*
Question:
Print the following pattern for the given number of rows.
Note: N is always odd.
Pattern for N = 5
    *
   * *
  * * *
   * *
    *

The dots represent spaces.
*/
import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int space = n/2;
        int star = 1;
        int i = 1;
        while(i<=n/2+1){
               
            	for(int j=1; j<=space; j++)
                    System.out.print(" ");
                
                for(int j=1; j<=star; j++)
                    System.out.print("*");
                
                System.out.println();
                space--;
                star+=2;
                i++;
        }
        
        space++;
        star-=2;
        
        while(i<=n){
                space++;
                star-=2;
                
                for(int j=1; j<=space; j++)
                    System.out.print(" ");
                
                for(int j=1; j<=star; j++)
                    System.out.print("*");
                
                System.out.println();
            	i++;
        }
        
    }
}