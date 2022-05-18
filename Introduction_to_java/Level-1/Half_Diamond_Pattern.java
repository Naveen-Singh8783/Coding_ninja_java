/*
Question:
Write a program to print N number of rows for Half Diamond pattern using stars and numbers
*/

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = n*2+1;
        int max = 0;
      	
        if(n == 0)
            System.out.println("*");
        
        for(int i=1; i<=row; i++){
            if(i == 1 || i == row){
               System.out.print("*");  
            }   
            else{
                
        		int num = 1;
                boolean checker = true;
                System.out.print("*");
            	while(num>0){
                    System.out.print(num);
                    if(num < max && checker){
                        num++;
                    }else{
                        num--;
                        checker = false;
                    }
                     
                }
           		 System.out.print("*");
                
            }
           System.out.println();
           if(i < n+1)
                max++;
            else
                max--;
            
        }
    }
}