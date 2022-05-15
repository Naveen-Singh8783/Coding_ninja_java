/*
Question: 
Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet

*/



import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        String str = s.next();
        
        int ascii_value = str.charAt(0);
        
        if(ascii_value >= 65 && ascii_value <= 90)
            System.out.println(1);
        else if(ascii_value >= 97 && ascii_value <= 122)
            System.out.println(0);
        else
            System.out.println(-1);

    }
}