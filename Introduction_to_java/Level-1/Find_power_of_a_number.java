/*
Question:
Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.

*/

import java.util.Scanner;
import java.lang.Math;

public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        
        System.out.println(Math.round(Math.pow(x, n)));
        
    }
}