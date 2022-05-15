/*
Question:
Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
Round off the total salary and then print the integral part only.

*/

import java.util.Scanner;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        double total_salary = 0;
        int basic = sc.nextInt();
        String str = sc.next();
        char grade = str.charAt(0);
        
        double hra = basic * 0.20;
        double da = basic * 0.50;
        double pf = basic * 0.11;
        
        if(grade == 'A')
            total_salary = (basic + hra + da + 1700 - pf);
        else if(grade == 'B')
			total_salary = (basic + hra + da + 1500 - pf);
        else
            total_salary = (basic + hra + da + 1300 - pf);
        
        System.out.println(Math.round(total_salary));
	}
}